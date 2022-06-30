package com.hexa.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.hexa.model.Customer;

public class Customerdb {

  static String url = 
  "jdbc:mysql://localhost:3306/DM123456?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
  static String userName = "root";
  static String password = "Password123";


  public static Customer[] fetchAllCustomers(){
    Customer[] custArray = null;
    ArrayList<Customer> cslist = new ArrayList<Customer>();
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
        int custWalletbal = rs.getInt("Cust_walletbal");
        int custLoginId = rs.getInt("Cust_loginId");
        String custPassword = rs.getString("Cust_Password");

        Customer cObj = new Customer(custId, custName, custPhone, 
            custEmail, custWalletbal, custLoginId, custPassword);
        
        cslist.add(cObj);
      }
      // Create a Customer Array, the length of array is arraylist size
      custArray = new Customer[cslist.size()];
      // toArray fills the data from list and gives it back
      custArray = cslist.toArray(custArray);

      rs.close();
      stmt.close();
      con.close();

    }catch(Exception e){
      e.printStackTrace();
    }
    return custArray;
  }

  public static int insertCustomerDb( 
    String custName,String custPhone,
    String custEmail, int custWalletBal,
    int custLoginId, String custPassword){
      int retval = 0;
      try{ 
        Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
        Connection con=DriverManager.getConnection(  
          url,userName, password); // Get the Connection

          String sqlStr = " Insert into Customer(Cust_name,Cust_phone,Cust_Email,Cust_walletbal,Cust_loginId,Cust_Password) " 
          + " values (?,?,?, ?,?,? ) ";

          PreparedStatement pstmt = con.prepareStatement(sqlStr);
          pstmt.setString(1, custName);
          pstmt.setString(2, custPhone);
          pstmt.setString(3, custEmail);
          pstmt.setInt(4,custWalletBal);
          pstmt.setInt(5,custLoginId);
          pstmt.setString(6,custPassword);

          retval = pstmt.executeUpdate();
          System.out.println(retval +" records inserted");  

          pstmt.close();
          con.close();
      }catch(Exception e){
        e.printStackTrace();
      }
      return retval;
    }

  //Update Customer set cust_walletBal = cust_walletBal + 3000 where cust_id = 1;
  public static int updateCustWalletBalDb( int custId, int incBal){
    int retval = 0;
    try{

      Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
      Connection con=DriverManager.getConnection(  
          url,userName, password); // Get the Connection

      //Update Customer set cust_walletBal = cust_walletBal + 3000 where cust_id = 1;
        String sqlStr = "Update Customer set cust_walletBal = cust_walletBal + ? where cust_id = ? "; 
           
        PreparedStatement pstmt=
          con.prepareStatement(sqlStr);

        pstmt.setInt(1, incBal);
        pstmt.setInt(2, custId);
        retval = pstmt.executeUpdate();
        if( retval >0 )
          System.out.println(  retval + " number of record(s) updated..." );
         
        pstmt.close();
        con.close();

    }catch(Exception e){
      System.out.println( e.getMessage());
    }
    return retval;
  }
  public static Customer validateCustomerLogin( int custLoginId, String custPassword){
    Customer cs = null;
    try{

      Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
      Connection con=DriverManager.getConnection(  
          url,userName, password); // Get the Connection
      
      //select * from customer where Cust_loginId=123 and Cust_Password = 'ab12';
      String sqlStr = " select * from customer where Cust_loginId=? and Cust_Password = ? "; 
      
      PreparedStatement pstmt=
          con.prepareStatement(sqlStr);

        pstmt.setInt(1, custLoginId);
        pstmt.setString(2, custPassword);

        ResultSet rs = pstmt.executeQuery();
        
        if ( rs.next() ){
          int custId = rs.getInt("Cust_id");
          String custName = rs.getString("Cust_name");;
          String custPhone = rs.getString("Cust_phone");
          String custEmail = rs.getString("Cust_Email");
          int custWalletBal = rs.getInt("Cust_walletbal");
          int custLoginId2 = rs.getInt("Cust_loginId");
          String custPassword2 = rs.getString("Cust_Password");
            // Creating object from single row of data of customer
          cs = new Customer(custId, custName, custPhone, 
              custEmail, custWalletBal, custLoginId2, custPassword2);
        }
        }catch(Exception e){
          System.out.println( e.getMessage());
        }     
    return cs;
  }
}