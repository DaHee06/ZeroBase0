package chapter02.Queue;

//ArrayList를 이용한 큐 구현

import java.util.ArrayList;

class MyQueue1 {
    ArrayList list;

    MyQueue1(){
        this.list = new ArrayList();
    }

    public boolean isEmpty(){
        if(this.list.size() == 0){
            return true;
        } else{
            return false;
        }
    }

    public void push(int data){
        this.list.add(data);
    }

    public Integer pop(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }

        int data = (int)this.list.get(0); // 맨 처음에 있는 데이터를 꺼내갈 것이다.
        this.list.remove(0);
        return data;
    }

    public Integer peak(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }

        return (int)this.list.get(0);
    }

    public void printQueue(){
        System.out.println(this.list);
    }
}
public class Practice01 {
    public static void main(String[] args) {
        MyQueue1 myQueue = new MyQueue1();
        System.out.println(myQueue.isEmpty());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);

        myQueue.printQueue(); // 1, 2, 3, 4, 5

        System.out.println(myQueue.peak()); // 1
        myQueue.printQueue(); // 1, 2, 3, 4, 5

        System.out.println(myQueue.pop()); // 1
        myQueue.printQueue(); // 2, 3, 4, 5

        System.out.println(myQueue.pop()); // 2
        myQueue.printQueue(); // 3, 4, 5

        System.out.println(myQueue.pop()); // 3
        System.out.println(myQueue.pop()); // 4
        System.out.println(myQueue.pop()); // 5
        myQueue.printQueue();
    }
}
