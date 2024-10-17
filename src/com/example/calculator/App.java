package com.example.calculator;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String endMsg = "";

        do {
            //과제 Lv 1. 클래스 없이 계산기 개발 //
            //양의 정수(0포함) 2개 입력받기
            //하나씩 전달 받기
            //입력받은 정수 변수에 저장
            System.out.println(">> 첫 번째 피연산자를 입력하세요. (0포함 양의 정수)");
            Scanner sc = new Scanner(System.in);
            int tmpInt = sc.nextInt();
//        do {
//            tmp = sc.nextInt();
//        }
//        while (tmp < 0);
            while (tmpInt < 0) {
                System.out.println("[error] 피연산자는 0보다 크거나 같은 정수만 입력 가능합니다. 다시 입력하세요.");
                tmpInt = sc.nextInt();
            }
            int a = tmpInt;
            System.out.println(">> 입력한 첫 번째 피연산자는: " + a);

            System.out.println(">> 두 번째 피연산자를 입력하세요. (0포함 양의 정수)");
            tmpInt = sc.nextInt();
            while (tmpInt < 0) {
                System.out.println("[error] 피연산자는 0보다 크거나 같은 정수만 입력 가능합니다. 다시 입력하세요.");
                tmpInt = sc.nextInt();
            }
            int b = tmpInt;
            System.out.println(">> 입력한 두 번째 피연산자는: " + b);
            //

            //사칙연산 기호 Scanner로 입력받기
            //입력받은 기호 charAt(0) 등 적합한 타입으로 변수에 저장
            System.out.println(">> 연산자(+,-,*,/)를 입력하세요.");
            String tmpStr = sc.next();
            char cal = tmpStr.charAt(0); //입력한 첫번째 글자를 char 형태로 연산자 변수에 저장
            while (!(cal == '+' || cal == '-' || cal == '*' || cal == '/')) {
                System.out.println("[error] 연산자는 +,-,*,/만 입력 가능합니다. 다시 입력하세요.");
                tmpStr = sc.next();
                cal = tmpStr.charAt(0);
            }
            System.out.println(">> 입력한 연산자는: " + cal);


            //연산 진행 후 결과값 출력하기
            // 키워드 : if, switch
            // 오류가 발생할 경우 오류에 대한 내용을 정제하여 출력 ex. 나눗셈에서 분모에 0이 입력될 수 없습니다.
            System.out.println(">> 연산을 수행합니다...");
            int rslt = 0;
            if (cal == '+' || cal == '-' || cal == '*') { //나눗셈이 아닐 때
                switch (cal) {
                    case '+':
                        rslt = a + b;
                        break;
                    case '-':
                        rslt = a - b;
                        break;
                    case '*':
                        rslt = a * b;
                        break;
                    default:
                }
            } else { //나눗셈일 때
                if (b == 0) {
                    System.out.println("[error] 나눗셈에서 분모에 0이 입력될 수 없습니다. 처음부터 시작합니다...");
                    continue;
                } else {
                    rslt = a / b;
                }
            }
            System.out.println(">> [결과] " + a + cal + b + "=" + rslt);
            System.out.println(">> 끝내려면 exit을 입력하세요...");
            endMsg = sc.next().toLowerCase();
            if (endMsg.equals("exit")) {
                break;
            }
        } while (endMsg != "exit"); //exit 입력할 때까지 무한으로 계산할 수 있도록 소스 수정하기


    }
}
