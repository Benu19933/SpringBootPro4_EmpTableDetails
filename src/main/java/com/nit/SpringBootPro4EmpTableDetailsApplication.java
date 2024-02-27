package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.dao.EmployeeDAO;

@SpringBootApplication
public class SpringBootPro4EmpTableDetailsApplication {
	

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootPro4EmpTableDetailsApplication.class, args);
		
		
		EmployeeDAO dao=ctx.getBean("empl", EmployeeDAO.class);
		try {
		int no=dao.getEmployeeDetails();
		System.out.println(no);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

