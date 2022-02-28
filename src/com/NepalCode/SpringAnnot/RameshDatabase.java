package com.NepalCode.SpringAnnot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RameshDatabase implements PrakashPrinciple {

	@Override
	public void manageStudent() {
		System.out.println("I am managing database student");
		
	}

	@Override
	public void manageClass() {
		System.out.println("I am managing bscit 6th sem database class");
		
	}

}
