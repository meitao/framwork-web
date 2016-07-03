package com.sys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String args[]){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/test";    
			String user="root";    
			String password="123456";    
			Connection conn=DriverManager.getConnection(url,user,password);
			//建立ProparedStatement对象    
			String sql="select * from sys_user ";    
			PreparedStatement pstmt=conn.prepareStatement(sql);    
			//执行动态SQL查询    
			ResultSet rs=pstmt.executeQuery();    
			while(rs.next())    
			{    
				System.out.println(rs.getString(1) +" >>>  "+ rs.getString(2));
			}  
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

}
