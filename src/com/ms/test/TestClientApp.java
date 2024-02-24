package com.ms.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.target.beans.WishMessageGenerator;

public class TestClientApp
{
	public static void main(String[] args) 
	{
		FileSystemResource res = new FileSystemResource("src/com/ms/cfgs/ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Object result=factory.getBean("wmg");
		WishMessageGenerator generate = (WishMessageGenerator)result;
		
		String Messg=generate.WishMessage("Muni");
		System.out.println(Messg);
	}
}
