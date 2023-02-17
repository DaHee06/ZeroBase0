package chapter02.Array;


import java.util.Arrays;

class MyArray{

    int[] arr;

    //배열의 초기 사이즈 설정
    MyArray(int size){
        this.arr = new int[size];
    }

    //배열에 데이터 삽입
    public void insertData(int index, int data){
        if(index < 0 || index > this.arr.length){
            System.out.println("Index Error");
            return;
        }

        int[] arrDup = this.arr.clone();  //기존 데이터 복제
        this.arr = new int[this.arr.length + 1]; //기존 데이터에 추가될 것을 고려해 new int로 새로 정의

        for(int i =0; i< index ; i++){
            this.arr[i] = arrDup[i];
        }

        //데이터 추가하려는 위치 다음부터 할당
        for(int i = index + 1 ; i<this.arr.length ; i++){
            this.arr[i] = arrDup[ i - 1 ];
        }

        //원하는 위치에 데이터를 넣어준다.
        this.arr[index] = data;
    }


    //배열에서 특정 데이터 삭제
    public void removeData(int data){

        int targetIndex = -1;

        for(int i = 0; i < this.arr.length ; i++){
            if(this.arr[i] == data){
                targetIndex = i;
                break;
            }
        }

        if(targetIndex == -1 ){
            System.out.println("해당 데이터가 없습니다"); //위의 for문을 돌고 나서 targetIndex == -1
        } else {
            int[] arrDup = this.arr.clone();
            this.arr = new int[this.arr.length - 1];  //데이터 삭제 고려해 길이 -1인 new int 생성

            for(int i  =0 ; i < targetIndex ; i++){
                this.arr[i] = arrDup[i];
            }

            for(int i = targetIndex; i < this.arr.length ; i++){
                this.arr[i] = arrDup[i+1]; //targetIndex(지우려는 데이터) 뺴고 생성
            }

        }
    }

}
public class Practice {
    public static void main(String[] args) {
        int size = 5;
        MyArray myArray = new MyArray(size);

        for(int i  = 0; i <size; i++){
            myArray.arr[i] = i +1;
        }

        System.out.println(Arrays.toString(myArray.arr)); //[1, 2, 3, 4, 5]

        myArray.arr[0] = 10;
        System.out.println(Arrays.toString(myArray.arr));  //[10, 2, 3, 4, 5]

        myArray.insertData(2, 20);
        System.out.println(Arrays.toString(myArray.arr));  //[10, 2, 20, 3, 4, 5]

        myArray.insertData(6, 60);
        System.out.println(Arrays.toString(myArray.arr));  //[10, 2, 20, 3, 4, 5, 60]

        myArray.insertData(-1, 0); //index Error

        myArray.removeData(4);
        System.out.println(Arrays.toString(myArray.arr));  //[10, 2, 20, 3, 5, 60]

        myArray.removeData(5);
        System.out.println(Arrays.toString(myArray.arr));  //[10, 2, 20, 3, 60]

        myArray.removeData(99); // 해당 데이터가 없습니다.
    }

}
