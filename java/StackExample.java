import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Character> sc = new Stack<Character>();
    sc.push('b');//0
    sc.push('z');
    sc.push('m');
    sc.push('k');
    sc.push('s');
    System.out.println(sc);
    System.out.println("top of the stack is " + sc.peek());
    sc.pop(); // s is removed    
    System.out.println(" after pop " + sc);
    
     System.out.println("top of the stack is " + sc.peek());
     System.out.println(" search   is " + sc.search('k'));
     System.out.println("first element is " + sc.firstElement());
     System.out.println("last element is " + sc.lastElement());
    
 //stack Lifo
 //queue fifo  senior citizen
 //priorityqueue ordering the elements based on certain priority
  }
}