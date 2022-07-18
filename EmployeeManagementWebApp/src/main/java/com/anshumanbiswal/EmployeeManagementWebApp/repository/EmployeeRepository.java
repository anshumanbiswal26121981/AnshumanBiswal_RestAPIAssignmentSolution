package com.anshumanbiswal.EmployeeManagementWebApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anshumanbiswal.EmployeeManagementWebApp.model.Employee;
import com.anshumanbiswal.EmployeeManagementWebApp.model.User;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   List<Employee> findAllByFirstName(@Param("firstName") String firstName);
}
