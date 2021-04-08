import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<String>();
        while(n > 0)
        {
            if(n % 3 == 0 && n % 5 == 0)
            {
                s.add(0, "FizzBuzz");
            }
            else if(n % 3 == 0)
            {
                s.add(0, "Fizz");
            }
            else if(n % 5 == 0)
            {
                s.add(0, "Buzz");
            }
            else
                s.add(0, String.valueOf(n));
            n--;
        }
        return (s);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        List<String> s = sol.fizzBuzz(15);
        System.out.println(Arrays.deepToString(s.toArray()));
    }
}
