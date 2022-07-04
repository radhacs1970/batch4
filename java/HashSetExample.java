import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
  static Scanner sc  = new Scanner(System.in);
  public static void main ( String[] args ){

    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(null);
    System.out.println( " Enter numbers to exit press 999: ");
    while( true ){
      
      int k = sc.nextInt();
      sc.nextLine();
      if( k == 999 )
        break;
      boolean isAdded = hs.add(k);
      System.out.println( " value is added boolean : " + isAdded);
    }
    System.out.println( hs );

    HashSet<Mobile> hsm = new HashSet<Mobile>();

    hsm.add( new Mobile("Poco"));
    hsm.add( new Mobile("Lg"));
    hsm.add( new Mobile("Samsung"));
    hsm.add( new Mobile("IPhone"));

    System.out.println( hsm );
    Mobile m = new Mobile("Lg");
    boolean i = hsm.contains(m);
    System.out.println( " hsm contians "+ i );
  }
}