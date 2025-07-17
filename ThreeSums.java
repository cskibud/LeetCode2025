import java.util.*;
public class ThreeSums {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j = i; j < nums.length; j++) {
                if (j == i) continue;
                if (map.containsKey(target - nums[i] - nums[j])) {
                    ArrayList<Integer> tempArr = new ArrayList<Integer>();
                    tempArr.add(nums[map.get(target - nums[i] - nums[j])]);
                    tempArr.add(nums[i]);
                    tempArr.add(nums[j]);
                    Collections.sort(tempArr);
                    if (!list.contains(tempArr))
                        list.add(tempArr);
                }
                map.put(nums[j], j);
            }
        }
        return list;
    }
}