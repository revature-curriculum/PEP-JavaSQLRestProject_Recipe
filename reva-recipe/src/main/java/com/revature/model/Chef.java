package com.revature.model;

/**
 * The Chef class represents a chef user in the system.
 * It stores the chef's basic information such as ID, username, email, password,
 * and whether the chef has admin privileges. This class provides getter and setter 
 * methods to access and modify the fields, as well as methods for equality checking and 
 * generating hash codes for Chef objects.
 */

public class Chef {

    /**
     * The unique identifier of the chef.
     */
    
    private int id;

    /**
     * The username of the chef.
     */

    private String username;

    /**
     * The password of the chef.
     */

    private String password;

    /**
     * The email address of the chef.
     */

    private String email;

    /**
     * A flag indicating if the chef has admin privileges.
     */

    private boolean isAdmin;

    /**
     * Default constructor for creating an empty Chef object.
     */

    public Chef() {
        // Implementation
    }

    /**
     * Constructs a Chef with the specified id, username, email, password, and admin status.
     *
     * @param id the unique identifier of the chef
     * @param username the username of the chef
     * @param email the email address of the chef
     * @param password the password of the chef
     * @param isAdmin true if the chef has admin privileges, false otherwise
     */

    public Chef(int id, String username, String email, String password, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * Constructs a Chef with the specified username, email, password, and admin status.
     * The id is not provided and will be generated or set later.
     *
     * @param username the username of the chef
     * @param email the email address of the chef
     * @param password the password of the chef
     * @param isAdmin true if the chef has admin privileges, false otherwise
     */

    public Chef(String username, String email, String password, boolean isAdmin) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * Retrieves the ID of the chef.
     * 
     * @return the unique identifier of the chef
     */

    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the chef.
     * 
     * @param id the unique identifier to set for the chef
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the username of the chef.
     * 
     * @return the username of the chef
     */

    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the chef.
     * 
     * @param username the username to set for the chef
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the password of the chef.
     * 
     * @return the password of the chef
     */

    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the chef.
     * 
     * @param password the password to set for the chef
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retrieves the email address of the chef.
     * 
     * @return the email address of the chef
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the chef.
     * 
     * @param email the email address to set for the chef
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Checks if the chef has admin privileges.
     * 
     * @return true if the chef is an admin, false otherwise
     */

    public boolean isAdmin() {
        return isAdmin;
    }

    /**
     * Sets the admin status of the chef.
     * 
     * @param isAdmin true if the chef should have admin privileges, false otherwise
     */

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * Compares this Chef object with another object for equality.
     * 
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        // Implementation
    }

    /**
     * Generates the hash code for this Chef object.
     * 
     * @return the hash code of the chef
     */

    @Override
    public int hashCode() {
        // Implementation
    }
}


