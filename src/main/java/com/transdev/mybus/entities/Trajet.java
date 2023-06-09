package com.transdev.mybus.entities;

 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import javax.persistence.ManyToMany;
 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Trajet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trajetId;

	private String destination;
	
	@ManyToMany
    private List<Reservation>  reservation;


	 

}
