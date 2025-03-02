import java.util.*;
public class MoveZeroes {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        // int tempArray[]=new int[nums.length];
        MoveZero(nums);

        
    }
    public static int MoveZero(int nums[]){
        int index=0;
        for(int i=0;i<nums.length;i++){


            // ( if we use different array then use this )
            // if(nums[i]>0){
                
            //         tempArray[index]=nums[i];
            //         index++;
            // }
            // else{
            //     continue;
            // }

            // (if output should be in a same array by editing it )
            if (nums[i] != 0) {
                // Swap non-zero element to the current index
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++; // Move the pointer to the next position
            }

        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }
    
}
