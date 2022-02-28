package com.NepalCode.SpringAnnot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLbefCollgeg {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LbefConfigFile.class);
		LbefCollege lbefcollg = context.getBean("lbefCollege", LbefCollege.class);
		lbefcollg.manageActivity();
		context.close();

	}

}
