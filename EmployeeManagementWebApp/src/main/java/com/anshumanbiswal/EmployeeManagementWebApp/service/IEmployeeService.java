package com.anshumanbiswal.EmployeeManagementWebApp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.anshumanbiswal.EmployeeManagementWebApp.model.Employee;
import com.anshumanbiswal.EmployeeManagementWebApp.model.User;

public interface IEmployeeService {
   List<Employee> getAllEmployees();
   void saveEmployee(Employee employee);
   Employee getEmployeeById(long id);
   void deleteEmployeeById(long id);
   Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
   List<Employee> searchEmployee(Long id, String keyWord);
}
