package com.appsoft.springproject.service;

import java.util.List;

import com.appsoft.springproject.model.Department;

public interface IDepartmentService {

	void addDepartment(Department dept);

	void deleteDepartment(int id);

	void updateDepartment(Department dept);

	Department getDepartmentById(int id);

	List<Department> getAllDepartments();

}
