package com.example.recipeMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.recipeMongo.Entity.recipe;

@Repository
public interface recipeRepository extends MongoRepository<recipe, String> {

}
