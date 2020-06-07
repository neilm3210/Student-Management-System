package com.demo.StuManSys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Student { 
	@Id
	private int no;
	@Column
	private String name;
	@Column
	private String grade;
	@Column
	private String branch;
	
	public int getNo()
	{
		return no;
	}
	public void setNo(int no)
	{
		this.no=no;
	}
	public String getName() {
		return name;
	}
	
	
	public String getGrade() {
		return grade;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	
	
}
