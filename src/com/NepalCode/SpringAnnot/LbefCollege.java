package com.NepalCode.SpringAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LbefCollege {

	@Autowired
	@Qualifier("entrepreneurDeep")
	private PrakashPrinciple prakashPrinciple;

	@Autowired
	private LbefStudent lbefStudent;

	public void manageActivity() {
		prakashPrinciple.manageClass();
		prakashPrinciple.manageStudent();

		lbefStudent.showStudentInfo();

		System.out.println("Manage activity");
	}

}
