import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

class Mobile implements Comparable {
  String brand;
  Mobile(String br){
    this.brand = br;
  }

  @Override
  public String toString() {
    return "Mobile [brand=" + brand + "]";
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(brand);
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    System.out.println(" Mobile equals is called....");
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Mobile other = (Mobile) obj;
    if (brand == null) {
      if (other.brand != null)
        return false;
    } else if (!brand.equals(other.brand))
      return false;
    return true;
  }

  @Override
  public int compareTo(Object o) {
    System.out.println( "Compare to");
    Mobile s2 = (Mobile)o;
    int k = this.brand.compareTo(s2.brand);
    return k;
  }
}
public class LinkedListEx {
  public static void main( String[] args){
    LinkedList<Mobile> lm = new LinkedList<Mobile>();

    lm.add(new Mobile("poco"));
    lm.add( new Mobile("samsung pro"));
    lm.addFirst(new Mobile("Nokia"));
    lm.addLast(new Mobile("Motorola"));

    System.out.println( lm );
    System.out.println( " is Empty " +  lm.isEmpty() );
    System.out.println( " size is " + lm.size());

    ListIterator lt = lm.listIterator();
    Mobile m1 = (Mobile) lt.next();//Nokia
    Mobile m2 = (Mobile) lt.next(); //poco
    Mobile p3 = (Mobile) lt.previous(); //poco

    System.out.println( "m1" + m1 + " m2 " + m2  + "p3 " + p3) ;

    System.out.println( " get first " + lm.getFirst() );
    System.out.println( " get Last " + lm.getLast() );

    LinkedList<Mobile> lm2 = new LinkedList<Mobile>();
    lm2.add(new Mobile("Oneplus"));
    lm2.add( new Mobile("Vivo"));

    boolean ret = lm.removeAll(lm2);
    System.out.println( " remove all " + ret );
    System.out.println(" main list is " + lm);

    Iterator<Mobile> it = lm.descendingIterator();// reverse the list
    while ( it.hasNext() ){
      System.out.println(it.next());
    }
    

    ListIterator<Mobile> lt2 = lm.listIterator(lm.size());
    System.out.println( " has Previous " + lt2.hasPrevious());
     
    while(lt2.hasPrevious()){
      Mobile m = lt2.previous();
      System.out.println(" iterating from last .. " +  m);
    }

    Collections.sort(lm);
    System.out.println(lm);
  }
}