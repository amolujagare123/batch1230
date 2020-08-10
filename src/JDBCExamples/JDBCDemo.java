package JDBCExamples;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/ganesh";

       Connection con = DriverManager.getConnection(url, user , pass);

       Statement st = con.createStatement();

       String sql = "insert into student values(3,'dharani','IT',78)";

       // try  update & delete queries with where clause

       st.executeUpdate(sql);


    }


}
