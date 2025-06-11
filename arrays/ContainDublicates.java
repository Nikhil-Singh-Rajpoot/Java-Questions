import java.util.HashSet;
import java.util.Set;
// LeetCode Problem: Contains Duplicate

public class ContainDublicates {
    public static boolean containsDuplicate(int[] nums) {
        //Create a Set here to store unique element and also use contains method because it takes
        //O(1) time complexity to check if value is present or not;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
        // If we reach here, it means no duplicates were found
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // Output: true
    }
}
