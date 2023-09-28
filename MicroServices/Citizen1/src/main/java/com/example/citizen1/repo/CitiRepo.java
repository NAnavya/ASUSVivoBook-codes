package com.example.citizen1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.citizen1.entity.Citizen;

public interface CitiRepo extends JpaRepository<Citizen,Integer>{

	List<Citizen> findByVaccinationcenterId(int id);

}
