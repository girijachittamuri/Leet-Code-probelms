class Solution {
    public int climbStairs(int n) { // n=6
     if(n<=2) return n;
     int prev1 = 1, prev2 = 2;
     for(int i=3;i<=n;i++){ // 3<=3==> T // 4<=6 ==> T //5
        int current = prev1 + prev2;// ==> 1+2 = 3 =>2+3 = 5 // 3+5 = 8 //5+8 = 13
        prev1 = prev2; // prev1 = 2 // 3 // 5 // 8
        prev2 =current; // prev2 = 3 // 5 // 8 // 13
     }
     return prev2;
    }
}
