package com.example.CRUD.operation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService sService;

	@RequestMapping("listofstudents")
	public ArrayList<StudentEntity> listemp() {
		return sService.getallstudents();
	}

	@GetMapping("getstudent")
	public StudentEntity getstudent() {
		return sService.getStudent();
	}

	@PostMapping("addstudent")
	public StudentEntity addstudentt() {
		return sService.addStudent();
	}

	@PutMapping("updatestudent")
	public StudentEntity updatestudent() {
		return sService.updateStudent();
	}

	@DeleteMapping("deletestudent")
	public StudentEntity deletestudentt() {
		return sService.deleteStudent();
	}

}