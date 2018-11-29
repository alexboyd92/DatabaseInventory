package invmang;


import java.sql.*;
  public class DatabaseConnection {
      final static String dbUrl = "jdbc:mysql://localhost:3306/invMang?useSSL=false";
      final static String user = "root";
      final static String pass = "rootpasswordgiven";
      public static void main(String args[]) {
          try {
              Connection mycon = DriverManager.getConnection(dbUrl, user, pass);
              mycon.setAutoCommit(false);

          } catch (SQLException e1) {
              e1.printStackTrace();
          }
      }
      public static void addSheet(Connection mycon) {
    	  

      }
      public static void listSheets(Connection mycon) throws SQLException {
    	  String username = null;
    	  String busName = null;
    	  ResultSet rs;
    	  PreparedStatement pstmt = mycon.prepareStatement("SELECT \n" + 
    	  		"    id , dateCreated\n" + 
    	  		"FROM\n" + 
    	  		"    invSheet\n" + 
    	  		"where user_name= ? and buissnes_name=?");
    	  pstmt.setString(1, username);
    	  pstmt.setString(2, busName);
    	  rs =pstmt.executeQuery();
    	  


      }
      public static void deleteSheet(Connection mycon) throws SQLException {
          int IDtoDelete = 1;
          PreparedStatement pstmt = mycon.prepareStatement("DELETE FROM invSheet \n" +
                  "WHERE\n" +
                  "    id = ?;");
          pstmt.setInt(1, IDtoDelete);
          pstmt.executeUpdate();
          mycon.commit();





      }
}

