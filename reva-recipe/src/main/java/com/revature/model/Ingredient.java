package com.revature.model;

/**
 * The Ingredient class represents an ingredient used in recipes.
 * It stores basic information about the ingredient, such as its unique ID and name. 
 * This class provides getter and setter methods to access and modify the fields, 
 * and overrides methods for equality checking and generating hash codes.
 */

public class Ingredient {

    /**
     * The unique identifier of the ingredient.
     */

    private int id;

    /**
     * The name of the ingredient.
     */

    private String name;

    /**
     * Default constructor for creating an empty Ingredient object.
     */

    public Ingredient() {
        // Implementation
    }

    /**
     * Constructs an Ingredient with the specified name.
     * 
     * @param name the name of the ingredient
     */

    public Ingredient(String name) {
        this.name = name;
    }

    /**
     * Constructs an Ingredient with the specified id and name.
     * 
     * @param id the unique identifier of the ingredient
     * @param name the name of the ingredient
     */

    public Ingredient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Retrieves the ID of the ingredient.
     * 
     * @return the unique identifier of the ingredient
     */

    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the ingredient.
     * 
     * @param id the unique identifier to set for the ingredient
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the ingredient.
     * 
     * @return the name of the ingredient
     */

    public String getName() {
        return name;
    }

    /**
     * Sets the name of the ingredient.
     * 
     * @param name the name to set for the ingredient
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Compares this Ingredient object with another object for equality.
     * 
     * @param other the object to compare with
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object other) {
        // Implementation
    }

    /**
     * Generates the hash code for this Ingredient object.
     * 
     * @return the hash code of the ingredient
     */

    @Override
    public int hashCode() {
        // Implementation
    }
}
