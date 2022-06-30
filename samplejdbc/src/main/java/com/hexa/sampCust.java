package com.hexa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// mvn exec:java -Dexec.mainClass=com.hexa.sampCust

public class sampCust {

  static String url = 
  "jdbc:mysql://localhost:3306/DM123456?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
  static String userName = "root";
  static String password = "Password123";

  public static void main(String args[]) {

    try {
      Class.forName("com.mysql.cj.jdbc.Driver"); // register driver 
      Connection con = DriverManager.getConnection(url,userName,password);
      Statement stmt = con.createStatement();  
      String sqlCmd = "select * from customer";
      ResultSet rs = stmt.executeQuery(sqlCmd);
      while( rs.next() ){
        int custId = rs.getInt("Cust_id");
        String custName = rs.getString("Cust_name");;
        String custPhone = rs.getString("Cust_phone");
        String custEmail = rs.getString("Cust_Email");
        int custWalletBal = rs.getInt("Cust_walletbal");
        int custLoginId = rs.getInt("Cust_loginId");
        String custPassword = rs.getString("Cust_Password");

        String output = 
            "Customer [custId= " + custId + 
              ", Cust_name= " + custName + 
            ", custPhone = " + custPhone + 
            ", custEmail= " + custEmail + 
            ", custWalletBal= " + custWalletBal +
            ", custLoginId= " + custLoginId + 
            ", custPassword= " + custPassword
            + "]";
        System.out.println( output );
        
      }
      rs.close();
      stmt.close();
      con.close();

    } catch (Exception e) {
      e.printStackTrace();
    }  
  }
  

}