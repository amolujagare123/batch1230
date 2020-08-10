package JDBCExamples;

import java.sql.*;

public class JDBCSelectDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url, user , pass);

        Statement st = con.createStatement();

        String sql = "select * from student";

       ResultSet rs =  st.executeQuery(sql); // DDL

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.println(rs.getInt("marks"));

        }

    }
}
