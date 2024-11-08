# Project: RecipeHub (Back-End)

## Background
This project is a Java-based backend application designed to manage recipes, chefs, and ingredients, using object-oriented programming principles and a relational database. The application restricts access to certain functionalities to admin users and uses a layered architecture structure.

### Getting Started
- Navigate to `main/java/com/revature/model` and familiarize yourself with the files within the package. These files represent the domain objects of this program. They do not need to be edited.
- The `DAO` layer will be expected to handle pagination operations, so you will ensure these classes interact with a generic `Page` class and a `PageOption` class. Pagination is a technique used in applications to break down large sets of results (such as those returned from a database query) into smaller, more manageable chunks, or pages. Both of the pagination related files can be found under the `main/java/com/revature/util` folder. These files do not need any revisions, but ensure that you familiarize yourself with these files.
- There is also a `ConnectionUtil.java` file in the `main/java/com/revature/util` folder. You should also review, but not edit, this file in order to understand how the application will access the database.

## Requirements

### 1: The application should provide a database setup script.
Located within the `main/resources` folder, the file `sqlScipt.sql` should be present. The file's purpose is to contain database setup statements, including creating, connecting, and populating tables. Read the SQL comments in the file in order to complete the below tasks:
- Complete the `CREATE TABLE` statement that represents a `Chef` entity in your database.
- Complete the `CREATE TABLE` statement that represents a `Recipe` entity in your database.
- Complete the `CREATE TABLE` statement that represents an `Ingredient` entity in your database, as well as a join table named `RecipeIngredient` that manages the relationships between this table and the `Recipe` table.

### 2: The application should be able to perform CRUD operations on recipes as well as search recipes by terms.
Review the following files and their related javadoc comments in order to ensure the user can retrieve, create, update, and delete recipes, as well as search for them by providing a search term:
- `src/main/java/com/revature/dao/RecipeDAO.java`
- `src/main/java/com/revature/service/RecipeService.java`
- `src/main/java/com/revature/controller/RecipeController.java`

### 3: The application should be able to perform CRUD operations on ingredients as well as search ingredients by terms.
Review the following files and their related javadoc comments in order to ensure the user can retrieve, create, update, and delete recipes, as well as search for them by providing a search term:
- `src/main/java/com/revature/dao/IngredientDAO.java`
- `src/main/java/com/revature/service/IngredientService.java`
- `src/main/java/com/revature/controller/IngredientController.java`

### 4: The application should be able to perform CRUD operations on chefs as well as search chefs by terms.
Review the following files and their related javadoc comments in order to ensure the there is functionality to retrieve, create, update, and delete chefs, as well as search for them by providing a search term:
- `src/main/java/com/revature/dao/ChefDAO.java`
- `src/main/java/com/revature/service/ChefService.java`

### 5. The user should be able to log in, log out, and register a new chef.
Review the following files and their related javadoc comments in order to ensure the there is functionality to log in, log out, and register a new chef:
- `src/main/java/com/revature/service/AuthenticationService.java`
- `src/main/java/com/revature/controller/AuthenticationController.java`

Located within the `main/java/com/revature/util` folder, the file `AdminMiddleware.java` should be present. This file includes the `handle()`, `isProtectedMethod()` and `isAdmin()` methods so that only admins can create, delete, or update ingredients and only admins can delete recipes.



