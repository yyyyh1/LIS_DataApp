# Data App
The project files are in master branch

## About the Project

This project realizes the input of data and validation of the required fields (name, title). If the required fields are null, an error message will be prompted when submitting. After clicking submit button, a confirmation page will pop up. After clicking confirm, the data will be submitted and after clicking cancel button, the submission will be canceled and return to the input page.


## Tech Stack

Java, SpringBoot, MySQL, MyBatis


## Run Locally

Clone the project

```bash
  git clone https://github.com/yyyyh1/LIS_DataApp.git
```

create a database in MySQL and execute sql script file "data-app.sql". Config the username and password of database in application.yml.

Open the project in IntelliJ IDEA and run the main() in DataEntryAppApplication.java

Using brower to access: http://localhost:8080/backend/form.html


