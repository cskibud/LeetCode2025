import java.util.*;

public class LongestSubstringNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0 || length == 1) return length;
        Set<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < length) {
            char r = s.charAt(right);
            if (set.contains(r)) {
                max = Math.max(max, right-left);
                while (true) {
                    set.remove(s.charAt(left));
                    if (s.charAt(left) == r) {
                        left++;
                        break;
                    }
                    left++;
                }
            }
            set.add(r);
            right++;
        }
        return Math.max(max, set.size());
    }
}
