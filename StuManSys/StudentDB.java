package com.demo.StuManSys;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDB 
{
	EntityManagerFactory emf;
	EntityManager em;
	
	public StudentDB()
	{
		 emf = Persistence.createEntityManagerFactory("student-info");
		 em = emf.createEntityManager(); 
	}
	public void addStudent(Student s)
	{
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Student Added");
		
		
	}
	public void dispAllStudents()
	{
		em.getTransaction().begin();
		Query query = em.createQuery("select s from Student s");
		
		List<Student> li = query.getResultList();
		
		System.out.println("No\tName\tGrade\tBranch");
		for(Student stu : li) 
		{
			System.out.println(stu.getNo()+"\t"+stu.getName()+"\t"+stu.getGrade()+"\t"+stu.getBranch());
		}
		em.getTransaction().commit();
	}
	public void updateStudent(int no) 
	{
		Scanner sc = new Scanner(System.in);
		em.getTransaction().begin();
		Student s = em.find(Student.class,  no);
		System.out.println("1. Update Name\n2. Update Grade\n3. Update Branch\n 4. Save Changes\n5. Exit");
		System.out.print("Enter Choice : ");
		int ch = 0;
		do
		{
			System.out.print("Enter Choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Name : ");
				String name = sc.next();
				s.setName(name);
				System.out.println("Name Changed");
			break;
			case 2 :
				System.out.println("Enter Grade : ");
				String grade = sc.next();
				s.setGrade(grade);
				System.out.println("Grade Changed Successfully");
			break;
			case 3 : 
				System.out.println("Enter Branch : ");
				String branch = sc.next();
				s.setBranch(branch);
				System.out.println("Branch updated successfully");
			break;
			default : 
				em.getTransaction().commit();
				
			}
		}
		while(ch<4);
		em.getTransaction().commit();
		System.out.println("Records are modified in database");
	}
	public void deleteStudent(int no)
	{
		em.getTransaction().begin();
		Student s = em.find(Student.class,  no);
		em.remove(s);
		System.out.println("No "+no+"has been removed from the database");
		em.getTransaction().commit();
	}
}
