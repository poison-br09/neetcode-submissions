class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();


        for(int i=0;i<nums.length; i++){
            set.add(nums[i]);
        }

        int max=0;
        int temp = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }
}
