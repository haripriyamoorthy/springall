package com.bookapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
//@Table(name="book_details") // to give a different table name
public class Book {

	private String title;
	@Id  // is is must
	@GeneratedValue // to auto generate the id
	private Integer bookId;
	@Column(name = "cost") // give a different column name
	private double price;
	@Column(length = 20)
	private String author; // give the length
	private String category;
	


}