import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0){return 0;}
        HashSet<Integer> set = new HashSet<>();

        //Add numbrs to thet set. 
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }

        //find min and max numbers.
        int min = nums[0];
        int max = nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        
        int currentStreak = 1;
        int bestStreak = 0;
        
        for(int num :set){

            if(!set.contains(num-1)){
                int currentValue = num;
                while(set.contains(currentValue+1)){
                    currentStreak++;
                    currentValue++;
                }
                bestStreak = Math.max(bestStreak,currentStreak);
                currentStreak=1;
            }
            
            
        }

        return bestStreak;
    }
}
