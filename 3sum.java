class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Array ko sort karo
        
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // Duplicate skip karo for 'i'
            if (i > 0 && nums[i] == nums[i-1]) continue;
            
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Duplicate skip karo for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Duplicate skip karo for right
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // value kam hai, left aage badhao
                } else {
                    right--; // value zyada hai, right peeche lao
                }
            }
        }
        return res;
    }
}
