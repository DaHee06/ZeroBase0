package chapter02.Stack;

//ArrayList를 이용한 스택 구현

import java.util.ArrayList;

class MyStack1 {
    ArrayList list;

    MyStack1(){
        this.list = new ArrayList();
    }

    public boolean isEmpty(){
        if(this.list.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public void push(int data){
        this.list.add(data); // 끝 쪽에 하나씩 데이터 추가
    }

    public Integer pop(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        int data = (int)this.list.get(this.list.size() - 1);  //리스트의 가장 끝을 가져온다. ArrayList 형이 정의되어있지 않기 때문에 (int)
        this.list.remove(this.list.size() - 1);
        return data;
    }

    public Integer peak(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        int data = (int)this.list.get(this.list.size() - 1);
        return data;
    }

    public void printStack(){
        System.out.println(this.list);
    }
}
public class Practice01 {
    public static void main(String[] args) {
        MyStack1 myStack = new MyStack1();
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printStack(); // 1, 2, 3, 4, 5

        System.out.println(myStack.peak()); // 5
        myStack.printStack(); // 1, 2, 3, 4, 5

        System.out.println(myStack.pop()); // 5
        System.out.println(myStack.pop()); // 4
        myStack.printStack(); // 1, 2, 3

        System.out.println(myStack.pop()); // 3
        System.out.println(myStack.pop()); // 2
        System.out.println(myStack.pop()); // 1
        myStack.printStack();

    }
}
