package com.te.hipernetuniversity.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class University {
	public static void main(String[] args) {
		/*
		 * create the object for student class
		 * and the required details
		 */
		Student student3 = new Student();
		student3.setName("hamith");
		student3.setSubject("java");
		
		
		/*
		 * create the object for CourseDoing class
		 * add the required details
		 */
		CourseDoing courseDoing = new CourseDoing();
		courseDoing.setAttend("4-class");
		courseDoing.setDuration("3-months");
		
		/*
		 * also adding that table without using multiple times by
		 * storing the ref var in this object 
		 * only by creating that class and var in coursedoing table
		 */
//		courseDoing.setStudent(student);
		
		/*
		 * 
		 */
		BookTaken bookTaken = new BookTaken();
		bookTaken.setAuthor("science");
		bookTaken.setType("study");
		bookTaken.setBookNo(1);
		
		
		BookTaken bookTaken2 = new BookTaken();
		bookTaken2.setAuthor("ben10");
		bookTaken2.setType("comics");
		bookTaken2.setBookNo(2);
		
		
		List<BookTaken> bookTakens = new ArrayList<BookTaken>();
		bookTakens.add(bookTaken);
		bookTakens.add(bookTaken2);
	
		
		student3.setCourseDoing(courseDoing);
		student3.setBookTaken4(bookTakens);
		
		courseDoing.setStudent(student3);
		
		
		
		bookTaken.setStudent1(student3);
		bookTaken2.setStudent1(student3);
		
		List<Sports> list= new ArrayList<Sports>();
		
		Sports sports = new Sports();
		sports.setGames("cricket");
		sports.setJersyNo(1);
		sports.setStudents21(null);
		
		Sports sports2 = new Sports();
		sports2.setGames("hockey");
		sports2.setJersyNo(2);
		sports2.setStudents21(null);
		
		list.add(sports);
		list.add(sports2);
		
		
		student3.setSports1(list);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.add(student3);
		
		sports.setStudents21(list2);
		
		
		/*
		 * in this we have to pass the persistence name  it can do only in persistence class only
		 */
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("university");
		/*
		 * using this we need to createEntityManager that return EntityManager 
		 */
		EntityManager createEntityManager = EntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(student3);
		transaction.commit();
	}

}
