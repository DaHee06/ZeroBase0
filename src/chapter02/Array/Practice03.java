package chapter02.Array;

//배열 arr 데이터 순서를 거꾸로 변경하시오
//추가 배열을 사용하지 않고 구현

//입출력 예시)
//arr : 1, 3, 5, 7, 9
//결과 : 9, 7, 5, 3, 1

import java.util.Arrays;

public class Practice03 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        //틀린 내 답 - Arrays.toString
        int[] ans = new int[arr.length];
        int cnt=0;

        for(int i=arr.length-1; i>=0 ; i--){
            ans[cnt] = arr[i];
            cnt++;
        }
        System.out.println(ans); //[I@3ac3fd8b
        System.out.println("내 답안 ==== " + Arrays.toString(ans));


        //답안
        for(int i = 0; i<arr.length / 2 ; i++){ //중간 지점 기준으로 양 옆 숫자가 바뀌는 것
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];  //arr.length - 1 -i
            arr[arr.length - 1 - i] = tmp;
        }

        System.out.println((Arrays.toString(arr)));
    }
}
