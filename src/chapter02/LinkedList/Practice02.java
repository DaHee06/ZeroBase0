package chapter02.LinkedList;

//양방향 연결 리스트(Double Linked List) 구현

class NodeBi{
    int data;
    NodeBi next;
    NodeBi prev;

    NodeBi(int data, NodeBi next, NodeBi prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList extends LinkedList{
    NodeBi head;
    NodeBi tail;

    DoublyLinkedList(NodeBi node){
        this.head = node;
        this.tail = node;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    public void addData(int data, Integer beforeData){
        if(this.head == null){
            this.head = new NodeBi(data, null, null);
            this.tail = this.head;
        }else if(beforeData == null) {
            this.tail.next = new NodeBi(data, null, this.tail);   //this.tail - new NodeBi : prev에 this.tail값을 넣는다.
            this.tail = this.tail.next;  //tail을 새로 들어온 NodeBi으로 바꾼다.
        }else{
            NodeBi cur = this.head;
            NodeBi pre = cur;
            while(cur != null){
                if(cur.data == beforeData) {
                    if(cur == this.head){
                        this.head = new NodeBi(data, this.head, null);
                        this.head.next.prev = this.head;   //바뀐 head의 next의 prev(기존 head)를 바뀐 헤드로 바꾼다.
                    } else{
                        pre.next = new NodeBi(data, cur, pre);
                        cur.prev = pre.next;
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.head;
        NodeBi pre = cur;

        while(cur != null){
            if(cur.data == data){
                if(cur == this.head && cur == this.tail){  //node가 하나인 경우
                    this.head = null;
                    this.tail = null;
                } else if(cur == this.head){
                    this.head = cur.next;  //head를 옮김
                    this.head.prev = null;  //바꾼 head의 prev == 기존 head
                } else if(cur == this.tail){
                    this.tail = this.tail.prev;  //tail을 옮김
                    this.tail.next = null;
                } else{
                    pre.next = cur.next;   //지울 대상이 cur
                    cur.next.prev = pre;
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public void showData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void showDataFromTail(){   //역순으로부터 showData
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.tail;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.prev;
        }
        System.out.println();
    }
}

public class Practice02 {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList(new NodeBi(1, null ,null));
        myList.showData();  //1

        myList.addData(2, null);
        myList.addData(3,null);
        myList.addData(4,null);
        myList.addData(5,null);
        myList.showData();   //1 2 3 4 5
        myList.showDataFromTail();  //5 4 3 2 1

        myList.addData(100,1);
        myList.addData(200, 2);
        myList.addData(300, 3);
        myList.addData(400, 4);
        myList.addData(500, 5);
        myList.showData();   //100 1 200 2 300 3 400 4 500 5
        myList.showDataFromTail();  //5 500 4 400 3 300 2 200 1 100

        myList.removeData(300);
        myList.removeData(100);
        myList.removeData(500);
        myList.removeData(200);
        myList.removeData(400);
        myList.showData();  //1 2 3 4 5
        myList.showDataFromTail(); //5 4 3 2 1

        myList.removeData(3);
        myList.removeData(1);
        myList.removeData(5);
        myList.removeData(2);
        myList.removeData(4);
        myList.showData();  //List is empty;
        myList.showDataFromTail();  //List is empty;


    }
}
