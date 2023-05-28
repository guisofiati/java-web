# STRUS 2 - CRUD

- XML Configutation
- JDBC 
- MySQL
- Docker

## How to run the project:
You can run the project by starting the docker-compose provided in root directory,
access localhost:8081 to get into _adminer_ (DBMS ). Manually create a new database called **struts2crud** and create also a table and its columns **(id autoincrement, name, number)**.

## Important:
- Copy _Maven Dependencies_ to **src/main/webapp/WEB-INF/lib**;
- Docker volumes will be stored at $YOUR_HOME_DIRECTORY/utils/docker/volumes/struts2crud;
- If application can not read **struts.xml** file try moving it to **src/main/resources/** folder;

## TODO:
- Update functionality