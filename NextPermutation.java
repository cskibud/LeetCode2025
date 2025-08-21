import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int changeInd = -1;
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                changeInd = i-1;
                break;
            }
        }
        if (changeInd == -1) {
            Arrays.sort(nums);
            return;
        }
        // find next biggest
        int nextBigInd = changeInd+1;
        for (int i = changeInd+2; i < nums.length; i++) {
            if (nums[i] > nums[changeInd] && nums[i] < nums[nextBigInd]) {
                nextBigInd = i;
            }
        }
        // swap
        int temp = nums[changeInd];
        nums[changeInd] = nums[nextBigInd];
        nums[nextBigInd] = temp;

        Arrays.sort(nums, changeInd+1, nums.length);
    }
    // public void reverse(int[] nums, int start, int end) {
    //     while(start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         end--;
    //         start++;
    //     }
    // }
}
