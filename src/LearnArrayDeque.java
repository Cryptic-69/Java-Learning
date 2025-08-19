import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args){

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(23); //Adds element at the End
        ad.offerFirst(63); //Adds element at the Start
        ad.offerLast(84); //Adds element at the End
        ad.offer(27);

        System.out.println(ad);

        System.out.println(ad.peekFirst()); //Returns First Element

        System.out.println(ad.peekLast()); //Returns Last Element

        System.out.println(ad.pollFirst()); //Removes First Element

        System.out.println(ad.pollLast()); //Removes Last Element

        System.out.println(ad);

    }
}
