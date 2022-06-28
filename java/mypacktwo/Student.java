package mypacktwo;

import mypack.People;

public class Student extends People {
  public int regno = 99;
  private String name ="rr";
   
 
  public void checkAccessSpecs(){
    
    System.out.println( " Visiblity Outside the packages are: ");
    //System.out.println("Default access " + myEmail);
    System.out.println(" protected access " + mycity);
    System.out.println(" public access "+ mycountry);
    System.out.println( "private access " + name);
    System.out.println(" public access "+ regno);
  }
  
}