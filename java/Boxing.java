public class Boxing {

  public static void main(String[] args){
    int i = 10;
    long lg = 200;

    // Autoboxing.
    Integer ic = 90; // directly assigning values
    Integer ic2 = i; // assigning a int variable;
    Integer ic3 = new Integer(33); // Creating an Integer Object;
    Integer ic4  = new Integer (i); // creating an Integer object by passing primitive int
    Integer ic5 = new Integer ("233"); // passing a string

    int sum = 
      ic + ic2 + ic3 + ic4 + ic5 ; // 90+90+33+99+233

    System.out.println("sum is " + sum );
    System.out.printf("%5d,%5d,%5d,%5d,%5d\n", ic , ic2 , ic3, ic4 , ic5);
  
    // Unboxing
    int k1, k2,k3,k4;
    String s5;
    k1 = ic;
    k2 = ic2.intValue();
    k3 = ic3;
    k4 =  ic4 ;
    s5 = ic5.toString();

    System.out.printf("unboxing: \n%5d,%5d,%5d,%5d,%5s\n", 
            k1,k2,k3,k4,s5);
  
  }
}