import java.util.Objects;

public class LearnObject {
  String myName;
  int age;
  //MyEmployee memp; 
  // shallow cloning -> the object reference of memp will be copied
  // deep cloning override the clone method
  // create a new object for memp and copy the content from source to destination



 
  

  public LearnObject(String myName, int age) {
    this.myName = myName;
    this.age = age;
  }

  @Override
  public String toString() {
    return "LearnObject [myName= " + myName + " , age = " + age + "]";
  }

  public static void main (String args[]){

    LearnObject lo = new LearnObject("radha" , 20);
    LearnObject lo2 = new LearnObject( "radha", 20 );
    System.out.println( lo.toString());
    System.out.println( lo2.toString());

     LearnObject lo3 = lo2;

    if ( lo == lo2 ) // compares the Object references.
      System.out.println( " lo and lo2 are same");
    else
      System.out.println( "lo anld lo2 are not same");

    if( lo.equals(lo2) ){
      System.out.println( "  lo and lo2 are same using equals method");
    } else
    System.out.println( "lo anld lo2 are not same using equals");
    lo3 = null;
    lo = null;
     System.gc();
  }

  @Override
  public int hashCode() {
    int result;
    result = Objects.hash(age, myName);// variable length parameter.
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LearnObject other = (LearnObject) obj;
    if (age != other.age)
      return false;
    if (myName == null) {
      if (other.myName != null)
        return false;
    } else if (!myName.equals(other.myName))
      return false;
    return true;
  }

  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    System.out.println(" finalize methode is invoked...");
    super.finalize();
    
  }
}