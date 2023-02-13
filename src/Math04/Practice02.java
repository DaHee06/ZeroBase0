package Math04;

//1,2,3,4 를 이용하여 세자리 자연수를 만드는 방법(순서 o, 중복 x)의 각 결과를 출력하시오
//방법 2

import java.util.Arrays;

public class Practice02 {
    void permutation(int[] arr, int depth , int n , int r, boolean[] visited, int[] out){
        //visited : 해당 자리수를 방문 했는지

        if(depth == r){
            System.out.println(Arrays.toString(out));
            return;
        }
        for(int i=0 ; i<n ;i++){
            if(visited[i] != true){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth+1 , n ,r , visited, out);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int r = 3;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n]; //초기 false -> [0, 0, 0, 0]
        int[] out = new int[r];

        Practice02 p = new Practice02();
        p.permutation(arr , 0 , n , r , visited, out);
    }
}
