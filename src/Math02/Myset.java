package Math02;

import java.util.ArrayList;

/**
 * 02.집합
 */


public class Myset {
    //ArrayList
    ArrayList<Integer> list;

    //생성자1
    Myset() {
        this.list = new ArrayList<Integer>();
    }

    //생성자2
    Myset(int[] arr) {
        this.list = new ArrayList<Integer>();

        for (int item : arr) {
            this.list.add(item);
        }
    }

    //원소 추가 중복x
    public void add(int x) {
        for (int item : this.list) {
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }

    //교집합
    public Myset retainAll(Myset B) {
        Myset result = new Myset();

        for (int itemA : this.list) {
            for (int itemB : B.list) {
                if (itemA == itemB) {
                    result.add(itemA);
                }
            }
        }
        return result;
    }


    //합집합
    public Myset addAll(Myset b) {
        Myset result = new Myset();

//        for(int itemA : this.list){
//            for(int itemB : b.list){
//                if(itemA == itemB){
//                    result.add(itemA);
//                }else{
//                    result.add(itemA);
//                    result.add(itemB);
//                }
//            }
//        }

        //add method 중복은 추가하지 않게 메소드를 위에서 만들었음
        for (int itemA : this.list) {
            result.add(itemA);
        }

        for (int itemB : b.list) {
            result.add(itemB);
        }

        return result;
    }

    //차집합
    public Myset removeAll(Myset b) {
        Myset result = new Myset();

        for (int itemA : this.list) {
            boolean containFlag = false; //같은 원소가 있는지 확인

            for (int itemB : b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }

            if (!containFlag) { //false라면 true로 add실행
                result.add(itemA);
            }
        }
        return result;
    }

}
