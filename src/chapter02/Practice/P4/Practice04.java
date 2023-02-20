package chapter02.Practice.P4;

//연결 리스트 배열 사용 연습

//주어진 문자열 배열을 연결 리스트 배열로 관리하는 코드를 작성하시오.
//관리 규칙은 다음과 같다.
//각 문자열의 첫 글자가 같은 것끼리 같은 연결 리스트로 관리하기


import java.util.HashSet;

class Node {
    String data;
    Node next;

    Node(String data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    Node head;
    char alphabet;

    LinkedList(){}
    LinkedList(Node node, char alphabet){
        this.head = node;
        this.alphabet = alphabet;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addData(String data){
        if(this.head == null){
            this.head = new Node(data, null);
        }else{
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    public void removeData(String data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;

        while(cur != null){
            if(cur.data.equals(data)){
                if(cur == this.head){
                    this.head = cur.next;
                } else{
                    pre.next = cur.next;
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public boolean findData(String data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
        }

        Node cur = this.head;
        while(cur != null){
            if(cur.data.equals(data)){
//                 System.out.println("Data exist");
                return true;
            }
            cur= cur.next;
        }
//         System.out.println("Data not found");
        return false;
    }

    public void showData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
        }

        Node cur = this.head;
        while(cur != null){
            System.out.print (cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


}

public class Practice04 {
    public static void dataCollect(String[] data){
        HashSet<Character> set = new HashSet();

        for(String item : data){
            set.add(item.toCharArray()[0]);  //첫번째 글자를 넣는데 , Hashset이기 때문에 중복된 글자는 들어가지 않는다.
        }

        System.out.println(set);

        Character[] arr = set.toArray(new Character[0]);
        LinkedList[] linkedList = new LinkedList[set.size()];

//        linkedList[0].head; // 바로 사용 불가,
//        연결리스트 배열을 위한 공간을 만든 것이다. 아직 객체 생성을 하지 않았기 때문에
//        for문을 돌면서 객체 생성을 해야한다.

        for(int i =0; i < linkedList.length ; i++){
            linkedList[i] = new LinkedList(null, arr[i]);
        }

        for(String item : data){
            for(LinkedList list : linkedList){
                if(list.alphabet == item.toCharArray()[0]){
                    list.addData(item);
                }
            }
        }

        for(LinkedList list : linkedList){
            System.out.print(list.alphabet + " : ");
            list.showData();
        }
    }

    public static void main(String[] args) {
        String[] input = {"apple", "watermelon", "banana", "apricot", "kiwi", "blueberry"};
        dataCollect(input);

        System.out.println();
        String[] input2 = {"ant", "kangaroo", "dog", "cat", "alligator", "duck", "crab"};
        dataCollect(input2);
    }
}
