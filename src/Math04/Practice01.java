package Math04;

//1,2,3,4 를 이용하여 세자리 자연수를 만드는 방법(순서 o, 중복 x)의 각 결과를 출력하시오
//방법 1

public class Practice01 {
    void permutation(int[] arr, int depth, int n, int r){

        if(depth == r ){
            for(int i =0; i < r ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return; //재귀함에서 탈출 조건이 반드시 있어야 한다.
        }
        for(int i = depth; i <n ; i++){
            swap(arr , depth, i);
            permutation(arr, depth+1, n , r); //return시 depth=2로 리턴
            swap(arr , depth, i);
        }
    }

    void swap(int[] arr, int depth, int idx){
        int tmp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = tmp;
    }

    public static void main(String[] args){
        //Test code
        int[] arr = {1, 2, 3, 4};

        Practice01 p = new Practice01();
        p.permutation(arr, 0 , 4 , 3);

    }
}
