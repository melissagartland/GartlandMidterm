package com.cisc181.eNums;

public enum eMajor {
BUSINESS, COMPSI, CHEM, NURSING, PHYSICS;
	
	private String Major;

	private eMajor(String Major){
		this.Major = Major;
	}
	
	public String getMajor(){
		return Major;
	}
}
