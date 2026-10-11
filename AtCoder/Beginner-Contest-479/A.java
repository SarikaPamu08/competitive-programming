// Problem : Odd Index Sum
// Link : https://atcoder.jp/contests/abc479/tasks/abc479_a
// Contest : Beginner Contest 479


import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int sum = 0;
    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
      if(i%2 == 0){
        sum += a[i];
      }
    }
    System.out.println(sum);
  }
}