import java.sql.*;
import java.io.*;
class ImageSave{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Chaitu@123");
            String q = "insert into images(pic) values(?)";
            
            PreparedStatement pstmt= con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("C://Users//HP//Pictures//TRIP//20230731_150246_664-01.jpeg");

            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();

            System.out.println("DOne....");



        } catch (Exception e) {
           System.out.println("Error !!");
        }
    }
}
