package com.example.EvaluationCriteria.repository;

import com.example.EvaluationCriteria.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Collegerepo extends JpaRepository<College, Integer> {
}
