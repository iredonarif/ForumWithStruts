# Forum web application with Struts 2

This is a basic forum developed when i was learning how to develop JEE web applications with Struts framework in my third year of computer science.
See: https://struts.apache.org/

## Overview
Basic Forum that allows users to post messages (question/response). The list of questions are displayed on the home page. This home page contains two button: Ajouter Question (Add Question) & Inscription (Registration).

The home page is accessible by everyone but the rest of the site requires an authentication.

All fields of the registration page are required and the person must have at least 16 years old before being able to subscribe.

The application data is stored in a PostgreSQL database
...

## How to start

### What you will need
- Java
- Ant
- Postgresql
- Application Server (Tomcat, Wildfly, ...)

### Process
- Clone the project

- Create the database (forum) and the necessary tables: you will find the sql code to do this at **`src/forum/sql/ddl.sql`**

- Update db credentials in **`src/forum/dao/Connection.java`** file to match your database credentials.

- To build the application's war file run ant archive from the project's root folder.
This command will create a build folder and will create the war file in the dist folder.

- Copy the war file to your Servlet container (e.g. Tomcat / WildFly) and then startup the Servlet container.

- In a web browser go to: http://localhost:8080/ForumWithStruts/accueil
You should see a web page with "Bienvenue sur notre Forum" (Welcome to our forum).

## Note
* For building and copying the war file, I wrote the commands in the **``compile.sh``** file. So i will just need to run the compile.sh file. But i used Wildfly as application server. You can do the same thing for others (like Tomcat, ...) too.

* The project class diagram can be found in the **`docs`** folder at the root of the project

* The postgresql driver jar file is saved in **`WebContent/WEB-INF/lib/`**

* Page styling is not done; because the goal is to learn JEE - Struts
