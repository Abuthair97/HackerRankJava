package HackerRank.Java;

import java.util.Scanner;

/*
        Intput
*       java 100
        cpp 65
        python 50

        outPut
================================
java           100
cpp            065
python         050
================================
* */
public class JavaOutputFormattingProblem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
               "================================"
        );
        for (int i = 1; i <= 3; i++) {
            String s =sc.next();
            int n = sc.nextInt();
            System.out.printf("%-14s%03d \n ",s,n);
        }
        System.out.println(
                "================================"
        );
    }
}
