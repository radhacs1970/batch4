package com.hexa.cli;

import java.util.Scanner;

import com.hexa.factory.CustomerFactory;
import com.hexa.model.Customer;

// mvn exec:java -Dexec.mainClass=com.hexa.cli.CommandCli
public class CommandCli {

  Scanner option = new Scanner(System.in);
  boolean inloop = true;
  
  private void mainMenu() {
    while( inloop ){
      System.out.println("Demo Management System");
      System.out.println("-----------------------");
      System.out.println("1. Show all Customer");
      System.out.println("2. Insert a Customer");
      System.out.println("3. Update Wallet Balance");
      System.out.println("4. CustomerLogin");
      System.out.println("5. Exit");
      mainMenuDetails();
    }
  }

  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int mOption = option.nextInt();
      option.nextLine();
      switch (mOption) {
        case 1:
          showAllCustomer();
          break;
         case 2:
          InsertACustomer();
          break;
         case 3: 
          UpdateWalletBalance();
          break;
         case 4:
          CustomerLogin();
          break;  
        case 5:
          inloop = false;
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose number between 1 to 5");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
   
  }
  private void showAllCustomer(){

    Customer[] cArray = CustomerFactory.fetchAllCustomers();
    for( Customer  c: cArray ){
      System.out.println( c );
    }
  }

  private void InsertACustomer(){
    System.out.println( " Get Customer Details  ");

    System.out.println(" Enter Customer Name: ");
    String custName = option.nextLine();

    System.out.println(" Enter Customer Phone: ");
    String custPhone = option.nextLine();

    System.out.println(" Enter Customer Email: ");
    String custEmail = option.nextLine();

    System.out.println(" Enter Customer Wallet Balance: ");
    int custWalletBal = option.nextInt();
    option.nextLine();

    System.out.println(" Enter Customer Login Id: (numbers) ");
    int custLoginId = option.nextInt();
    option.nextLine();

    System.out.println(" Enter Customer Password Id: ");
    String custPassword = option.nextLine();

    int retval = CustomerFactory.insertCustomer(custName, custPhone, 
          custEmail, custWalletBal, custLoginId, custPassword);
    if ( retval > 0 )
      System.out.println( " Successfully Inserted...!!!! ");
    else
      System.out.println( " Unable to insert data...");
  }
  private void UpdateWalletBalance(){

    System.out.println(" Enter the Custmer Id :");
    int custId = option.nextInt();
    option.nextLine();

    System.out.println( " Increment your wallet to by adding the amount: ");
    int incBal = option.nextInt();
    option.nextLine();
    int retVal = CustomerFactory.updateCustWalletBal(custId, incBal);
    if ( retVal > 0 )
      System.out.println(" Wallet Balance Successfully Updated...");
    else 
      System.out.println( " Unable to update the wallet balance, check custid...");

  }

  private void CustomerLogin(){
    System.out.println( " Login of Customer  ");

    System.out.println("Login Id:");
    int custLoginId = option.nextInt();
    option.nextLine();

    System.out.println( "Password:");
    String custPassword = option.nextLine();

    Customer cs = CustomerFactory.validateCustomerLogin(
      custLoginId, custPassword);
    if ( cs != null ){
      System.out.println( " Successfully logined,,,");
      System.out.println(cs);
      
    } else {
      System.out.println( "Invalid login id or password....");
    }
  }

  public static void main(String args[]){
      CommandCli cc = new CommandCli();
      cc.mainMenu();
  }

}