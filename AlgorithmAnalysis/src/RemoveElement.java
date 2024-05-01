public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3, 6};
        int val = 3;

        int result = removeElement(nums, val);

        System.out.println("The array after removing occurrences of " + val + ":");
        int expectedNums[] = new int[result];
        // Print out new array with removed values
        for (int i = 0; i < result; i++) {
            expectedNums[i] = nums[i];
            System.out.print(expectedNums[i] + " ");
        }
        System.out.println("\nNumber of elements not equal to " + val + ": " + result);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Variable to track the number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Swap the element at index i with the element at index k
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                k++; // Increment k as we have found an element not equal to val
            }
        }

        return k;
    }
}

