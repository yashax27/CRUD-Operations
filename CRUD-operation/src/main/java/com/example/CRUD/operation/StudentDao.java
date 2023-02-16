package com.example.CRUD.operation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	SessionFactory sessionFactory;

	public StudentEntity getStudent() {

		Session session = sessionFactory.openSession();
		StudentEntity student = session.load(StudentEntity.class, 402);

		return student;
	}

	public ArrayList<StudentEntity> getallstudents() {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(StudentEntity.class);
		ArrayList<StudentEntity> al = (ArrayList<StudentEntity>) (criteria.list());
		System.out.println(al);
		for (StudentEntity student : al) {
			System.out.println(student);

		}
		return al;
	}

	public StudentEntity addStudent() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		StudentEntity student = new StudentEntity(411, "kunal", "MBA", 90);
		session.save(student);
		tx.commit();
		return student;
	}

	public StudentEntity updateStudent() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		StudentEntity student = session.load(StudentEntity.class, 406);
		student.setCourse("MBA");
		session.update(student);
		tx.commit();
		return student;

	}

	public StudentEntity deleteStudent() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		StudentEntity student = session.load(StudentEntity.class, 404);
		session.delete(student);
		tx.commit();
		return student;
	}
}
