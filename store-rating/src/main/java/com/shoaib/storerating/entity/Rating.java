package com.shoaib.storerating.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int rating;

	@ManyToOne
	private User user;

	@ManyToOne
	private Store store;
}