package chapter02;

//배열 arr에서 peak 값 모두 출력(peak 좌우보다 큰 값)하시오

//입출력 에시)
//arr : 3, 1, 2, 6, 2, 2, 5, 1, 9, 10 ,1 ,11
//결과 : 3, 6, 5, 10, 11

public class Practice04 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10 ,1 ,11};

        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0 && arr[i] > arr[i+1]){
                System.out.println(arr[i] + " ");
            }else if(i == arr.length -1 && arr[i] > arr[i - 1]){
                System.out.println(arr[i] + " ");
            }else {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
