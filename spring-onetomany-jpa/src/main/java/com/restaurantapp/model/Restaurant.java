package com.restaurantapp.model;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Restaurant {

	@Column(length = 30)
	private String restaurantName;
	@Id
	@GeneratedValue(generator = "restaurant_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "restaurant_gen",sequenceName = "restaurant_seq",initialValue = 50)
	private Integer restaurantId;
	@Column(length = 20)
	private String category; 
	@Column(length = 20)
	private String cuisine; 
	@Column(length = 20)
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER) 
	@JoinColumn(name = "restaurant_id")
	private Set<Item> items;
	
	
	
	
	
	
	
	
	
	
	
}