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
        int[] visited = new int[arr.length];   //이미 출력한 값은 출력했다는 의미로 놔둔 visited 배열
        int visitCnt = 0;
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;

        while(visitCnt < arr.length){
            for(int i = 0;i<arr.length ; i++){
                if(arr[i] < minVal && visited[i] ==0){  //visited[i] 에 값이 0 이라면, minVal을 arr[i]로 변경
                    minVal = arr[i];
                    minIdx = i;
                }
            }

            if(minIdx != -1){
                System.out.println(minVal + " ");
                visited[minIdx] = 1;
                visitCnt++;
            }

            //while문 돌리기 전에 값 복구
            minVal = Integer.MAX_VALUE;
            minIdx = -1;
        }

        System.out.println();
    }
}
