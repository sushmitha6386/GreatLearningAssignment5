package JDBCServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
	public void registerData(Connection conn) throws Exception {
		String str ="insert into user (user_id,first_name,last_name,email_address) values(?,?,?,?)";
		PreparedStatement psts=conn.prepareStatement(str);
		psts.setInt(1, 100);
		psts.setString(2, "Sushmitha");
		psts.setString(3, "Acharya");;
		psts.setString(4, "sushmitha.acharya@gmail.com");
		int row=psts.executeUpdate();
		System.out.println("the number of rows inserted:"+row);
	}
	
	public void deleteUser(Statement stmt) throws Exception {
		String sql ="delete from user where user_id=100";
		int counter=stmt.executeUpdate(sql);
		System.out.println(" the deleted user is"+counter);
	}
	
	public void updateUser(Statement stmt) throws Exception {
		String sql ="update user set email_address='sushmitha.123@gmail.com' where user_id=100";
		int counter=stmt.executeUpdate(sql);
		System.out.println(" the updated user is"+counter);
		}
	
	public void displayUser(Statement stmt) throws Exception {
		String str =" select user_id,first_name,last_name,email_address from user";
		ResultSet rs=stmt.executeQuery(str);
		while(rs.next()){
			int id=rs.getInt("user_id");
			String first_name=rs.getString("first_name");
			String last_name=rs.getString("last_name");
			String email_address=rs.getString("email_address");
			System.out.println(" the Data is :");
			System.out.println(" the user id is :"+id);
			System.out.println(" the user first_name is :"+first_name);
			System.out.println(" the user last_name :"+last_name);
			System.out.println(" the user email_address :"+email_address);				
		}
	}
}
