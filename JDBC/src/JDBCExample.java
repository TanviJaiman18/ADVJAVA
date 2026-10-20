import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver Loaded Successfully");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "WELLDONETANVII"
        );

        System.out.println("Database Connected Successfully");

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO student VALUES (?, ?, ?)"
        );

        ps.setInt(1, 101);
        ps.setString(2, "Rahul");
        ps.setString(3, "CSE");

        int rows = ps.executeUpdate();

        System.out.println(rows + " row inserted");

        con.close();
    }
}
