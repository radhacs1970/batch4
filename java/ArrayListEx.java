import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
  public static void main( String[] args){
    /* 
      MyEmployee me = new MyEmployee(1, Desig.contract);
      ArrayList many = new ArrayList();
      many.add("I am String");
      many.add(100);
      many.add(10.23f);
      many.add('g');
      many.add(me); // user defined class.

      System.out.println(many);

      // java 8.
      many.forEach(System.out::println); 
    */


    ArrayList<String> as = new ArrayList<String>();
    System.out.println( "is empty " + as.isEmpty() + 
                " size is " + as.size());

    as.add("red");
    as.add("green");
    as.add("blue");
    for( String s : as )
      System.out.println(s);
    System.out.println( "size is" + as.size() );

    System.out.println( "is red in list " + as.contains("red"));
    System.out.println( "is yellow in list " + as.contains("yellow"));
    
    as.remove(0);
    as.add("white");
    as.add("black");
    //using the iterator print it.

    Iterator<String> it = as.iterator();
    while( it.hasNext()){
      String str = it.next();
      System.out.print(" " + str);
    }
    System.out.println();

    ArrayList<String> ar2 = new ArrayList<String> ();
    ar2.add("pink");
    ar2.add("gray");
    System.out.println(" Contains all in ar2 " + as.containsAll(ar2));

    as.addAll(ar2);
    System.out.println(" after adding Contains all in as " + as.containsAll(ar2));
    System.out.println(" as contains : " + as );

    as.removeAll(ar2);
    System.out.println(" after executig remove all in as " + as.containsAll(ar2));
    System.out.println(" as has : " + as );

    ar2.add("peach");
    as.addAll(ar2);
    System.out.println( " after adding new data of ar2 on as " + as );

    // sorting on data
    Collections.sort( as );
    System.out.println(" after sorting the array " +  as );
    as.retainAll(ar2);
    System.out.println( " after retainall of ar2 on as " + as );

    as.clear();
    System.out.println(as);
  }

}