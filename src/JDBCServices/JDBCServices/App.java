package JDBCServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user = new UserDAO();
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Vishal12345*");
			Statement stmt=conn.createStatement();
			int input;
			Scanner scan=new Scanner(System.in);
			do{
				System.out.println("!!!!! Welcome to User CRUD Services !!!!!");
				System.out.println(" 1. Registration");
				System.out.println(" 2. Update");
				System.out.println(" 3. Display Data");
				System.out.println(" 4. Delete");
				System.out.println(" 0. Exit");	
				input=scan.nextInt();
				switch(input){
					case 1:  user.registerData(conn);
						     break;
					case 2: user.updateUser(stmt);  
						     break;
					case 3:  user.displayUser(stmt); 
						     break;
					case 4:  user.deleteUser(stmt);
						     break;
					case 0:  break;
					default: System.out.println("Incorrect Option. Try Again.");
                             break;
				}
				
			}while(input>0);
			scan.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}			
}