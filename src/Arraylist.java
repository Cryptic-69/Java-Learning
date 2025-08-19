import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); //Creates an Array List

        //Adding elements in Array List
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        /* <<-------------------

        list.add(3, 40); //Adds elements at a certain position

        System.out.println(list);

        list.remove(1); //Removes an Element

        System.out.println(list);

        list.remove(Integer.valueOf(30)); //Removes Element where value is 30

        list.set(2 , 90); //Replace Element of index 2 with 90

        System.out.println(list);

        System.out.println(list.get(5)); //Get Element at index 5

        System.out.println(list.contains(50)); //Checks if Array List contains 50

        list.clear(); //Clear all Elements in Array List

        System.out.println(list);

        */ //<<-----------------

        //Iterating using For Loop
        for(int i = 0;i < list.size();i++){
            System.out.println("For Loop says " + list.get(i));
        }

        //Iterating using ForEach
        for (Integer element : list){
            System.out.println("For Each says " + element);
        }

        //Iterating using Iterator
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){ //you can use any loop
            System.out.println("Iterator says " + it.next());
        }
    }

    public void display(){
        System.out.println("This teaches basics of ArrayList");
    }
}
