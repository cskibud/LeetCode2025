public class PalindromeNumber {
    // doesn't work with 0's like 100021
    // public boolean isPalindrome(int x) {
    //     if (x < 0) return false;
    //     while (x/10 >= 1) {
    //         int digits = (int) Math.log10(x);
    //         int first = (int)(x / (int)(Math.pow(10, digits)));
    //         int last = x % 10;
    //         if (first != last) {
    //             return false;
    //         }
    //         x -= Math.pow(10, digits) * first;
    //         x %= 10;
    //     }
    //     return true;
    // }
    // works not fastest
    // public boolean isPalindrome(int x) {
    //     String str = x + "";
    //     int n = str.length();
    //     for (int i = 0; i < n/2; i++) {
    //         if (str.charAt(i) != str.charAt(n-1-i)) return false;
    //     }
    //     return true;
    // }
    public boolean isPalindrome(int x) {
        int z = x;
        int newX = 0;
        while (x > 0) {
            int rem = x%10;
            newX = newX*10 + rem;
            x /= 10;
        }
        if (z == newX) return true;
        return false;
    }
}
