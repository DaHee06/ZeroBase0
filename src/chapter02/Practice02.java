package chapter02;
// 배열 arr에서 target 내 해당되는 값의 인덱스를 출력
// 해당 값이 여러 개 인 경우 가장 큰 인덱스를 출력

//입출력 예시)
//배열 arr : 1, 1, 100, 1, 1, 1, 100
//target : 100
// 결과 :6

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;
        int idxMax = -1;  //인덱스 번호

        for(int i = 0; i<arr.length ; i++){
            if(target == arr[i]) {
                if(i > idxMax){
                    idxMax = i;
                }
            }
        }
        if(idxMax >= 0){
            System.out.println(idxMax);
        }
    }
}
