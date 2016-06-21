package com.sys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String args[]){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@192.168.159.128:1521:test";    
			String user="test";    
			String password="test";    
			Connection conn=DriverManager.getConnection(url,user,password);
			//建立ProparedStatement对象    
			String sql="select * from tab_1 ";    
			PreparedStatement pstmt=conn.prepareStatement(sql);    
			//执行动态SQL查询    
			ResultSet rs=pstmt.executeQuery();    
			while(rs.next())    
			{    
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
