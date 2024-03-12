package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory= HibernateUtil.getSessionFactory();
Session session=factory.openSession();
Transaction transaction=session.beginTransaction();
Student student= new Student();
student.setStudentNumber(2);
student.setStudentName("saur");
student.setStudentMarks(40);
session.persist(student);
transaction.commit();
session.close();
	}

}
