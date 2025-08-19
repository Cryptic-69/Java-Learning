import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){

        Stack<String> animals = new Stack<>(); //Making a Stack

        //Adding elements to Stack
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Leopard");
        animals.push("Panther");

        System.out.println("Stack " + animals); //Print stack

        System.out.println(animals.peek()); //Display the top element in Stack

        animals.pop(); //Pop the Top element

        System.out.println(animals.peek()); //See Changed top element
    }

    public void display(){
        System.out.println("This teaches basics of Stack");
    }
}
