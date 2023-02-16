package chapter02;

//배열 arr의 값을 오름차순

import java.util.Arrays;

public class Practice05 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 6, 1};

        //내답
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //강의
        int[] visited = new int[arr.length];
        int visitCnt = 0;
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;

        while(visitCnt < arr.length){
            for(int i = 0;i<arr.length ; i++){
                if(arr[i] < minVal && visited[i] ==0){
                    minVal = arr[i];
                    minIdx = i;
                }
            }
        }
    }
}
