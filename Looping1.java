Amoeba Multiplication
The environmental eco-club has discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting their amoeba in a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index is given, write a program to displays the amoeba’s size……??? For Example, The size of the amoeba on month 1, 2, 3, 4, 5, 6, ..will be 0, 1, 1, 2, 3, 5, 8 respectively. Input format: The first input containing an integer which denotes the number of the month Output format: Print the amoeba size. Input:7 output:8
Example 1:

Input: 

 
13


Output:

144

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,a=0,b=1,c=a+b;
    n=m.nextInt();
    while(n!=3){
      a=b;
      b=c;
      c=a+b;
      n--;
    }
    System.out.println(c);
  }
} 
