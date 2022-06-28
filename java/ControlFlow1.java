import java.util.Scanner;

public class ControlFlow1 {
  public static void main( String[] args){
    // to get input from keyboard Scanner

    Scanner sc = new Scanner( System.in );
    System.out.println(" Enter name, age, salary :");
    String empname = sc.nextLine();
    int empage = sc.nextInt();
    int empSalary = sc.nextInt();

    System.out.println("name "+ empname);
    if( empage > 18 ){
      System.out.println( " emp age is greater than 18 " + empage);
    } else {
      System.out.println( " Employee age is lesser than 18 ");
    }
    if( empage >18 && empSalary > 10000 ){
      System.out.println( " employee is a manager " + empSalary);
    } else {
      System.out.println( " Employee is a worker " + empSalary);
    }

    for ( int i =0; i < 5; i++){
      System.out.println( i );
    }
    int i = 10;
    for ( ; i<=12; i++){
      System.out.println( i );
    }
    i= 10;
    for(;;i++){
      if ( i > 12 )
        break;
      System.out.println( i );
    }
    i=10;
    for( ;; ){
      if ( i > 12 )
        break;
      System.out.println( i );
      i++;
    }

    for ( int k = 0; k <=12; k++){
      if ( (k%2) == 0 )
        continue;
      else {
        System.out.println(k);
      }
    }

    int j = 0;
    i=10;
    while ( j < i ){
      if( j == 5){
        j++;
        continue;
      }
      System.out.println( " value is "+ j);
      j++;
      if ( j > 10 )
          break;
    }
    j = 0;
    i=2;
    do {
        System.out.println( "using do while "+ j);
        j++;
    }while ( j < i);

  }
  

}