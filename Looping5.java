Trendy Numbers
Write a program to check whether the given number is a trendy number or not. A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3. Input format: The input containing an integer 'n' which denotes the given number Output format: If the given number is a trendy number, then print "Trendy Number". Otherwise, print "Not a Trendy Number".
Example 1:

Input: 

 
791


Output:

Trendy Number

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int x,y,z;
    x=m.nextInt();
    y=x/10;
    z=y%10;
    if(z/3!=0){
      System.out.print("Trendy Number");
    }else{
      System.out.print("Not a Trendy Number");
    }
  }
}
