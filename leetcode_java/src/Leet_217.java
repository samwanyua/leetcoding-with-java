import java.util.HashSet;

public class Leet_217 {
    public static void main(String[] args) {
        // 217 - Contain duplicates
        /*Sorting & hashsets */
        int[] nums = {1, 2, 3};
        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }

}
 