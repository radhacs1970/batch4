import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx1 {
  public static void main(String[] args) {
    HashMap<String, String> countryCapital =
        new HashMap<String, String>();
    countryCapital.put("India", "NewDelhi");
    countryCapital.put("US", "Washington");
    countryCapital.put("France", "Paris");
    countryCapital.put("UK", "London");

    System.out.println(countryCapital);

    String cap  = countryCapital.get("UK");// get value given key
        System.out.println( " value of UK is " + cap);
    
    System.out.println( "values in hash Keys " +
        countryCapital.keySet());

    Iterator<String> it = countryCapital.keySet().iterator();
    while( it.hasNext()){
      String key = (String)it.next();
      String value = countryCapital.get(key);
      System.out.println(" Key is " + key + " Value is " + value );
    }
    System.out.println( "values in hash map " +
        countryCapital.values() );
  }
}