package HackerRank.Java;

import java.util.Scanner;

/*
*intput
* 42
 3.1415
 Welcome to HackerRank's Java tutorials!
*
* Output
* String: Welcome to HackerRank's Java tutorials!
 Double: 3.1415
 Int: 42
*
*  */
public class StdInandStdout2Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();


        System.out.println("string:  " + s);
        System.out.println("Double:  " + d);
        System.out.println("Int:  " + n);
    }
}
