class Solution {
    public boolean isPrime(int n)
    {
        int i;
        
        i = 2;
        while(i * i <= n)
        {
            if(n % i == 0)
                return (false);
            i++;
        }
        return (true);
    }
    public int countPrimes(int n) {
        int num, i;

        i   = 2;
        num = 0;
        if (n < 2) return (0);
        while(i < n)
        {
            if(isPrime(i))
            {
                // System.out.println(i);
                // System.out.println(" this is prime nimber");
                num++;
            }
            i++;
        }
        return num;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        System.out.println(sol.countPrimes(10));
        // System.out.println(sol.countPrimes(9));
        // System.out.println(sol.countPrimes(12));
        // System.out.println(sol.countPrimes(25));
    }
}
