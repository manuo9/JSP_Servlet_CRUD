# JSP_Servlet_CRUD

This is a dynamic web project built using JSP (JavaServer Pages) and Servlets for basic CRUD (Create, Read, Update, Delete) operations. The project uses MySQL as the database to store user information.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project serves as a template for building web applications in Java with a focus on dynamic content generation. It provides a simple CRUD functionality for managing user data, demonstrating the use of JSP and Servlets in a web application.

## Features

- User registration
- User login
- Displaying a list of users
- Updating user information
- Deleting user accounts

## Technologies Used

- Java
- JSP (JavaServer Pages)
- Servlets
- MySQL
- HTML
- CSS
- Tomcat Server

## Project Structure

The project structure is organized as follows:

- `src/com/assignment/db/servlet`: Servlet classes for handling CRUD operations.
- `src/com/assignment/db/entity`: Entity class representing user data.
- `src/com/assignment/db`: Database connection class.
- `WebContent`: Contains JSP files, CSS files, and other web resources.

## Setup Instructions

1. Clone the repository.
2. Set up a MySQL database and update the connection details in `DbConnection.java`.
3. Deploy the project on a servlet container like Apache Tomcat.

## Usage

1. Register a new user by accessing `register.jsp`.

  ![Screenshot (127)](https://github.com/manuo9/JSP_Servlet_CRUD/assets/122933806/d619ce5b-cbda-4b5b-88a0-8eefc710b27a)


2. Update user information by clicking on the "Update" link.

 ![Screenshot (129)](https://github.com/manuo9/JSP_Servlet_CRUD/assets/122933806/d0d46547-dac7-401d-882f-b749fe07c3ef)

3. Delete a user by clicking on the "Delete" link.

 ![Screenshot (128)](https://github.com/manuo9/JSP_Servlet_CRUD/assets/122933806/ce8842a6-5707-4095-9285-0e10942e1c3d)

4. List Users Data.

![Screenshot (126)](https://github.com/manuo9/JSP_Servlet_CRUD/assets/122933806/37054c79-c314-4cb4-9192-268072e270ee)
<hr>

![Screenshot (125 2)](https://github.com/manuo9/JSP_Servlet_CRUD/assets/122933806/9ea38b9c-e12e-40b1-9c44-0b6a609fca0a)


## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

This project is licensed under the [MIT License](LICENSE).

