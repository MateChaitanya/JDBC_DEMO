import java.sql.*;
class FirstJDBC{
    public static void main(String[] args) {
        try {
            //load the driver:

            Class.forName("com.mysql.jdbc.Driver");

            //Creating a connection
            //String url ="jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=UTC";
            
            String url ="jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password="Chaitu@123";

            Connection con = DriverManager.getConnection(url, username, password);
            if(con.isClosed())
            {
                System.out.println("Connection is closed");
            }else
            {
                System.out.println("Connection Created");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}