package Math03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *경우의 수
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("======합의 법칙=====");

        //주사위 두개를 던졌을 때 합이 3의 배수 또는 4의 배수가 되는 경우

        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        //기본 풀이
        for(int item1 : dice1){
            for(int item2 : dice2){
                if((item1 + item2) % 3 == 0){
                    nA += 1;
                }

                if((item1 + item2) % 4 == 0){
                    nB += 1;
                }

                if((item1 + item2) % 12 == 0){
                    nAandB += 1;
                }
            }
        }
        System.out.println("결과: " + (nA + nB - nAandB));

        //HashSet 이용
        HashSet<ArrayList> allCase = new HashSet<ArrayList>();
        for(int item1 : dice1){
            for(int item2 : dice2){
                if((item1 + item2) % 3 == 0 || (item1 + item2) % 4 == 0 ){
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list); //HashSet 중복코드 알아서 제거
                }
            }
        }
        System.out.println("결과: " + allCase.size());



        //곱의 법칙 : 사건이 동시에 일어날 확률 nA * nB
        System.out.println("=====곱의 법칙=====");

        nA = 0;
        nB = 0;

        for(int item1 : dice1){
            if(item1 % 3 == 0 ){
                nA++;
            }
        }

        for(int item1 : dice2){
            if(item1 % 4 == 0 ){
                nB++;
            }
        }

        System.out.println("곱의 법칙 : " + (nA * nB));

    }
}
