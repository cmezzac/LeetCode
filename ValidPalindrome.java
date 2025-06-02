class Solution {
    public boolean isPalindrome(String s) {

        String string = s.replace(" ","");
        System.out.println(string);

        for(int i=0, j=string.length()-1;i<j;){
            char c1 = string.charAt(i);
            char c2 = string.charAt(j);

            if(!Character.isLetterOrDigit(c1)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                j--;
                continue;
            }

            if(Character.toUpperCase(c1)!=Character.toUpperCase(c2)){
                return false;
            }
            i++;
            j--;
        }
        return true; 
    }
}
