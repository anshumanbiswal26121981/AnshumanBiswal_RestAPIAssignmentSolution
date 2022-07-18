package com.anshumanbiswal.EmployeeManagementWebApp.service;

import org.springframework.data.domain.Page;

import com.anshumanbiswal.EmployeeManagementWebApp.model.Employee;
import com.anshumanbiswal.EmployeeManagementWebApp.model.Role;

public interface IRoleService {
   Role addRole(Role role);
   Page<Role> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
