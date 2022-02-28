package com.NepalCode.SpringAnnot;

import org.springframework.stereotype.Component;

@Component
public class EntrepreneurDeep implements PrakashPrinciple {

	@Override
	public void manageStudent() {
		System.out.println("I am managing entrepreneur student");
		
	}

	@Override
	public void manageClass() {
		System.out.println("I am managing bscit 6th sem entrepreneur class");
		
	}

}
