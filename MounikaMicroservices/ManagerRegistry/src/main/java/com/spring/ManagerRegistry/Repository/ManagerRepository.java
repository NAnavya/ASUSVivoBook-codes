package com.spring.ManagerRegistry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ManagerRegistry.Entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Long>{

}
