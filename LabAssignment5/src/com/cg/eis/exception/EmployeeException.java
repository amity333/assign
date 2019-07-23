package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	String message;
	public EmployeeException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage()
	{
		return this.message;
	}

	
}
