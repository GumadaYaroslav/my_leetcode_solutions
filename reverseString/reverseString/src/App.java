class Solution {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        if(j == -1)
        {
            return;
        }
        char chr = s[0];
        for(int i = 0; i != s.length / 2; i++)
        {
            chr = s[i];
            s[i] = s[j];
            s[j] = chr;
            j--;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        char s[] = new char[]{'1', '2', '3', '4', '5', '6'};
        // char s[] = new char[]{};
        Solution sol = new Solution();

        sol.reverseString(s);
        for(int i = 0; i != s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}
