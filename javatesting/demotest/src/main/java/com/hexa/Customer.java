package com.hexa;

import java.util.Objects;

public class Customer {
  String custName;
  int custWallet;
  String custEmail;

  public Customer(String custName, int custWallet, String custEmail) {
    this.custName = custName;
    this.custWallet = custWallet;
    this.custEmail = custEmail;
  }

  public Customer() {
  }

  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }

  public int getCustWallet() {
    return custWallet;
  }

  public void setCustWallet(int custWallet) {
    this.custWallet = custWallet;
  }

  public String getCustEmail() {
    return custEmail;
  }

  public void setCustEmail(String custEmail) {
    this.custEmail = custEmail;
  }

  @Override
  public int hashCode() {
    int result;
    result = Objects.hash(custName,custWallet,custEmail);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Customer other = (Customer) obj;
    if (custEmail == null) {
      if (other.custEmail != null)
        return false;
    } else if (!custEmail.equals(other.custEmail))
      return false;
    if (custName == null) {
      if (other.custName != null)
        return false;
    } else if (!custName.equals(other.custName))
      return false;
    if (custWallet != other.custWallet)
      return false;
    return true;
  }
  

  

}