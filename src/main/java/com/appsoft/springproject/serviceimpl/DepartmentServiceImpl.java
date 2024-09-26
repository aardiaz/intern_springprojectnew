package com.appsoft.springproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.springproject.model.Department;
import com.appsoft.springproject.repository.DepartmentRepository;
import com.appsoft.springproject.service.IDepartmentService;
@Service
public class DepartmentServiceImpl implements IDepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	public void addDepartment(Department dept) {
		deptRepo.save(dept);
	}

	@Override
	public void deleteDepartment(int id) {
		deptRepo.deleteById(id);
	}

	@Override
	public void updateDepartment(Department dept) {
		deptRepo.save(dept);
	}

	@Override
	public Department getDepartmentById(int id) {
		 
		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> getAllDepartments() {
		 
		return deptRepo.findAll();
	}

}
