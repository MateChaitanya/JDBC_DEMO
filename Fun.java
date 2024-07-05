import java.sql.*;
import java.io.*;
class Fun
{

    public static void main(String[] args) {
        try {
            //load the driver:

            Class.forName("com.mysql.jdbc.Driver");

            //Creating a connection
            //String url ="jdbc:mysql://localhost:3306/jdbc ?useSSL=false&serverTimezone=UTC";
            
            String url ="jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password="Chaitu@123";

            Connection con = DriverManager.getConnection(url, username, password);
           
            //Create a query 

            String q = "insert into table1(tName,tCity)values(?,?)";

            //get the PreparedStatement object

            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name :");
            String name = br.readLine();

            System.out.println("Enter City:");
            String city = br.readLine();

            //set the values to query
            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("Inserted...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
