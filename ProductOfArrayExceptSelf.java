public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        int product1 =1;
        int product2 =1;
        

        //prefix
        for(int i=0;i<nums.length;i++){
            prefix[i]= product1;
            product1 *= nums[i];
        }

        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }

        for(int i=nums.length-1;i>=0;i--){
            postfix[i] = product2;
            product2 *= nums[i];
        }


        for(int i=0;i<result.length;i++){
            result[i] = prefix[i]*postfix[i];
        }

        return result;
    }
}
