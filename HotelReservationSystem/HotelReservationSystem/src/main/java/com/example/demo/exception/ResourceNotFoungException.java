package com.example.demo.exception;

public class ResourceNotFoungException extends RuntimeException
{
	private static final long serialVersionUID =3L;
	
	private String resourceName;
	
	private long resourceValue;
	
	public ResourceNotFoungException(String resourceName, long resourceValue) {
		super(String.format("%s : %s is Not Exits",resourceName,resourceValue));
		this.resourceName = resourceName;
		this.resourceValue = resourceValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public long getResourceValue() {
		return resourceValue;
	}

	public void setResourceValue(long resourceValue) {
		this.resourceValue = resourceValue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ResourceNotFoungException [resourceName=" + resourceName + ", resourceValue=" + resourceValue + "]";
	}

	public ResourceNotFoungException() {
		super();
		
	}

	public ResourceNotFoungException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ResourceNotFoungException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ResourceNotFoungException(String message) {
		super(message);
		
	}

	public ResourceNotFoungException(Throwable cause) {
		super(cause);
		
	}

}