package com.revature.controller;

import com.revature.model.Chef;
import com.revature.service.AuthenticationService;
import com.revature.service.ChefService;
import io.javalin.Javalin;
import io.javalin.http.Context;

/**
 * The AuthenticationController class handles user authentication-related operations. This includes login, logout, registration, and managing the authorization filter. 
 * 
 * It interacts with the ChefService and AuthenticationService for certain functionalities related to the user.
 */
public class AuthenticationController {

    /** A service that handles chef-related operations. */
    private ChefService chefService;
    /** A service that handles authentication-related operations. */
    private AuthenticationService authService;



    /**
     * TODO: Implement a constructor that initializes the AuthenticationController with the parameters `chefService` and `authService`.
     * 
     * @param chefService the service used to manage chef-related operations
     * 
     * @param authService the service used to manage authentication-related operations
     */
    public AuthenticationController(ChefService chefService, AuthenticationService authService) {
    }


    /**
     * TODO: Registers a new chef in the system.
     * If the username already exists, responds with a 409 Conflict status and a result of "Username already exists".
     * Otherwise, registers the chef and responds with a 201 Created status and the registered chef details.
     *
     * @param ctx the Javalin context containing the chef information in the request body
     */
    public void register(Context ctx) {
        
    }

    /**
     * TODO: Authenticates a chef and uses a generated authorization token if the credentials are valid. The token is used to check if login is successful. If so, this method responds with a 200 OK status, the token in the response body, and an "Authorization" header that sends the token.
     * If login fails, responds with a 401 Unauthorized status and an error message of "Invalid username or password".
     *
     * @param ctx the Javalin context containing the chef login credentials in the request body
     */
    public void login(Context ctx) {
        
    }

    /**
     * TODO: Logs out the currently authenticated chef by invalidating their token.
     * If successful, responds with a 200 OK status and a result of "Logout successful".
     *
     * @param ctx the Javalin context, containing the Authorization token in the request header
     */
    public void logout(Context ctx) {

    }

    /**
     * TODO: Authorization filter to restrict access to certain routes.
     * Checks if a user is logged in and has admin privileges; if not, denies access with a 403 Forbidden status and a result of "Access denied" and redirects to the login page.
     *
     * @param ctx the Javalin context of the incoming request
     */
    public void authorizationFilter(Context ctx) {
        
    }

    /**
     * Configures the routes for authentication operations.
     * Sets up routes for registration, login, and logout, and applies the authorization filter to protect specific routes.
     *
     * @param app the Javalin application to which routes are added
     */
    public void configureRoutes(Javalin app) {
        app.post("/register", this::register);
        app.post("/login", this::login);
        app.post("/logout", this::logout);

        // Protect routes with authentication
        app.before("/protected/*", this::authorizationFilter);
    }
}
