package com.revature.controller;
import com.revature.service.IngredientService;

import io.javalin.Javalin;

/**
 * The IngredientController class handles operations related to ingredients.
 * It allows for creating, retrieving, updating, and deleting individual ingredients,
 * as well as retrieving a list of all ingredients. The class interacts with the 
 * IngredientService to perform these operations.
 */

public class IngredientController {

    /**
     * A service that manages ingredient-related operations.
     */

    @SuppressWarnings("unused")
    private IngredientService IngredientService;

    /**
     * Constructs an IngredientController with the specified IngredientService.
     *
     * @param ingredientService the service used to manage ingredient-related operations
     */

    public IngredientController(IngredientService ingredientService) {
        this.IngredientService = ingredientService;
    }

    /**
     * Handler for retrieving a single ingredient.
     * 
     * @return the ingredient details
     */

    public void getIngredient() {
        // Implementation
    }

    /**
     * Handler for deleting a specific ingredient.
     */

    public void deleteIngredient() {
        // Implementation
    }

    /**
     * Handler for updating a specific ingredient's details.
     */

    public void updateIngredient() {
        // Implementation
    }

    /**
     * Handler for creating a new ingredient.
     */

    public void createIngredient() {
        // Implementation
    }

    /**
     * Handler for retrieving a list of all ingredients.
     * 
     * @return the list of ingredients
     */
    
    public void getIngredients() {
        // Implementation
    }

    public void configureRoutes(Javalin app) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'configureRoutes'");
    }
}

