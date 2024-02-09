Fibonacci Number
Write a C program to find whether the given number is a Fibonacci number. INPUT & OUTPUT FORMAT: Input consists of 1 integer. If it is a 
Fibonacci number display “Fibonacci Number” or display “Not Fibonacci Number”. The output consists of 1 integer.

Example 1:

Input: 

 
3


Output:

Fibonacci Number

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,a=0,b=1,c=a+b,cnt=0;
    n=m.nextInt();
    for(int i=1;i<=n;i++){
      a=b;
      b=c;
      c=a+b;
      if(c==n){
        System.out.print("Fibonacci Number");
      cnt=1;
      }
    }
    if(cnt==0){
      System.out.print("Not Fibonacci Number");
    }
  }
}
