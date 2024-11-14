package com.revature.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.revature.model.Chef;

/**
 * The AuthenticationService class handles user authentication, including login, logout, registration, and session management for users. 
 * 
 * This class utilizes the ChefService to interact with chef data.
 */
public class AuthenticationService {

	/** Service for chef-related operations. */
	private ChefService chefService;

	/** A map that stores active sessions, with session tokens as keys and chefs as values. */
	private Map<String, Chef> sessionMap = new HashMap<String, Chef>();

	/**
     * TODO: Implement a constructor that initializes an instance of this class with the specified ChefService object.
     *
     * @param chefService the service used to manage chef-related operations
     */
	public AuthenticationService(ChefService chefService) {
		
	}

	/**
     * Authenticates a chef by verifying the provided credentials. If successful, a session token is generated and stored in the session map.
     *
     * @param chef the chef object containing username and password for authentication
     * @return a unique session token if login is successful, or null if authentication fails
     */
	public String login(Chef chef) {
		return null;
	}

	/**
     * Logs out a chef by removing the associated session token from the session map.
     *
     * @param token the session token to be invalidated
     */
	public void logout(String token) {
		
	}

	/**
     * Registers a new chef by saving the chef's information using ChefService.
     *
     * @param chef the chef object containing registration details
     * @return the registered chef object
     */
	public Chef registerChef(Chef chef) {
		return null;
	}

	/**
     * Retrieves the chef associated with a specific session token.
     *
     * @param token the session token associated with the chef
     * @return the chef associated with the token, or null if the token is invalid
     */
	public Chef getChefFromSessionToken(String token) {
		return null;
	}

}