package com.anshumanbiswal.EmployeeManagementWebApp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.anshumanbiswal.EmployeeManagementWebApp.dto.UserRegistrationDto;
import com.anshumanbiswal.EmployeeManagementWebApp.model.User;

public interface IUserService extends UserDetailsService {
   User save(UserRegistrationDto registrationDto);
   Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
   List<User> searchUser(Long id, String keyWord);
}
