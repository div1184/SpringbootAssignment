# Documentation
Assignment Project
----
Create a Spring Boot REST app that exposes endpoints
application port is running on 8888
base path: http://localhost:8888/

Im Memory Database : H2

By default in-memory database is void, hence execute the below scripts to add user roles

roles.sql file available under path  src/main/resources/roles.sql

 execute  src/main/resources/roles.sql file to load roles

User Registration API
=====================
URL

api/auth/signup

full URL with path: http://localhost:8888/api/auth/signup

* **Method:**
 
`POST` 
  
**URL Params**
 Content-Type: application/json
 
  **Required:**
 `username`,`password`,`email`,`name`
 
   **Optional:**
   `role`

* **Data Params**
{
  "name": "divakar",
  "username": "divakar",
  "role": ["user"],
  "password": "123456",
  "email": "info@gmail.com"
 }
 
* **Success Response:**
User registered successfully!


* **Error Response:**

Fail -> Username is already taken!
Fail -> Email is already taken!

* **Notes:**

To signup user details

Authenticate User API
=====================

URL

method:

api/auth/signin

full URL with path: http://localhost:8888/api/auth/signin

* **Method:**
 
`POST` 
  
**URL Params**

  Content-Type: application/json
  
  **Required:**
 `username`,`password`
 

* **Data Params**
{
  "username": "divakar",
  "password": "123456",
 }
 
* **Success Response:**
{
    "userData": {
        "id": 1,
        "name": "divakar",
        "username": "divakar",
        "email": "info@gmail.com",
        "password": "",
        "imgurId": null,
        "imgurLink": null,
        "roles": [
            {
                "id": 1,
                "name": "ROLE_USER"
            }
        ]
    },
    "data": null,
    "image": null,
    "timestamp": null,
    "status": null,
    "error": null,
    "message": null,
    "path": null,
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkaXZha2FyIiwiaWF0IjoxNTY0OTg3NTc5LCJleHAiOjE1NjUwNzM5Nzl9.shhVDIu_YF8uIngCjx2zdcSeVkHzSW276nwVmPZDVF5Z4HHnkmt8kRR0sLT5dNYUyASDYZdvQVbjS2OdLAlKvA",
    "tokenType": "Bearer"
}


* **Error Response:**

{
    "userData": null,
    "data": null,
    "image": null,
    "timestamp": null,
    "status": 401,
    "error": null,
    "message": "Bad credentials",
    "path": null,
    "accessToken": "",
    "tokenType": "Bearer"
}

* **Notes:**

To signin user details

Upload Image to Imgur API
=========================

URL

method:
api/auth/image/upload

full URL with path: http://localhost:8888/api/auth/image/upload

* **Method:**
 
`POST` 
  
**URL Params**

 Content-Type: application/x-www-form-urlencoded

  **Required:**
 `username`,`password`,`file`
 

* **Data Params**
file : (upload image file)
username: divakar
password: 123456

* **Success Response:**
{
    "data": {
        "id": 1,
        "name": "divakar",
        "username": "divakar",
        "email": "info@gmail.com",
        "password": "",
        "imgurId": "4TAyqn9",
        "imgurLink": "https://i.imgur.com/4TAyqn9.png",
        "roles": [
            {
                "id": 1,
                "name": "ROLE_USER"
            }
        ]
    },
    "message": "uploaded success",
    "messageKey": "uploaded.success",
    "success": true
}


* **Error Response:**

{
    "timestamp": "2019-08-05T06:55:01.584+0000",
    "status": 400,
    "error": "Bad Request",
    "message": "Required request part 'file' is not present",
    "path": "/api/auth/image/upload"
}

* **Notes:**

To Imgur api to upload file

delete Image to Imgur API
=========================

URL

api/auth/image/delete

full URL with path: http://localhost:8888/api/auth/image/delete

* **Method:**
 
`POST` 
  
**URL Params**

 Content-Type: application/json

  **Required:**
 `username`,`password`,`imageId`
 

* **Data Params**
{
		"username":"divakar",
	"password":"123456",
	"imageId":"4TAyqn9"
}

* **Success Response:**
{
    "data": {
        "id": 1,
        "name": "divakar",
        "username": "divakar",
        "email": "info@gmail.com",
        "password": "",
        "imgurId": null,
        "imgurLink": null,
        "roles": [
            {
                "id": 1,
                "name": "ROLE_USER"
            }
        ]
    },
    "message": "delete success",
    "messageKey": "delete.success",
    "success": true
}


* **Error Response:**

{
    "message": "Bad credentials",
    "messageKey": "delete.failure",
    "success": false
}

* **Notes:**

To Imgur api to delete file

View Image to Imgur API
=======================

URL

api/auth//image/view

full URL with path: http://localhost:8888/api/auth/image/view

* **Method:**
 
`POST` 
  
**URL Params**

 Content-Type: application/json

  **Required:**
 `username`,`password`,
 

* **Data Params**
{
		"username":"divakar",
	"password":"123456"
}

* **Success Response:**
{
    "data": {
        "id": 1,
        "name": "divakar",
        "username": "divakar",
        "email": "info@gmail.com",
        "password": "",
        "imgurId": "vFiPMZ7",
        "imgurLink": "https://i.imgur.com/vFiPMZ7.png",
        "roles": [
            {
                "id": 1,
                "name": "ROLE_USER"
            }
        ]
    },
    "message": "view success",
    "messageKey": "delete.success",
    "success": true
}


* **Error Response:**

{
    "message": "view failure",
    "messageKey": "delete.failure",
    "success": false
}

* **Notes:**

To Imgur api to view file

Executable jar file locaton
===========================

Assignment-0.0.1-SNAPSHOT.jar file available under path  Executable_jar_file/Assignment-0.0.1-SNAPSHOT.jar

Executable jar command 
======================
java -jar Assignment-0.0.1-SNAPSHOT.jar

