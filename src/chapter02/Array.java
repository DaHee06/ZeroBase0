package chapter02;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        //1차원 배열
        System.out.println("====1차월 배열=====");
        int[] arr = { 1, 2, 3, 4, 5};
        for(int item : arr){
            System.out.println("item = "+ item);
        }

        arr[1] = 100;
        System.out.println("arr = " + Arrays.toString(arr));


        //2차원 배열
        System.out.println("====2차원 배열=====");
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        for(int[] row: arr2){
            for(int item : row){
                System.out.println("item : "+ item);
            }
        }


        //ArrayList - 1차원, 2차원
        System.out.println("====ArrayList ====");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2 ,3 ));
        System.out.println("list1 = " +list1);
        list1.add(4);
        list1.add(5);
        System.out.println("list1 = " +list1);
        list1.remove(2); //인덱스 번호
        System.out.println("list1 = " +list1);
        list1.remove(Integer.valueOf(2)); //삭제하고자 하는 요소
        System.out.println("list1 = " +list1);

        ArrayList list2d = new ArrayList();
        ArrayList list1d1 = new ArrayList(Arrays.asList(1, 2 ,3 ));
        ArrayList list1d2 = new ArrayList(Arrays.asList(4, 5 ,6 ));
        //2차원 배열이 생성됨
        list2d.add(list1d1);
        list2d.add(list1d2);
        System.out.println("list1d1 = " +list1d1);
        System.out.println("list1d2 = " +list1d2);
        System.out.println("list2d = " +list2d);
    }
}
