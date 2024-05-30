package com.rodrigolee56.thymeleaf.crud_thymeleaf_springboot.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigolee56.thymeleaf.crud_thymeleaf_springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
