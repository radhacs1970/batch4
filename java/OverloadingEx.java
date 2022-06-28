public class OverloadingEx {
  int id; // instance variabe
  static int mycount = 0;
  // static method can access static variable.
  // static method cannot access the instance variable.
  static void dispMyName(){
    System.out.println( " Hi , this overloading function...");
    mycount++;
  }

  // static method overloaded.
  static void dispMyName( String myName){
    System.out.println( " my Name is " + myName);
    mycount++;
  }
  static float calcSalary(){
    return 0.0f;
  }
  // instance method
  // instance method can access both instance variable and static variable.
  float calcSalary(int basic, int month){
    float salary = 0;
    if ( month < 6 )
      salary = basic + basic * 0.1f;
    else
      salary = basic + basic * 0.25f;
      mycount ++;
    return salary;
  }
  // instance method overloaded...
  float calcSalary( int basic, int type, int pf )
  {
    float salary = 0;
    if ( type == 1 )
      salary = basic + pf;
    else if ( type == 2 )
      salary  =  basic + basic * 0.1f + pf;
    else 
      salary = basic;
      mycount++;
    return salary;
  }
  
  public void main(){
    System.out.println(" instance method main");
  }
  public static void main(int a){
      System.out.println(" displays a from main "+ a);
  }
  public static void main( String args[]){
    OverloadingEx oe = new OverloadingEx();
    float sal = oe.calcSalary(1000, 3);
    System.out.println( " sala " + sal);

    sal = oe.calcSalary(200, 1, 50); 
    System.out.println( " sal " + sal);
    
    // Static methods can be called using class name
    OverloadingEx.dispMyName();
    OverloadingEx.dispMyName("hexa");

    System.out.println(" Print mycount " + OverloadingEx.mycount);
    // static methods can also be called using instance obj ref
    oe.dispMyName();
    oe.dispMyName("Rekha");
    System.out.println(" Print mycount " + OverloadingEx.mycount);
   
    OverloadingEx oe2 = new OverloadingEx();

    System.out.println(" Print mycount " + oe.mycount);
    System.out.println(" Print mycount " + oe2.mycount);
   
    OverloadingEx.main(10); // static main method
    oe2.main(); // instance main method
   

  }
}
