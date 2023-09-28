package com.example.citizen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Citizen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int vaccinationcenterId;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(int id, String name, int vaccinationcenterId) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationcenterId = vaccinationcenterId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVaccinationcenterId() {
		return vaccinationcenterId;
	}
	public void setVaccinationcenterId(int vaccinationcenterId) {
		this.vaccinationcenterId = vaccinationcenterId;
	}
	
	

}
