package com.example.recipeMongo.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "recipe")
public class recipe {
	@Id
	private String id;

	private String name;
	private String price;
	private List<String> indgredients;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<String> getIndgredients() {
		return indgredients;
	}

	public void setIndgredients(List<String> indgredients) {
		this.indgredients = indgredients;
	}

}
