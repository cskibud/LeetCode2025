public class HappyNumber {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            fast = getNext(getNext(fast));
            slow = getNext(slow);
            // System.out.println("f: " + fast);
            // System.out.println("s: " + slow);
        } while (fast != 1 && slow != fast);
        return fast == 1;
    }
    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
