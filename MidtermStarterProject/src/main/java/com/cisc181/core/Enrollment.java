package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Enrollment extends Student{
	private UUID StudentID;
	private UUID SectionID;
	private UUID EnrollmentID;
	private double Grade;
	
	//no arg constructor
	private Enrollment(){
	}
	//two arg constructor
	private Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}
	public double setGrade(double Grade){
		return Grade;
	}
}
