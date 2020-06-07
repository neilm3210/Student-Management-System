package com.demo.StuManSys;

class StudentException extends Exception {

	
	String msg;
	public StudentException()
	{
		msg = "Error Ocurred"; // Default Message
	}
	public StudentException(String msg)
	{
		this.msg=msg; // user define message
	}
	@Override
	public String getMessage()
	{
		return msg;
	}
	@Override
	public String toString()
	{
		return "StudentException : "+msg;
	}
}
