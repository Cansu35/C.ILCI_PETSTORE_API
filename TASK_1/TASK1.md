### TASK 1 : 

***Explore and describe 3 key scenarios for booking a hotel. Produce a concise write-up***
***of what you discovered when exploring these scenarios (use a markdown-formatted text***
***file*).**

**1.Exploration target: what scenario are you exploring? What’s the functionality?**

-  First scenario: As a user I should be able to make reservation successfully.
  As a user I should be able to select available room types. Once numbers of rooms and types of rooms are selected, I have to see availability of each room of that type. Once booking confirmed, user will be able to get confirmation status as reserved.

- Second scenario: As a user when I enter number of adults and children I should be able to see hotel availability.
  If hotel is capable of accommodating 33 adults and 33 children, during booking modification it must be available below and equal to this number of customers
  If hotel is capable of accommodating 33 adults and 33 children, during booking modification it must be unavailable above this number of customers.
- Third scenario: As a user I should be able to make reservation with given dates.
   As a customer I should be able to make reservation to the available rooms and dates
   As a customer I shouldn't be able to make reservation to the unavailable rooms and dates

  **2.Does the site behave as you would expect? Did you discover anything that looks like**
  **a bug? Did you see anything you think could be improved?**

   At first it didn't work as expected at all, featured hotels section was close. I was searching a hotel for booking but all time the                was giving 'No Results Found' message. After couple of days it's optimized, most of the functionalities worked well. 

-As bug I discovered that however check-in and check-out dates seem unavailable, system allowed me to make reservation.
-Even if total numbers of adults and children is less than or equal to hotel availability, user can't select room types and numbers.
-Once numbers of rooms and types selected, user can't see availability of each specific room of that type ,expected to see.
-After booking confirmation, however it doesn't offer payment method options, it gives 'Your payment status is unpaid' warning.
Some translation, overview, review content errors exist. Location map functionality, gallery photos don't reflect reality should be improved. Some images can't be uploaded. Under Related Hotels not expected to see unrelated hotels. Privacy policy as well should be more detailed. These are the small but important ones that it can affect and create bad impression on the company.

 **3.Prioritization of those use cases - which area of the website or testing would you explore first and why?**

In order to book, first I went to search functionality then filtered destination, check-in and check-out dates and numbers of people. Mostly focused on booking a stay in hotel functionalities and tested such as available rooms functionality, room types, room options, select room using modify module. Because these are the areas which is important can cause an issue related to booking later.

 **4.What kind of risks do you need to mitigate for this type of application?**

*Schedule Risk-->*Time is not estimated properly for the project, functionalities for the software are not identified in a timely manner that results in affecting the time required for developing these functionalities.

*Budget Risk*-->Once budget estimation is incorrect and project scope expansion

*Operational or Management*--> Risks mostly occur when team structure is not clear and during lack of communication among team members.

*Technical Risks-*-> Results from continuous changing requirements or difficult project modules integration.