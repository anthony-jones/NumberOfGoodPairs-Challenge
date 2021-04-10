import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairCount = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                int freq = Collections.frequency(list, nums[i]);
                pairCount += freq;
            }
                list.add(nums[i]);
            }
        return pairCount;
    }
}
