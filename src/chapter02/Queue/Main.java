package chapter02.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();  // stack 과 다르게 new Queue가 인터페이스로 구현되어 있어서 바로 객체를 생성할 수가 없으며 메소드를 다 오버라이딩 해야함
        //LinkedList에서 queue가 필요한 메소드가 다 포함되어 있다.

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll());  // 들어있는 데이터를 빼낼때 poll
        System.out.println(queue); // 2, 3, 4, 5

        System.out.println(queue.poll());  // 2
        System.out.println(queue); // 3, 4, 5

        System.out.println(queue.peek()); //3
        System.out.println(queue); // 3, 4, 5

        System.out.println(queue.contains(3)); //true
        System.out.println(queue.size());  // 3
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.poll());  // null
    }
}
