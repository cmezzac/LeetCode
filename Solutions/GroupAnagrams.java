import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];

            char[] chars = s.toCharArray();

            //Sort 
            Arrays.sort(chars);

            //see if they are inside the Map

            String check  = new String(chars);

            if(hashMap.containsKey(check)){
                hashMap.get(check).add(s);
            }
            else{
                ArrayList<String> tempList = new ArrayList<>();
                
                 tempList.add(s);

                 hashMap.put(check,tempList);
            }
        }
        System.out.println(hashMap.values());

        return new ArrayList<>(hashMap.values());

    }
}
