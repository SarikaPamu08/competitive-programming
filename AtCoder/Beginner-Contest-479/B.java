// Problem : Longest Rainy Streak
// Link : https://atcoder.jp/contests/abc479/tasks/abc479_b
// Contest : Beginner Contest 479


import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    int c = 0;
    for(char ch : s.toCharArray()){
      if(ch == 'R'){
        c++;
      }else{
        c = 0;
      }
      ans = Math.max(ans, c);
    }
    System.out.println(ans);
  }
}
    