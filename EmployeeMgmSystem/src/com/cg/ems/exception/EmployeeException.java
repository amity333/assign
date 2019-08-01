package com.cg.ems.exception;

public class EmployeeException extends Exception
{
	public EmployeeException(String msg)
	{
		super(msg);
	}
	
	public EmployeeException()
	{
		super();
	}

	public EmployeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public EmployeeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EmployeeException(Throwable cause) {
		super(cause);
		
	}
	
	

}
