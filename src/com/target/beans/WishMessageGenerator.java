package com.target.beans;

import java.util.Date;

public class WishMessageGenerator 
{	
	private Date date;
	
	public WishMessageGenerator()
	{
		System.out.println("constructor::0-param");
	}

	public void setDate(Date date) 
	{
		System.out.println("calling setDatemethod");
		this.date = date;
	}
	
	//invoke b.method
	
	public String WishMessage(String User)
	{
		System.out.println("WishMessagegenerator.wishMessage()");
		
		int hour=date.getHours();
		
		if(hour<9)
		{
			return "Good Morning:"+User;
		}
		else if(hour<12)
		{
			return "Good AfterNoon:"+User;
		}
		else if(hour<17)
		{
			return "Good Evening :"+User;
		}
		else
		{
			return "Good Night:"+User;
		}
	}
}
