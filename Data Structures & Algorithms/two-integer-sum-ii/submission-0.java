class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sp = 0; 
        int ep = numbers.length-1;
        int result[] = new int[2];
        while(sp<ep){
            if(numbers[sp]+numbers[ep] < target){
                sp++;
            } else if(numbers[sp]+numbers[ep] > target){
                ep--;
            } else if(numbers[sp]+numbers[ep]== target) {
                result[0] = sp+1;
                result[1] = ep+1;
                return result;
            }  
        }

        return result;
    }
}
