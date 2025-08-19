import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();

        //Adding Elements in Queue
        queue.offer(10); //Return boolean values
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        queue.add(50); //Throws exception if failed

        System.out.println(queue);

        System.out.println(queue.poll()); //Return null if queue is empty

        queue.remove(); //Throws exception if queue is empty

        System.out.println(queue);

        System.out.println(queue.peek()); //Returns head of queue, null when queue is empty

        System.out.println(queue.element()); //Returns head of queue, throws exception when is empty

        System.out.println(queue);

        /*
        You can create LinkedList through List too, and it has same methods as ArrayList

        List<Integer> list = new LinkedList<>();

        Like this
        */
    }
}
