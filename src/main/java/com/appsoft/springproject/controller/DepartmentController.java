package com.appsoft.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.appsoft.springproject.model.Department;
import com.appsoft.springproject.service.IDepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private IDepartmentService deptService;
	
	@GetMapping("/department")
	public String getDept() {
		
		return "DepartmentForm";
	}

	@PostMapping("/department")
	public  String saveDept(@ModelAttribute Department dept) {
		
		deptService.addDepartment(dept);
		return "DepartmentForm";
	}
	
	@GetMapping("/departmentList")
	public  String getDepts(Model model) {
		
		model.addAttribute("dptList", deptService.getAllDepartments());
		return "ListDepartment";
	}
	
}
