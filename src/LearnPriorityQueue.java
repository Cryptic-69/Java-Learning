import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args){

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //Reverse order -> descending

        //Adding Elements in Queue
        pq.offer(40); //Return boolean values
        pq.offer(70);
        pq.offer(30);
        pq.offer(60);

        pq.add(10); //Throws exception if failed

        System.out.println(pq);

        System.out.println(pq.poll()); //Remove, Returns head and Return null if queue is empty

        pq.remove(); //Remove, Returns head and Throws exception if queue is empty

        System.out.println(pq);

        System.out.println(pq.peek()); //Returns head of queue, null when queue is empty

        System.out.println(pq.element()); //Returns head of queue, throws exception when is empty

        System.out.println(pq);
    }
}
