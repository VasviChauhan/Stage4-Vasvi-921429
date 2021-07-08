package com.cognizant.restday1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.restday1.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
