import java.sql.*;
public class Delete {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Chaitu@123";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, username ,password);
            Statement statement = connection.createStatement();
            String query = String.format("DELETE FROM students WHERE ID = 3");

            //("Rahul",25,75.5);
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected>0){
                System.out.println("Data Deleted Successfully!");
            }else{
                System.out.println("Data not Deleted !");
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}