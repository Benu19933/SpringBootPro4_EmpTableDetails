package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("empl")
public class EmployeeDAO {
	private static final String EMP_DETAIL_GET="SELECT * FROM EMP";
	@Autowired
	public DataSource data;
	
	public int getEmployeeDetails()throws Exception {
		Connection con=data.getConnection();
				PreparedStatement ps=con.prepareStatement(EMP_DETAIL_GET);
			
			ResultSet rs=ps.executeQuery();
			
			rs.next();
			int no=rs.getInt(1);
			rs.close();
			ps.close();
			con.close();
			return no;
	
		
	}
	
	
	

}
