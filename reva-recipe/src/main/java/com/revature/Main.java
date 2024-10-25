package com.revature;

import java.sql.SQLException;

/**
 * The Main class serves as the entry point for the application.
 * It initializes and manages various components related to recipes, chefs, 
 * ingredients, and authentication services. This class contains static 
 * references to the utility classes and controllers required for the 
 * application to function correctly.
 */

public class Main {

    /** 
     * Instance of JavalinAppUtil for application utility functions.
     */
    
    private static JavalinAppUtil JAVALIN_APP_UTIL;

    /** 
     * Controller for managing recipe-related requests.
     */
    
    private static RecipeController RECIPE_CONTROLLER;

    /** 
     * Service class for handling recipe business logic.
     */
    
    private static RecipeService RECIPE_SERVICE;

    /** 
     * Data Access Object for interacting with recipe data storage.
     */
    
    private static RecipeDao RECIPE_DAO;

    /** 
     * Utility class for managing database connections.
     */
    
    private static ConnectionUtil CONNECTION_UTIL;

    /** 
     * Data Access Object for interacting with chef data storage.
     */
    
    private static ChefDao CHEF_DAO;

    /** 
     * Service class for handling chef-related business logic.
     */
    
    private static ChefService CHEF_SERVICE;

    /** 
     * Service class for managing user authentication.
     */
    
    private static AuthenticationService AUTH_SERVICE;

    /** 
     * Controller for managing authentication-related requests.
     */
    
    private static AuthenticationController AUTH_CONTROLLER;

    /** 
     * Data Access Object for interacting with ingredient data storage.
     */
    
    private static IngredientDao INGREDIENT_DAO;

    /** 
     * Service class for handling ingredient-related business logic.
     */
    
    private static IngredientService INGREDIENT_SERVICE;

    /** 
     * Controller for managing ingredient-related requests.
     */
    
    private static IngredientController INGREDIENT_CONTROLLER;

    /** 
     * Middleware for administering administrative functionalities.
     */
    
    private static AdminMiddleware ADMIN_MIDDLEWARE;

    /**
     * The main method serves as the entry point for the application.
     * It initializes the application context and starts the server.
     *
     * @param args Command line arguments passed during application startup.
     */
    
    public static void main(String[] args) {
        // Application initialization logic goes here.
    }
}

