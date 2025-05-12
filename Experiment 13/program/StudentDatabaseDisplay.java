import java.sql.*;

public class StudentDatabaseDisplay {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college?serverTimezone=UTC"; // Add serverTimezone if needed
        String user = "root";
        String password = "root";

        try {
            // Correct driver for MySQL Connector/J 9.x
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create statement and execute query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display results
            System.out.println("ID\tName\tMarks");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(id + "\t" + name + "\t" + marks);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
