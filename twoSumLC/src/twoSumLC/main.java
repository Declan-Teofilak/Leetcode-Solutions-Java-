package twoSumLC;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int[] arr = {-3,-2,5,6};
		int target = -5;
		int[] newArr = twoSum(arr, target);
		System.out.println(newArr.toString());
	}
	//this made things way more complicated than they needed to be
	//I stepped away from it for a day and ended up with the code below the comment
	//within ten minutes
    /**public static int[] twoSum(int[] nums, int target) {
    	//counts the loops i.e 
    	//tells what the indices of the first num is
        int c = 0;
        //walks through the array
        for (int n : nums)
        {
        	//creates a new target based on the current number
        	//i.e find = 9 - 2 = 7 (looking for seven)
            int find = target - n;
          //make number positive if needed
            if (target > 0 && find < 0)
            {
                int fix = find * (-2);
                find = find + fix;
                System.out.println(find);
            }
            	//loops through with new target
            for (int i = 0; i < nums.length; i++)
            {
            	//if found creates an array containing their indices
            	//checks to make sure not the same number added twice!
                if (nums[i] == find && c != i)
                {
                	
                	int[] done = {c, i};
                	System.out.println(c + " " + i);
                	return done;
                }
                    
            }
            //increases counter every walk through
            c++;
            }
            //otherwise returns that no pair was found
            return nums;
    }
    */
    public static int[] twoSum(int[] nums, int target) {
    	//SUCCESS!
    	//counts the loops i.e 
    	//tells what the indices of the first num is
        int c = 0;
        //walks through the array
        for (int n : nums)
        {
            for (int i = 0; i < nums.length; i++)
            {
            	//if found creates an array containing their indices
            	//checks to make sure not the same number added twice!
                if (nums[i] + nums[c] == target && c != i)
                {
                	
                	int[] done = {c, i};
                	System.out.println(c + " " + i);
                	return done;
                }
                    
            }
            //increases counter every walk through
            c++;
            }
            //otherwise returns that no pair was found
            return nums;
    }
}
