package com.example.EvaluationCriteria.repository;

import com.example.EvaluationCriteria.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Departmentrepo extends JpaRepository<Department, Integer> {


}
