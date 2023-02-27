package chapter02.Stack;

//문자열 뒤집기

//입출력 예시
//입력 : "HELLO"
//출력 : "OLLEH"

import java.util.LinkedList;
import java.util.Stack;

public class Practice03 {
    public static String reverseString(String str){
        Stack stack = new Stack();
        String result = "";

        for(String s : str.split("")){ //한글자씩 받아옴
            stack.push(s);
        }
        while(!stack.isEmpty()){
            result = result + stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String result = reverseString("Hello");
        System.out.println("result : " + result);

        result = reverseString("1 3 5 7 9");
        System.out.println("result : " +result);
    }
}
