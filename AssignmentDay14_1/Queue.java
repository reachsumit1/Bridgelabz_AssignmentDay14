package AssignmentDay14.AssignmentDay14_1;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> queue=new PriorityQueue<>();
        queue.offer(56);
        queue.offer(30);
        queue.offer(70);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}