package cn.niot.util;

import java.sql.*;
/**
 * 
 * @author SQ
 * @date 14-08-28
 */
public final class JdbcUtilsRandom {
	private JdbcUtilsRandom(){}
	
		
	public static Connection getConnection()
	{
	
	 Connection conn=null;
	  try{
		 Class.forName("com.mysql.jdbc.Driver");
		  conn=DriverManager.getConnection("jdbc:mysql://218.241.108.143:3306/idrecohash", "root", "niot");
	  }catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Get datasource fail ", e);
	  }catch (java.lang.ClassNotFoundException e)
        {
            
            System.out.println(e.getMessage());
           }
	  
	  return conn;
	}
	
	public static Connection getConnection4Test()
	{
	
	 Connection conn=null;
	  try{
		 Class.forName("com.mysql.jdbc.Driver");
		  conn=DriverManager.getConnection("jdbc:mysql://218.241.108.143:3306/test", "root", "niot");
		 //conn=DriverManager.getConnection("jdbc:mysql://218.241.108.143:3306/test1", "root", "niot");
	  }catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Get datasource fail ", e);
	  }catch (java.lang.ClassNotFoundException e)
        {
            
            System.out.println(e.getMessage());
           }
	  
	  return conn;
	}
	
	public static void free(ResultSet rs, Statement stmt, Connection conn){
		try {
			if(rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
		
}

