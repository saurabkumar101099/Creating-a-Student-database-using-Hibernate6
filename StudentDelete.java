package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class StudentDelete {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		Student student = new Student();
//		student.setStudentNumber(1);
//		session.remove(student);
		
//		
//		Student s= session.get(Student.class, 2);
//		session.remove(s);
		
		
		SelectionQuery<Student> query=session.createSelectionQuery("from Student where studentMarks>=:marks",Student.class);
		query.setParameter("marks", 90);
		List<Student> students =query.list();
		for(Student student:students) {
			session.remove(student);
		}
		transaction.commit();
		session.close();
		
	}

}
