package com.cisc181.core;

import java.util.Date;
import com.cisc181.eNums.*;

public class Staff extends Employee {

	 private eStaffTitle staffTitle;

	   public Staff(eStaffTitle staffTitle){
	        this.staffTitle = staffTitle;
	        
	    }

	    public void setTitle(eStaffTitle staffTitle){
	        this.staffTitle = staffTitle;
	    }
	    public eStaffTitle getTitle(){
	        return staffTitle;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eStaffTitle staffTitle) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.staffTitle = staffTitle;
	}

}