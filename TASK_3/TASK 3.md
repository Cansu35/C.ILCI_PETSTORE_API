

### TASK 3:

 ***Consider the tests you wrote for part 2 (you either wrote browser-based tests or API tests).***
***Explain the following:***

**1. In terms of the different testing categories that describe the scope of the test, how would you describe the type of test you have just written?**

--><u>Back End API Testing</u> 

  Actually there are three of layers in application architecture that I am capable of doing UI, Backend and Database. Here I preferred API testing. Since the application design starts from the reverse right side, so people first build the database,they pick the database,they design the database schema, primary keys, foreign keys, everything ready, then they build business logic.
We can find all the possible bugs in the beginning of application development, in the business logic. The bug that you're gonna find will be easier to solve, cheaper to solve. If you have problem in  business logic of application, basically, it will affect your customers, it's going to affect your service that you are providing. Also without UI, it can be tested earlier in the lifecycle,it is also faster GUI testing, faster than Selenium.

Here basically we verify each Rest API endpoint is working as expected or not, based on documentation which is Swagger endpoints returning information as expected or not. We verify response status code and response body and header,sending different request types such as get, post, put, delete. 

 **2.Outline the possibilities of automating these specific test cases in different scopes,**
**together with a short summary of the pros and cons of each of them.**

-->There are different practices involved with API testing which typically involve the Unit, Performance, Load, Runtime Error, Security, WebUI, Penetration, Fuzz Tests.

| Pros of Unit Testing                                      | Cons of Unit Testing                                         |
| --------------------------------------------------------- | ------------------------------------------------------------ |
| More reusable code and easier debugging.                  | Human factor. A developer can make a mistake that will impact whole system. |
| Increased efficiency of code improvement and maintenance. | Not all errors can be detected,since every module it tested separately and  later different integration bugs appear. |
| Errors can be detected at the early stages of the SDLC.   |                                                              |

| Pros of Performance Testing                                  | Cons of Performance Testing                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| This test is in place to check the performance of more diverse operations such as response time,reliability,speed and functionality of the program. | Some functional errors are only visible under load. There is a chance for not detecting such errors while doing this testing. |
| Doesn’t focus on defects,but rather on eliminating performance blockage of the software. | .If testing is not performed on various devices,it might cause variation in results so user experience difficulties |

| Pros of Functional Testing                                   | Cons of Functional Testing                                   |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| It ensures the proper working as expected of all the functionalities of an application. | It can miss critical as well as logical errors in the system. |
| The risks and loss reduced.                                  | Can not guarantee the readiness of the application to live.  |
| Performed from the perspective of the users allow us creating scenarios that represent the real world ones. |                                                              |

| Pros of Load Testing                                         | Cons of Load Testing                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| This function works to validate the performance under specific load requirements. | Does not simulate real users interacting with elements of your webpage. |
| This determines how the application will work together with numerous users concurrently. | It doesn't give you an idea of how user-friendly your application is |

| Pros of Runtime and Error Detection                          | Cons of Runtime and Error Detection                          |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| This will let us know how well the API performs if it's implemented in a given scenario. By seeing errors in runtime your team will be motivated to develop better code. | Testing for errors can also be very demanding. And if you focus too much on the presence of individual errors you may end up suffering from tunnel  vision throughout the testing process |

| Pros of UI Testing                                           | Cons of UI Testing                                           |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| If these tests result in better user experience,you’ll have higher chances of the API being integrated—and higher profits to speak for it. | UI testing isn't a sufficient replacement for functional testing,Good UI test results can’t substitute the more thorough insights of functional tests. |

| Pros of Validation Testing                                   | Cons of Validation Testing                                   |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Validation testing is where you can expect to get a bird’s eye view of the API product .This is especially helpful in the later stages of development, where everyone’s goals should be aligning. | It can be difficult. Sometimes, when you find a problem  it requires you to go back the drawing board. |

  **Security Testing**
 The last category includes tests that are done for security audit purposes, comprising the following:

-Security tests that validate encryption methodologies and the API’s access control solution
-Penetration tests that evaluate the threat vector from an outsider to the API, assuming malicious intent
-Fuzz tests that input random noise or “fuzz” and instigate a forced crash from the API.

| Pros of Security  Testing                                    | Cons of Security Testing                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| All three of these are done to see what happens in the worst-case scenarios for the API. Thus, they can be the basis for appropriate security solutions. | API development teams tend to get complacent about security testing. |
|                                                              | But you can't assume that the finished API product will be secure %100 of the time. Testers must be thorough in dealing with potential threats to the API security. |

