import mypack.People;
import mypack.checkDefault;
import mypacktwo.Student;

public class Testmypack extends Object {
  public static void main( String[] args){
    //People pl = new People();
    //System.out.println(pl.mycountry);
    //System.out.println(pl.name);
    //pl.dispAll();

    //checkDefault cd = new checkDefault();
    //cd.chkdef();

    Student st = new Student();
    st.checkAccessSpecs();
  }

}