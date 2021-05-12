



## *OpenAPI* *PetStore*

This is an implementation of the *Swagger Petstore* based on *TestNG* framework built in *Maven*.

****

### Libraries

```java
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.3.2</version>
    <scope>test</scope>
</dependency>
```



```java
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.6</version>
</dependency>
```



```java
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.1.0</version>
    <scope>test</scope>
</dependency>
```

### Configuration

- *BASE_URL* = https://petstore3.swagger.io
- *GET_ENDPOINT* =`/api/v3/pet/`
- *POST_ENDPOINT* =`/api/v3/pet`
- *PUT_ENDPOINT* =`/api/v3/pet`
- *DELETE_ENDPOINT* =`/api/v3/pet/`

*id*=`2245`

### Utilities

*ConfigurationRW* reads and writes properties file.

### **POJO Classes**

*PetStorePOJO* Package  created, under this package separate Java classes created for corresponding each payload objects.

For each class private class variables declared, constructors put, getter and setter methods, toString  method added.

For testing purposes, a class created named PetTest. Pet object created, using setter and getter methods value of variable updated and read.

Sending different requests like POST,PUT,DELETE,GET, response status code and response body and header verified

*public class PetTest* {

}`
    Pet pet = new Pet();`


    @BeforeClass
    public static void setup() {
        baseURI=ConfigurationRW.get("BASE_URL");
    
    }



### License

[Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0)

















