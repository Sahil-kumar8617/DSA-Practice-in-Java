import java.util.*;
class Leet35SearchInsertPosition{
    
        public int searchInsert(int[] nums, int target) {
            
            int index=0;
            
            for(int i=0;i<nums.length-1;i++){
                
                if(nums[i]==target){
                    return i;
                }
                else if(nums[i]<target)
                {
                    index=i+1;
    
            }
             
        }
        return index;
    }
    
    
            
    }

