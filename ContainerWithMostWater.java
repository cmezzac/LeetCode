class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0;
        int j = heights.length-1;

        int maxVolume = 0; 

        while(i<j){

            int height = Math.min(heights[i],heights[j]);
            int width = j-i;

            int volume = height * width;
            System.out.println(volume+" ");
            
            if(volume>maxVolume){
                maxVolume = volume;
                
            }

            if(heights[i]<heights[j]){
                i++;
            }
            else
            {
                j--;
            }

        }
        return maxVolume;

    }
}

