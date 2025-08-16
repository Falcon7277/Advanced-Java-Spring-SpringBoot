package org.example;
import java.sql.*; //Import package
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver"); //load and register driver(Optional and is implicit)

            String url = "jdbc:postgresql://localhost:5432/Demo";
            String user = "postgres";
            String password = "#Worldatwar77";
            Connection con = DriverManager.getConnection(url,user,password);// Establish Connection
            System.out.println("Connection Established");

//            String sql = "select sname from students where sid = 101";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            System.out.println(rs.next());
//            String name = rs.getString("sname");
//            System.out.println(name);

//            String sql = "select * from students";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()){
//                System.out.print(rs.getInt(1) + " : ");
//                System.out.println(rs.getString(2));
//            }

//            String sql = "insert into students values(104, 'Harsh')";
//            Statement st =  con.createStatement();
//            boolean status = st.execute(sql);
//            System.out.println(status);

//            String sql = "update students set sname = 'hello' where sid = 103";
//            Statement st =  con.createStatement();
//            st.execute(sql);

//            String sql = "delete from students where sid = 103";
//            Statement st =  con.createStatement();
//            st.execute(sql);

//            int sid = 106;
//            String sname = "Ayush";
//            String sql = "insert into students values(" + sid + ", '" + sname + "')";
//            Statement st = con.createStatement();
//            st.execute(sql);

            int sid  = 103;
            String sname = "Arpit";
            String sql = "insert into students values(?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, sid);
            pst.setString(2, sname);
            pst.execute();
            
            con.close();
            System.out.println("Connection Closed");
        }
        catch (Exception e){
            System.out.println("Something went Wrong");
        }
    }
}