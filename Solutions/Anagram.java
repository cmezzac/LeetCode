import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            var counter =  map1.getOrDefault(c,0);
            map1.put(c,++counter);
        }

        for(int i =0; i<t.length();i++){
            char c = t.charAt(i);
            var counter = map2.getOrDefault(c,0);
            map2.put(c,++counter);
        }

        if(map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
}
