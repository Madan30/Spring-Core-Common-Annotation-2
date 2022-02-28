package com.NepalCode.SpringAnnot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.NepalCode.SpringAnnot")
@PropertySource("classpath:lbefstudent-info.properties")
public class LbefConfigFile {
	
	
	

}
