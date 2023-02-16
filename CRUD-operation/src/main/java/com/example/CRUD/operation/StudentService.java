package com.example.CRUD.operation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao sDao;

	public ArrayList<StudentEntity> getallstudents() {
		return sDao.getallstudents();

	}

	public StudentEntity getStudent() {
		return sDao.getStudent();
	}

	public StudentEntity addStudent() {
		return sDao.addStudent();
	}

	public StudentEntity updateStudent() {
		return sDao.updateStudent();
	}

	public StudentEntity deleteStudent() {
		return sDao.deleteStudent();
	}

}
