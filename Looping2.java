
Factorial Number
Write a program to determine whether 'n' is a factorial number or not. Factorial of a number is the product of all positive numbers from 1
 to 'n'. Input format: The input containing an integer 'n' which denotes the given number. Output format: If the given number is factorial, 
 print "Yes". Otherwise, print "No".
Example 1:

Input: 

 
6


Output:

Yes

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,fact=1,x=1;
    n=m.nextInt();
    while(fact<n){
      x+=1;
      fact*=x;
    }
    if(fact==n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
