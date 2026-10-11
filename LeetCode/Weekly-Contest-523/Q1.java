// Problem : Three Fibonacci Sum
// Link : https://leetcode.com/contest/weekly-contest-523/problems/three-fibonacci-sum/
// Contest : Weekly Contest 523


class Solution {
    static ArrayList<Integer> pre;
    static{
        pre = new ArrayList<>();
        int fib[] = new int[45];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2 ; i < 45 ; i++){
            fib[i] = fib[i-1] + fib[i-2];
            pre.add(fib[i] + fib[i-1] + fib[i-2]);
        }
    }
    public boolean threeFibonacciSum(int n) {
        if(pre.contains(n)){
            return true;
        }else{
            return false;
        }
    }
}