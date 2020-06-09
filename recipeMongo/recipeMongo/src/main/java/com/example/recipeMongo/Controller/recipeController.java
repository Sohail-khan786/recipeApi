package com.example.recipeMongo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.recipeMongo.Entity.recipe;
import com.example.recipeMongo.Service.recipeService;

@RestController
public class recipeController {
    
	@Autowired
	private recipeService recipeDataService;
	
	@GetMapping(value="/getAllRecipes")
	public List<recipe> getAllRecipes() {
		return recipeDataService.getAllRecipes();
	}
	
	@PostMapping("/addRecipe")
	public String addRecipe(@RequestBody recipe dish) {
		return recipeDataService.addRecipe(dish);
		//return "added";
	}
	
	@PostMapping("/updateRecipe")
	public String updateRecipe(@RequestBody recipe dish) {
		return recipeDataService.updateRecipe(dish);
		
	}
	
	@GetMapping("/getRecipeById/{id}")
	public Optional<recipe> getRecipeById(@PathVariable String id) {

		return recipeDataService.getRecipeById(id);

	}
	
	@PostMapping("/deleteRecipe/{id}")
	public String deleteRecipe(@PathVariable String id) {
		return recipeDataService.deleteRecipe(id);
	}
}
