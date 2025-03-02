import java.util.*;

public class Leet26DuplicateElement {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2}; // Example input
        int count = removeDuplicates(nums); // Call the method and get the count of unique elements
        
        System.out.println("Number of unique elements: " + count); 
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, count)));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0; // Counter for unique elements
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue; // Skip duplicate elements
            } else {
                nums[count] = nums[i]; // Place the unique element at the next position
                count++; // Increment the unique count
            }
        }
        return count; // Return the count of unique elements
    }
}
