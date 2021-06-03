## Spring + SQLite + Thymeleaf = :heart:

This is a simple template/demo project containing a database, controller logic and a basic view as well.
The motivation for this project is to create a template and workflow that
- uses as little resources as possible
- is as easy to set up as possible
- uses mostly Java for handling data and views too

![Screenshot](https://github.com/szabodanika/spring-sqlite-webapp-demo/blob/master/screenshot.jpg)

### Database

This project uses SQLite3 as its database. The database file is in db/data, but can be changed in application.properties.
Because SQLite3 is not natively supported by JPA, a dialect was created in SQLiteDialect.java and selected in the
same property file and org.xerial.sqlite-jdbc was imported using Maven. With this setup writing SQL is completely
avoidable.

### Business Logic

There is not much logic written in this app, I tried to keep it minimalistic. There is a basic JPA repository for
Camera data that allows reading and writing. The service layer was completely omitted and the repository is used in
the controller, in the two endpoints: one to display all cameras stored and one to store a camera received from the
form. 

### View Layer

To keep the project simple, we are using Thymeleaf: a very readable template engine with great Spring support. This
is part is possibly the easiest to replace with another view layer framework, if you would like to use another
template engine or even a different front-end framework completely, like VueJS. I also imported Bootstrap 5, so it
 really is ready to become a full-stack webapp.

## How to Use it

The easiest way to use it is probably to download this repository or to fork it, then modify it. There are very few
 unnecessary or custom parts in it so you can use this as a starting point, or you can create a clean, new project
  and copy parts from this one. 
  
Once you have a copy of the project, simply run it with `mvn spring-boot:run`.

