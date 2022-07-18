package com.anshumanbiswal.EmployeeManagementWebApp.dto;

import java.util.List;

import com.anshumanbiswal.EmployeeManagementWebApp.model.Employee;
import com.anshumanbiswal.EmployeeManagementWebApp.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResultDto {
   List<Employee> employeeList;
}
