package chapter02.Array;

//2차원 배열 arr을 시계방향 90도 회전시킨 결과를 출력하시오

//arr :
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15

//결과 :
//11 6 1
//12 7 2
//13 8 3
//14 9 4
//15 10 5

public class Practice07 {

    //배열 출력 메소드
    static  void printArr(int[][] arr){
        for(int[] item10 : arr){
            for(int item : item10){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}
                      ,{6, 7, 8, 9, 10}
                      ,{11, 12, 13, 14, 15}};

        int[][] arr90 = new int[arr[0].length][arr.length]; //arr[0].length = 5 , arr.length = 3

        for(int i = 0; i <arr.length; i++){
            for(int j =0 ; j < arr[i].length ; j++){
                int r = arr.length - 1 -i;
                arr90[j][r] = arr[i][j];   //새로로 등록
            }
        }

        printArr(arr);
        System.out.println("====After====");
        printArr(arr90);
    }
}
