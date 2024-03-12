package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class updateStudent {

	public static void main(String[] args) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
//		Student student=session.get(Student.class, 1);
//		student.setStudentMarks(299);
//		session.merge(student);
		
		
		MutationQuery mutationQuery=session.createMutationQuery("update Student set studentMarks=:marks where studentName=:name ");
		mutationQuery.setParameter("marks", 3222323);
		mutationQuery.setParameter("name", "saurab");
		mutationQuery.executeUpdate();
		transaction.commit();
		session.close();

	}

}
