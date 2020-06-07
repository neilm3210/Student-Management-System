package com.demo.StuManSys;

import java.util.regex.Pattern;

public class StudentValidation 
{

	public static boolean validateNo(String no) throws StudentException
	{
		String pattern="\\d{1,3|";
		if(Pattern.matches(pattern,  no))
		{
			return true;
		}
		else
		{
			throw new StudentException("Only digits between 1 - 999");
		}
	}
	public static boolean validateName(String name) throws StudentException
	{
		String pattern="[A-Za-z] {3,15}";
		if(Pattern.matches(pattern, name))
		{
			return true;
		}
		else
		{
			throw new StudentException("Name should be min 3 to max 15 alphabets");
		}
	}
	public static boolean validateGrade(String grade) throws StudentException
	{
		String pattern="[0 - 9] {1,2}";
		if(Pattern.matches(pattern, grade))
		{
			return true;
		}
		else
		{
			throw new StudentException("Only grade between 1 to 15 allowed");
		}
	}
	public static boolean validateBranch(String branch) throws StudentException
	{
		String pattern ="IT|None|Mechanical|Civil] {2,10}";
		if(Pattern.matches(pattern,  branch))
		{
			return true;
		}
		else
		{
			throw new StudentException("Only IT, Civil, Mechanical allowed");
		}
	}
}
