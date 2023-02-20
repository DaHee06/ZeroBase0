package chapter02.Practice;

//Palindrome 연결 리스트
//추가 자료구조 없이 연결 리스트만으로 풀어보기
//Palindrome : 앞으로 읽어도 뒤로 읽어도 같은 문자열

//입력예시 )
//입력 연결 리스트 : 1, 3, 5, 3, 1
//결과 : true;

//인결 연결 리스트 : 1, 3, 5, 1
//결과 : false

public class Practice02 {
    public static boolean checkPalindrome(LinkedList list) {
        Node cur = list.head;
        Node left = list.head;
        Node right = null;

        int cnt = 0 ;
        while(cur != null){
            cnt++;
            right = cur;
            cur = cur.next;   // 최종적으로 cur =null, right는 마지막 노드인 상황
        }

        Node prevRight = right;
        for(int i =0 ; i<cnt /2 ; i++){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = left;  //right 처음부터 순환
            while(right.next != prevRight){
                right = right.next;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addData(1);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(3);
        linkedList.addData(1);
        System.out.println(checkPalindrome(linkedList));

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addData(3);
        linkedList2.addData(5);
        linkedList2.addData(5);
        linkedList2.addData(3);
        System.out.println(checkPalindrome(linkedList2));

        LinkedList linkedList3 = new LinkedList();
        linkedList3.addData(1);
        linkedList3.addData(3);
        linkedList3.addData(5);
        linkedList3.addData(1);
        System.out.println(checkPalindrome(linkedList3));
    }
}
