# User Management system

# Requirments
IntelliJIDEA
* Serverport: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)

## Steps to run User Management System
* Download the source code and import in intellijIDEA.
* Go to localhost:8080/ URL * Type endpoints in The
* UserIdURL user will have the following details
* id
* Name
* UserName
* Address
* Phone Number
User will perform following operations -
### -> Add User Info - 
In AddUser functionality we Post User info through Postman and it gets added to the User list -
* End point-http://localhost:8080/api/v1/user-management/add-user
### -> Get User Info by UserId -
In this functionality we provide a perticular User info by sending the userid in url through @Pathvariable -
* Endpoint-http://localhost:8080/api/v1/user-management/find-user/id/{id}
### Get all User Info -
This functionality provides all User info list -
* Endpoint- http://localhost:8080/api/v1/user-management/find-all
###  Update User Info by UserId-
This functionality Updates a perticular User info through Postman by sending userid in url -
* Endpoint -> http://localhost:8080/api/v1/user-management/update-user/id/{id}

###  Delete User Info by UserId-
This functionality deletes particular User info through Postman using the Delete method by sending the user-id in URL-
* Endpoint-> http://localhost:8080/api/v1/user-management/delete-user/id/{id}
## Note
* You can change server port by setting properties in application.properties file i.e.
   server.port=8081
