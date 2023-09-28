package com.example.vaccinationcenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vaccinationcenter.entities.VaccinationCenter;
import com.example.vaccinationcenter.model.Citizen;

public interface CenterRepo extends JpaRepository<VaccinationCenter,Integer> {

}
