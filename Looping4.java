Collatz Program
The rules for generating Collatz Sequence are: If n is even: n = n / 2 If n is odd: n = 3n + 1 For example, if the starting number is 5 
the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1 It has been proved for almost all integers, the repeated application of the above rule will 
result in a sequence that ends at 1. Input:5 Output:5 16 8 4 2 1 5 Input format: The input containing an integer 'n' which denotes the 
given number Output format: Print the numbers in the sequence and also print the number of times the rule has to be applied in order to 
reach 1.
Example 1:

Input: 

 
18


Output:

18
9
28
14
7
22
11
34
17
52
26
13
40
20
10
5
16
8
4
2
1
20

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,c=0;
    n=m.nextInt();
    System.out.println(n);
    while(n!=1){
      if(n%2==0){
        n=n/2;
      }else{
        n=3*n+1;
      }
      System.out.println(n);
      c++;
    }
    System.out.println(c);
}
}
