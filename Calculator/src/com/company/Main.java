package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean a;
        String plus = "+";
        String minus = "-";
        String division = "/";
        String multi = "*";


        do {
            a = true;
            System.out.println("첫번째 값을 입력하시오.");
            int x = scan.nextInt();

            System.out.println("두번째 값을 입력하시오.");
            int y = scan.nextInt();

            System.out.println("연산자(+,-,/,*)를 입력하시오.");

            String operator = scan.next();

            int result = 0;
                a = false;
                do {
                    if (operator.equals(plus)) {
                        result = x + y;
                        a = false;
                        System.out.println(result);
                    } else if (operator.equals(minus)) {
                        result = x - y;
                        a = false;
                        System.out.println(result);
                    } else if (operator.equals(multi)) {
                        result = x * y;
                        a = false;
                        System.out.println(result);
                    } else if (operator.equals(division)) {
                        result = x / y;
                        a = false;
                        System.out.println(result);
                    } else {
                        System.out.println("연산자(+,-,/,*)를 입력하시오.");
                    }
                } while (a);
                System.out.println("더 하냐? Y 또는 N 입력.");
                String loop = scan.next();

                if (loop.equals("y") || loop.equals("Y")) {
                    continue;
                } else {
                    System.out.println("종료함.");
                    break;
                }
            } while(true);

    }
}
