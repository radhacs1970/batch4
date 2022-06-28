
public class TestExam {
/*  
compare two exam objects and display 
' They are same' , or 'They are Not same' */
  public static void main ( String args[]){

    Exam e1 = new Exam("java",100,1,75);
    Exam e2 = new Exam("dotnet", 90, 1, 75);
    Exam e3 = new Exam("java", 100, 1, 75);

    if ( e1.equals(e2))
      System.out.println( " e1 and e2 same.  They are same");
    else
      System.out.println(  " e1 and e2 not same.  They are Not same");

      // if you want to compare the attributes of the object
      // use equals method.
    if ( e1.equals(e3))
       System.out.println( " e1 and e3 same. They are same");
    else
      System.out.println(  " e1 and e3 not same. They are Not same ");
  }

}