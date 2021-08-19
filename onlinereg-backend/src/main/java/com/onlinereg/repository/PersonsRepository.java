package com.onlinereg.repository;

import com.onlinereg.models.Persons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, Long>{
    
}
