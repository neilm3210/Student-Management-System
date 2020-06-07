package com.demo.StuManSys;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	int ch;
    	StudentDB sd = new StudentDB();
    	while(true)
    	{
    		try 
    		{
    		System.out.println("----------ABC Classes----------");
    		System.out.println("1. Adding a student");
    		System.out.println("2. Displaying all students");
    		System.out.println("3. Updating a student");
    		System.out.println("4. Deleting a student");
    		System.out.println("5. Exit the application");
    		System.out.print("Enter your choice");
    		ch = sc.nextInt();
    		switch(ch)
    		{
    			case 1 : 
    				System.out.print("Enter No : ");
    				String no = sc.next();
    				if(StudentValidation.validateNo(no))
    				{
    				System.out.print("Enter Name : ");
    				String name = sc.next();
    				if(StudentValidation.validateName(name)) {
    				System.out.println("Enter Grade : ");
    				String grade = sc.next();
    				if(StudentValidation.validateGrade(grade)){
    				System.out.println("Enter Branch : ");
    				String branch = sc.next();
    				if(StudentValidation.validateBranch(branch)) 
    				{
    					Student s1 = new Student();
    					s1.setNo(Integer.parseInt(no));
    					s1.setName(name);
    					s1.setGrade(grade);
    					s1.setBranch(branch);
    					sd.addStudent(s1);
    				}
    				}
    				}
    				}
    				break;
    			case 2 : 
    				sd.dispAllStudents();
    			break;
    			case 3 : 
    				System.out.println("Enter No to be updated : ");
    				int nos = sc.nextInt();
    				sd.updateStudent(nos);
    			break;
    			case 4 : 
    				System.out.println("Enter no to be deleted");
    				int noss = sc.nextInt();
    				sd.deleteStudent(noss);
    			break;
    			case 5 : System.exit(1);
    			break;
    			default : System.err.println("Invalid Selection");
    		}
    		}
    				catch(StudentException e)
    				{
    					System.err.println(e);
    				}
        }
    }
}
