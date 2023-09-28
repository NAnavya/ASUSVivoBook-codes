package com.example.vaccinationcenter1.model;

import java.util.List;

import com.example.vaccinationcenter1.entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {
	
	private VaccinationCenter vc;
	private List<Citizen> citizen;
	
	public RequiredResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequiredResponse(VaccinationCenter vc, List<Citizen> citizen) {
		super();
		this.vc = vc;
		this.citizen = citizen;
	}
	public VaccinationCenter getVc() {
		return vc;
	}
	public void setVc(VaccinationCenter vc) {
		this.vc = vc;
	}
	public List<Citizen> getCitizen() {
		return citizen;
	}
	public void setCitizen(List<Citizen> citizen) {
		this.citizen = citizen;
	}
	@Override
	public String toString() {
		return "RequiredResponse [vc=" + vc + ", citizen=" + citizen + "]";
	}
	
	

}