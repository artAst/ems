Auphantum EMS (Employee Management System) Application
=====
Overview
------
The EMS Application also known as Employee Management System is a sofware application design to manage employees.
Here are the following modules included:

* Auphantum Spring Security - for rest authentication
* EMS client - contains frontend items
* EMS Api - contains rest API for the EMS core

Entities
------
None at the moment

Testing the app
------
Maven is used to run the unit tests in the app. 
Or you can run it in a [conventional way using this method](http://stackoverflow.com/questions/2235276/how-to-run-junit-test-cases-from-the-command-line)

Test packages are available in each module

In command line:
```
mvn test
```
To run all of the test items.

And
```
mvn -Dtest=MyServiceImplTest test
```
To run a single test item.