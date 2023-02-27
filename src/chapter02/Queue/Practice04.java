package chapter02.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

/* 요새푸스 문제
 * N과 K가 주어졌을때 (N, K) 요새푸스 순열을 구하시오.
 * N과 k는 N>>K를 만족하는 양의 정수이다.
 * 1부터 N번까지 N열이 순서대로 원을 이루러 모여있다.
 * 이 모임에서 원을 따라 순서대로 K번째 사람을 제외한다.
 * 모든 사람이 제외될 때까지 반복하며 이 때, 제외되는 순서가 요새푸스 순열이다.
 *
 * 입력 : N = 5 , K = 2
 * 결과 : 2, 4, 1, 5, 3
 *
 * 입력 : N = 7 , k = 3
 * 결과 : 3, 5, 2, 7, 5, 1, 4
 *
 */
public class Practice04 {
    public static ArrayList getJosephusPermutation(int N, int K){
        Queue queue = new LinkedList();
        ArrayList result = new ArrayList();

        IntStream.range(1, N+1).forEach(x -> queue.add(x));

        int cnt = 0;  //K번쨰 사람임을 카운팅
        while(!queue.isEmpty()){
            int data = (int)queue.remove();
            cnt += 1;

            if(cnt % K == 0){
                result.add(data);
            }else{
                queue.add(data);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getJosephusPermutation(5, 2));
        System.out.println(getJosephusPermutation(7 ,3));
    }
}
