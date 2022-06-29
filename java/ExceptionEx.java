import java.util.InputMismatchException;
import java.util.Scanner;

class AgeException extends Exception{

  String msg;
  AgeException(String mymsg){
    super(mymsg);
    this.msg = mymsg;
  }
  public String getMsg(){
    return this.msg;
  }
}
public class ExceptionEx {

  static Scanner sc = new Scanner(System.in);

  public static void mTryCatch(){

    try {
      System.out.println("Enter a number :");
      int k = sc.nextInt();
      System.out.println( "Received number : " + k);
    } catch( InputMismatchException ie){
      System.out.println(" Enter only digits " +
          ie.getMessage());
      //ie.printStackTrace();
    } finally{
      System.out.println( " this block executes if exception happens or not");
    }
    System.out.println( " End of method");
  }
  public static void mTryFinally(){
    try{
       int k = 5;
       int m = 0;
       int res = k /m; 
    } finally {
      System.out.println( "Finally in mtryfinally method");
    }
  }
  public static void mTryMultipleCatch(){
    int[] intArr = new int[3]; //null;
    try {
      System.out.println(" Enter two number to divide -- ");
      int numerator = sc.nextInt();
      int denominator = sc.nextInt();
      int result = numerator / denominator;
      System.out.println( "result is " + result );
      System.out.println( " length of int array is "+ intArr.length);
      System.out.println( " accessing third " + intArr[2]); // changed from 3 to 2

      int ge = Integer.parseInt("a");
      System.out.println("ge is " + ge);
    } catch( ArithmeticException ae){
      System.out.println( " Divide by zero error occured....");
    } catch ( NullPointerException  |
              ArrayIndexOutOfBoundsException aie){
      //System.out.println( "Null pointer - to reach integer array");
      System.out.println(" either null pointer or Array Index out of bound exception occured");
      System.out.println(aie.getMessage());
    } catch(Exception e){
      System.out.println( " this is a general exception...");
    } 
 }

 public static void mThrowException(){
  String[] colors = new String[] { "red", "green", "blue", "yellow" };
  // check if user color is in the array list
  System.out.println(" Enter a color: ");
  String mycolor = sc.nextLine();
  boolean checkFlag = false;
  for (String cl : colors) {
    if (cl.equals(mycolor.toLowerCase())) {
      checkFlag = true;
      break;
    }
  }
  try {
    if(checkFlag){
      System.out.println(" same color");
    } else {
      throw new Exception("User selected color is not in array");
    } 
  } catch(Exception e){
    System.out.println(e.getMessage());
  }

 }
 public static void mThrowCustomException()  throws AgeException {
     
      try {
        System.out.println("Enter Employee age: ");
        int age = sc.nextInt();
        if ( age < 18 ){
          throw new AgeException("Employee age should be greater than 18");
        }
      } 
      catch( AgeException ae){
        System.out.println(ae.getMsg());
        throw new AgeException( "rethrown since age less than 18");
      }
    
 }

 public static void methodThrowsExample() throws AgeException, Exception{
 
    mThrowCustomException();
    System.out.println("l1");
    System.out.println("l2");
    System.out.println("l3");

 }
  public static void main(String[] args)
          throws AgeException, Exception{
      //mTryCatch();
      //mTryFinally();
      //mTryMultipleCatch();
      //mThrowException();
      /* try {
        mThrowCustomException();
        System.out.println("l1");
        System.out.println("l2");
        System.out.println("l3");

      } catch (AgeException ae) {
        System.out.println(ae.getMsg());
      } */

      /* try {
        methodThrowsExample();
      } catch (AgeException e ) {
        System.out.println(   e.getMsg() );
      }catch (Exception e ) {
        System.out.println(   e.getMessage() );
      } */

      methodThrowsExample();
  }
}
