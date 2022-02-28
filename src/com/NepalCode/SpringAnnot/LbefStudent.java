package com.NepalCode.SpringAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LbefStudent {

	//@Value("Madan Babu Ghale")
	@Value("${lbefstu.Name}")
	private String studentName;
	
	//@Value("9818445147")
	@Value("${lbefstu.phone}")
	private String studentPhone;
	
	//@Value("Maitidevi")
	@Value("${lbefstu.add}")
	private String studentAddress;

	public void showStudentInfo() {
		System.out.println("Name of student is: " + studentName + " Studnet phone num is: " + studentPhone
				+ " Student address is: " + studentAddress);
	}

}
