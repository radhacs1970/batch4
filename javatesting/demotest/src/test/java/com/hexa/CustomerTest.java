package com.hexa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {

  @Test
  public void testCustomerObject(){
    Customer cust = new Customer(); 
    assertNotNull(cust);

    String custName = "rekha";
    cust.setCustName(custName);
    assertEquals(custName, cust.getCustName());

    String custEmail = "rekha@gmail.com";
    cust.setCustEmail(custEmail);
    assertEquals(custEmail, cust.getCustEmail());

    int custWallet = 9000;
    cust.setCustWallet(custWallet);
    assertEquals(custWallet, cust.getCustWallet());
    
    Customer cust2 = new Customer(custName,custWallet,custEmail);
    assertEquals(cust2, cust);
  }

  @Test
  public void testCustomerEquals(){
    String custName = "rekha";
    String custEmail = "rekha@gmail.com";
    int custWallet = 9000;

    Customer cust1 = new Customer(custName,custWallet,custEmail);
    Customer cust2 = new Customer(custName,custWallet,custEmail);

    Customer cust3 = new Customer( custName, custWallet, "rr@rr.com");
    Customer cust4 = new Customer( "ravi", custWallet, custEmail);
    Customer cust5 = new Customer( custName, 89, custEmail);

    Customer cust6 = new Customer( custName, custWallet, null);
    Customer cust7 = new Customer( null, custWallet, custEmail);
 

    App app = new App();

    assertTrue(cust1.equals(cust1));
    assertFalse(cust1.equals(null));
    assertFalse(cust1.equals(app));

    assertTrue( cust1.equals(cust2));   
    assertFalse(cust1.equals(cust3));   
    assertFalse(cust1.equals(cust4));
    assertFalse(cust1.equals(cust5));
    assertFalse(cust1.equals(cust6));
    assertFalse(cust1.equals(cust7));

    assertFalse(cust6.equals(cust1));
    assertFalse(cust7.equals(cust1));

  }
}