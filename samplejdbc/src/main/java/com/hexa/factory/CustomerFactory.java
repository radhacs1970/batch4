package com.hexa.factory;

import com.hexa.model.Customer;
import com.hexa.persistence.Customerdb;

public class CustomerFactory {

  public static Customer[] fetchAllCustomers(){
    return Customerdb.fetchAllCustomers();
  }

  public static int insertCustomer( 
        String custName,String custPhone,
        String custEmail, int custWalletBal,
        int custLoginId, String custPassword){
          
    return Customerdb.insertCustomerDb(
            custName, custPhone, custEmail, 
            custWalletBal, custLoginId, custPassword);   
  }

  public static int updateCustWalletBal( int custId, int incBal){
    return Customerdb.updateCustWalletBalDb(custId, incBal);
  }
  public static Customer validateCustomerLogin( int custLoginId, String custPassword){
    return Customerdb.validateCustomerLogin(custLoginId, custPassword);
  }

}