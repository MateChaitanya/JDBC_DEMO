import java.sql.*;

class InsertJDBC {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver (optional for newer versions of JDBC)
            Class.forName("com.mysql.jdbc.Driver");

            // Connection details
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Chaitu@123";

            // Establishing connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create a query to create a table
            String q = "CREATE TABLE table1 (tId INT PRIMARY KEY AUTO_INCREMENT, tName VARCHAR(200) NOT NULL, tCity VARCHAR(400))";

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute the query
            stmt.executeUpdate(q);

            System.out.println("Table created successfully in the database");

            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
