package mypack;

public class People {
  private String name;
  protected String mycity;
  public String mycountry;
  String myEmail;

  {
    System.out.println("instance block");
    name = "megha";
    mycity="mumbai";
    mycountry = "india";
    myEmail="megha@gmail.com";
  }

  public void dispAll(){
    System.out.println(" name " + name +
              " mycity  "+ mycity + " mycountry " + mycountry 
              + " email  "+ myEmail );
  }
}