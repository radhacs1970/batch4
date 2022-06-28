package mypack;

public class checkDefault {

  public void chkdef(){
    People pl2 = new People();
    System.out.println( " Visiblity within the packages are: ");
    System.out.println("Default access" + pl2.myEmail);
    System.out.println(" protected access " + pl2.mycity);
    System.out.println(" public access"+ pl2.mycountry);

    //System.out.println( " private access " + pl2.name);
  }

}