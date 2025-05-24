import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //Hash map -> keeps track of the # occurance of an integer n. 
        HashMap<Integer,Integer> map = new HashMap<>();
    
        List<Integer>[] buckets = new ArrayList[nums.length+1];


        for(int i =0; i<nums.length;i++){
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i],++count);
        }

        for(int i=0;i<=nums.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            buckets[value].add(key);
        }

        int[] res = new int[k];  // Correct type
        int index = 0;
        
        for(int i=buckets.length-1;i>0 && index<k ;i--){
            for(int j = 0;j<buckets[i].size();j++){
                res[index] = buckets[i].get(j);
                index++;
            }
        }

        return res;
      

    }
}
