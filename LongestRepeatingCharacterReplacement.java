import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freqs = new HashMap<Character, Integer>();
        int left = 0;
        int right = 0;
        int mostFreq = 0;
        int maxLen = 0;
        int numNeeded = 0;
        while (right < s.length()) {
            if (freqs.containsKey(s.charAt(right))) {
                freqs.put(s.charAt(right), freqs.get(s.charAt(right)) + 1);
            } else {
                freqs.put(s.charAt(right), 1);
            }
            // System.out.println(freqs);
            mostFreq = Math.max(mostFreq, freqs.get(s.charAt(right)));
            numNeeded = right - left + 1 - mostFreq;
            if (numNeeded > k) {
                freqs.put(s.charAt(left), freqs.get(s.charAt(left)) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
            right++;
        }
        return maxLen + 1;
    }
}
