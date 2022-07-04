import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
  public static void main(String[] args) {
    // learn do it natural ordering of queue  ie FIFO
     
    Queue<Integer> pQueue = new PriorityQueue<Integer>();
    pQueue.offer(100);
    pQueue.offer(-2);
    pQueue.offer(99);
    pQueue.offer(8);
    pQueue.offer(23);
    pQueue.offer(45); // add elements
    
    while(!pQueue.isEmpty()){
      System.out.println(" peek the element " + pQueue.peek() );
      System.out.println(" remove from queue " + pQueue.poll());
    }
    
    // Priority que with Mobile class

    PriorityQueue<Mobile> pq2 = new PriorityQueue<Mobile>();
    pq2.offer(new Mobile("Xyz"));
    pq2.offer( new Mobile("Vivo"));
    pq2.offer( new Mobile("Nokia"));
    pq2.offer( new Mobile("Lava"));
    pq2.offer( new Mobile("OnePlus"));

    while(!pq2.isEmpty()){
      System.out.println(" remove from queue " + pq2.poll());
    }

  }
}