package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory= HibernateUtil.getSessionFactory();
Session session=factory.openSession();
SelectionQuery<Student> query =session.createSelectionQuery("from Student ",Student.class);
List<Student> list=query.list();

for(Student student:list) {
	System.out.println(student);
}
session.close();


	}

}
