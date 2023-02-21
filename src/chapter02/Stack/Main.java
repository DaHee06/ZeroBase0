package chapter02.Stack;

//선형 자료구조 - 스택

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack); // 1, 2, 3, 4

        System.out.println(stack.pop()); // 4 , pop하는 데이터값 출력, 결과값은 pop 된 상태
        System.out.println(stack); // 1, 2, 3

        System.out.println(stack.peek());  // 3  //스택의 가장 마지막에 있는 값을 반환하나 빼지는 않는다.
        System.out.println(stack);  //1, 2, 3

        System.out.println(stack.contains(1)); // true
        System.out.println(stack.size()); // 3
        System.out.println(stack.empty());  // false

        stack.clear(); //stack 값 한번에 지움
        System.out.println(stack);

        stack.pop(); // EmptyStackException 발생

    }
}
