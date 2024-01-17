import java.sql.*;
public class Retrive {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Chaitu@123";

    //Code to Retrive the data

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, username ,password);
            Statement statement = connection.createStatement();
            String query = "select * from students";
            ResultSet resultset = statement.executeQuery(query);
            while(resultset.next()){
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                int age = resultset.getInt("age");
                double marks = resultset.getDouble("marks");
                System.out.println("ID: "+id);
                System.out.println("NAME: "+name);
                System.out.println("AGE: "+age);
                System.out.println("MARKS: "+marks);

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}