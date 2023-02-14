package chapter02;

//배열 Arr의 모든 데이터에 대해서, 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력하세요.
//입출력 예시 )
//배열 arr : 1, 2, 3, 4, 5, 6, 7, 8, 9
//결과 : 짝수 평균 : 5.0 , 홀수 평균 : 5.0

public class Practice01 {
    public static void main(String[] args) {
        /*내 풀이*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        int odd = 0 ;
        int even = 0 ;
        int cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]%2 ==0) {
                even += arr[i];
                cnt++;
            }
            else{
                odd += arr[i];
                cnt2++;
            }
        }
        System.out.println("짝수 평균 : " + even/cnt);
        System.out.println("홀수 평균 : " + odd/cnt2);
    }
}
