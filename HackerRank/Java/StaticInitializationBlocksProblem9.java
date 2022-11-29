package HackerRank.Java;

import java.util.Scanner;

/*
* input
* 1
  3

output
* 3
*
*
* input
-1
2
* output
* java.lang.Exception: Breadth and height must be positive
* */
public class StaticInitializationBlocksProblem9 {
static  int B;
static int H;
static  boolean flag = true;

static {
    Scanner sc = new Scanner(System.in);
    B= sc.nextInt();
    H = sc.nextInt();
    try{
     if(B <= 0  || H <= 0){
         flag = false;
         throw  new Exception("Breadth and height must be positive");
     }
    }catch (Exception e){
     System.out.println(e);
    }
}
    public static void main(String[] args) {
    if(flag){
        int area = B*H;
        System.out.println(area);
    }
    }
}
