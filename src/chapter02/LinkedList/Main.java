package chapter02.LinkedList;

//간단한 ver

//노드
class Node{
    int data;
    Node next; //링크 관리, 노드가 있을 때 그 다음 노드를 가르킨다.

    Node(){}
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

}

class LinkedList {
    Node head;

    LinkedList(){}
    LinkedList(Node node){
        this.head = node;
    }
    //연결 리스트 비어있는지 확인
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    //연결 리스트의 맨 뒤에 데이터 추가
    public void addData(int data){
        if(this.head == null){
            this.head = new Node(data, null);  // 맨 head에 data 넣을 때 그 다음 데이터가 없으므로 null
        }else{
            Node cur = this.head;
            while(cur.next != null){  //순회하면서 넘어감 (data, next)에서 next가 null이 아니라면
                cur = cur.next;
            }
            cur.next = new Node(data, null);  //연결하는 과정
        }
    }

    //연결 리스트의 맨 뒤에 데이터 삭제
    public void removeData(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node prev = cur;

        while(cur.next != null){
            prev = cur;   //cur 하나 이전을 prev
            cur = cur.next;
        }

        if(cur == this.head){  //뒤에 아무것도 없다면 head가 제일 위에 있어서 null로 바꾸면 된다.
            this.head = null;
        }else{
            prev.next = null;  //만약 아니라면 삭제하려는 노드 앞의 노드(prev)의 next값을 null로 바꾼다.
        }
    }

    //연결 리스트에서 데이터 찾기
    public void findData(int data){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while(cur != null){
            if (cur.data == data){
                System.out.println("Data Exist");
                return;
            }
            cur = cur.next;  //반복하며 순회
        }
        System.out.println("Data not found");
    }

    //연결 리스트의 모든 데이터 출력
    public void showData(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(new Node(1, null));
        myList.showData();   //1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();   //1 2 3 4 5

        myList.findData(3);  //Data Exist!
        myList.findData(100);   //Data not found!

        myList.removeData();
        myList.removeData();
        myList.removeData();
        myList.showData();   //1 2

        myList.removeData();
        myList.removeData();
        myList.removeData();  //List is empty

    }
}
