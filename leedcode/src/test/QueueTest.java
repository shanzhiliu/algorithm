package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);


        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.remove());

//        for (Integer i : queue) {
//            System.out.println(i);
//        }

    }
}
