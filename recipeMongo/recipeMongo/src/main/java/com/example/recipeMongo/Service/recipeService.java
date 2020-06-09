package com.example.recipeMongo.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recipeMongo.Entity.recipe;
import com.example.recipeMongo.Repository.recipeRepository;

@Service
public class recipeService {
	
	public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
	
	@Autowired
	private recipeRepository recipeRepo;

	public List<recipe> getAllRecipes() {
		
		return recipeRepo.findAll();
	}

	public String addRecipe(recipe dish) {
		
		dish.setId(generateString());
		
		recipeRepo.save(dish);
		
		return "Recipe Added";
	}

	public String updateRecipe(recipe dish) {
		
		recipeRepo.save(dish);
		return "Recipe Updated";
	}

	public Optional<recipe> getRecipeById(String id) {
		// TODO Auto-generated method stub
		return recipeRepo.findById(id);
	}

	public String deleteRecipe(String id) {
		// TODO Auto-generated method stub
		recipeRepo.deleteById(id);
		return "Recipe Delete";
	}

}
