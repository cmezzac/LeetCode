import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index1 = 0;
        int index2 = 0;

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){

                index1 = map.get(target-nums[i]);
                index2 = i;
                break;
            }
            else{
                map.put(nums[i],i);
            }

           
        }
         if(index1<index2){
                return new int[]{index1,index2};
            }
            else{
                 return new int[]{index2,index1};
            }
    }
}
