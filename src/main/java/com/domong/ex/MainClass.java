package com.domong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		pencil pencil = ctx.getBean("pencil",pencil.class);
		pencil.use();
		
		pencil pencil2 = ctx.getBean("pencil2",pencil.class);
		pencil2.use();
		
		pencil pencil3 = ctx.getBean("pencil3",pencil.class);
		pencil3.use();
		
		ctx.close();
	}

}
