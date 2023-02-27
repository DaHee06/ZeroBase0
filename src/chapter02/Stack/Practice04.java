package chapter02.Stack;

//괄호 짝 검사

//입력출력 예시
//입력 : "("
//출력 : Fail

//입력 : ")"
//출력 : Fail

//입력 : "()"
//출력 : Pass

import java.util.Stack;

public class Practice04 {
    public static void checkParenthesis(String str){
        Stack stack = new Stack();
        boolean checkFlag = true;

        for(String s : str.split("")){ //한글자씩 받아옴
            if(s.equals("(")){
                stack.push(s);
            }else{
                if(stack.isEmpty()){
                    checkFlag = false;
                    break;
                } else{
                    stack.pop();
                }
            }
        }
        if(checkFlag && stack.isEmpty()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        checkParenthesis("(");
        checkParenthesis(")");
        checkParenthesis("()");
        checkParenthesis("()()()");
        checkParenthesis("(())()");
        checkParenthesis("(((()))");
    }
}
