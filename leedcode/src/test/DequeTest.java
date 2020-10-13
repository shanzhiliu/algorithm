package test;

import javax.sound.midi.Soundbank;
import java.util.Deque;
import java.util.LinkedList;

/**
 * autor shan
 */
public class DequeTest {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        deque.offer(10);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);


//        System.out.println(deque.peek());
        System.out.println();

        deque.poll();

        deque.stream().forEach(s -> System.out.println(s));
        

    }
}
