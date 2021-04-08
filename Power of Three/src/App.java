class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        while(n / 3 != 0)
        {
            if(n == 3) return true;
            if(n % 3 != 0) return false;
            n = n/3;
        }
        return false;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfThree(9));
        System.out.println(sol.isPowerOfThree(3));
        System.out.println(sol.isPowerOfThree(0));
        System.out.println(sol.isPowerOfThree(81));
        System.out.println(sol.isPowerOfThree(5));
        System.out.println(sol.isPowerOfThree(4));
        System.out.println(sol.isPowerOfThree(1));
    }
}
