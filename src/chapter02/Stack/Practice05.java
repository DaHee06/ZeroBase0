package chapter02.Stack;

//후위표기법 연산
//참고 설명)전위/중위/후위 표기법

//입력 : " 2 2 + " //후위 표기법
//출력 : 4

//입력 : "2 2 -"
//출력 : 0

//입력 :5 2 - 인경우 2-5가 되지 않게 주의

import java.util.Stack;

public class Practice05 {
    public static double calculate(String string){
//        Stack stack = new Stack();
        Stack<Double> stack = new Stack();
        for(String str : string.split(" ")){ //공백 기준으로 split
            if(str.equals("+")){
//                stack.push((double)stack.pop() + (double)stack.pop()); //제네릭이기 때문에 형변환 필요
                stack.push(stack.pop() + stack.pop());
            }else if(str.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(str.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(str.equals("/")){
                stack.push(1/stack.pop() * stack.pop());
            }else{ //일반 연산자가 아닌 경우, 숫자가 들어온 경우 Double로 바꿔서 push
                stack.push(Double.parseDouble(str));
            }
        }
        return stack.pop(); //최종 결과 연산된 값이 stack
    }

    public static void main(String[] args) {
        System.out.println(calculate("2 2 +"));  //4
        System.out.println(calculate("2 2 -"));  //0
        System.out.println(calculate("2 2 *"));  //4
        System.out.println(calculate("2 2 /"));  //1

        System.out.println(calculate("1 1 + 2 * 3 * 2 / 5 -"));  //1
        System.out.println(calculate("5 2 * 3 - 8 * 4 /"));  //14
    }
}
