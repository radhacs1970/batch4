package com.hexa.model;

public class Customer {
  private int custId;
  private String custName;
  private String custPhone;
  private String custEmail;
  private int custWalletbal;
  private int custLoginId;
  private String custPassword;

  
  public int getCustId() {
    return custId;
  }

  public void setCustId(int custId) {
    this.custId = custId;
  }

  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }

  public String getCustPhone() {
    return custPhone;
  }

  public void setCustPhone(String custPhone) {
    this.custPhone = custPhone;
  }

  public String getCustEmail() {
    return custEmail;
  }

  public void setCustEmail(String custEmail) {
    this.custEmail = custEmail;
  }

  public int getCustWalletbal() {
    return custWalletbal;
  }

  public void setCustWalletbal(int custWalletbal) {
    this.custWalletbal = custWalletbal;
  }

  public int getCustLoginId() {
    return custLoginId;
  }

  public void setCustLoginId(int custLoginId) {
    this.custLoginId = custLoginId;
  }

  public String getCustPassword() {
    return custPassword;
  }

  public void setCustPassword(String custPassword) {
    this.custPassword = custPassword;
  }

  public Customer(int custId, String custName, String custPhone, String custEmail, int custWalletbal, int custLoginId,
      String custPassword) {
    this.custId = custId;
    this.custName = custName;
    this.custPhone = custPhone;
    this.custEmail = custEmail;
    this.custWalletbal = custWalletbal;
    this.custLoginId = custLoginId;
    this.custPassword = custPassword;
  }

  @Override
  public String toString() {
    String output = 
            "Customer [custId= " + custId + 
              ", Cust_name= " + custName + 
            ", custPhone = " + custPhone + 
            ", custEmail= " + custEmail + 
            ", custWalletBal= " + custWalletbal +
            ", custLoginId= " + custLoginId + 
            ", custPassword= " + custPassword
            + "]";
    return  output;
  }

  //Constructor, gettter,setter, toString
  

}