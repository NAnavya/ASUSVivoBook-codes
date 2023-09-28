package com.example.vaccinationcenter1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vaccinationcenter1.entity.VaccinationCenter;

public interface VacRepo extends JpaRepository<VaccinationCenter,Integer>{

}
