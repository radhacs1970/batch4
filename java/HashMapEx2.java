import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
  public static void main(String[] args) {
    HashMap<String, String[]> hStr =
        new HashMap<String, String[]>();

    hStr.put("a", new String[]{"arun", "avinash","arjun"});
    hStr.put("c", new String[]{"cathy", "chris"});
    hStr.put("r", new String[]{"ravi", "renu"});
    hStr.put("m", new String[]{"mala", "madhu","manju","manoj"}); 

    // get any names given the key
    String[] result = hStr.get("r");
    for( String s: result)
        System.out.println( s);

    String[] oldval =
        hStr.put("c", new String[]{"christopher","camal","ching"}  );

    if (oldval != null){
      for ( String s : oldval)
          System.out.print (s + " ");
      System.out.println( " - old values Printed... ");


      Set  es = hStr.entrySet();
      Iterator  it2 = es.iterator();
      while( it2.hasNext() ){
        Map.Entry me =(Map.Entry)it2.next();
        String key = (String) me.getKey();
        System.out.print( " Key is " + key + " - ");

        String[] values = (String [])me.getValue();
        for( String v: values)
          System.out.print( "  " + v );

        System.out.println();

      }
      
    }
    

  }
}