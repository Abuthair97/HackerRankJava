package HackerRank.Java;

import java.util.Scanner;

/*
* Input
* 2
*
*Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
* */
public class JavaLoop1Problem6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= 10 ;i++){
        int value = n*i;
        System.out.println(n+" x "+i+" = "+value);
    }

    }
}
