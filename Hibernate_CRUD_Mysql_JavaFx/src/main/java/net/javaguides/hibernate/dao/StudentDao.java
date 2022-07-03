package net.javaguides.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.module.Student;
import net.javaguides.hibernate.util.Hibernate;

public class StudentDao {

	public void saveStudent(Student student) {
		Transaction transaction=null;
		try(Session session=Hibernate.getSessionFactory().openSession()){
			//start the transaction
			transaction=session.beginTransaction();
			//save student 
			session.save(student);
			//commit the transaction
			transaction.commit();
		}catch(Exception e){
			if(transaction!=null) {
			transaction.rollback();
			}
			
		}
	}
	public void updateStudent(Student student) {
		Transaction transaction=null;
		try(Session session=Hibernate.getSessionFactory().openSession()){
			//start the transaction
			transaction=session.beginTransaction();
			//save student 
			session.saveOrUpdate(student);
			//commit the transaction
			transaction.commit();
		}catch(Exception e){
			if(transaction!=null) {
			transaction.rollback();
			}
			
		}
	}
	public Student getStudentsByID(long id) {
		Transaction transaction=null;
		Student student=null;
		try(Session session=Hibernate.getSessionFactory().openSession()){
			//start the transaction
			transaction=session.beginTransaction();
			//get student 
			//session.load(Student.class,id)
			student=session.get(Student.class,id);
			//commit the transaction
			transaction.commit();
		}catch(Exception e){
			if(transaction!=null) {
			transaction.rollback();
			}
			
		}
		return student;
	}
	public List<Student> getAllStudents() {
		Transaction transaction=null;
		List<Student> students=null;
		try(Session session=Hibernate.getSessionFactory().openSession()){
			//start the transaction
			transaction=session.beginTransaction();
			//get student 
			//session.load(Student.class,id)
			students=session.createQuery("from Student").list();
			//commit the transaction
			transaction.commit();
		}catch(Exception e){
			if(transaction!=null) {
			transaction.rollback();
			}
			
		}
		return students;
	}
	public void deleteStudent(long id) {
		Transaction transaction=null;
		Student student=null;
		try(Session session=Hibernate.getSessionFactory().openSession()){
			//start the transaction
			transaction=session.beginTransaction();
			//get student 
			//session.load(Student.class,id)
			student=session.get(Student.class,id);
			session.delete(student);
			//commit the transaction
			transaction.commit();
		}catch(Exception e){
			if(transaction!=null) {
			transaction.rollback();
			}
			
		}
	}
}
