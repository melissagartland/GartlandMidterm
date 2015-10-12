package com.cisc181.eNums;

public enum eStaffTitle {
	PROFESSOR(1), ADJUNCT(2), TA(3);
	
	private int staffTitle;
	
	private eStaffTitle(int staffTitle){
		this.staffTitle = staffTitle;
	}
	public int getStaffTitle(){
		return staffTitle;
	}

}
