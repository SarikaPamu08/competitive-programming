// Problem : Prime Subset Selection I
// Link : https://leetcode.com/contest/weekly-contest-523/problems/prime-subset-selection-i/description/
// Contest : LeetCode Weekly Contest 523


class Solution {
    static boolean[] prime;
    static{
        int k = (int)(1e6);
        prime = new boolean[k+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i = 2 ; (long)i*i <= k ; i++){
            if(prime[i]){
                for(int j = i*i ; j <= k ; j+=i){
                    prime[j] = false;
                }
            }
        }
    }
    
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();
        long sum = 0;
        int l = 0;
        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                sum += i;
                if(sum <= (long)s){
                    ans.add(l , i);
                    l++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}