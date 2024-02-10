
Dollars
Write a C program to add two dollars and cents. INPUT & OUTPUT FORMAT: Input consists of 4 integers. First two inputs correspond to the 
value of the first dollar and cent. Next two inputs correspond to the value of the second dollar and cent. Output should print the sum of 
dollar and cent.

Example 1:

Input: 

 
30
10
140
99


Output:

171
9

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int d1,c1,d2,c2;
    d1=m.nextInt();
    c1=m.nextInt();
    d2=m.nextInt();
    c2=m.nextInt();

    int d=d1+d2+1;
    int c=c1-1;
    System.out.println(d+"\n"+c);
  }
}

