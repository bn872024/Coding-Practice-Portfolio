public class BinarySearchSolution {

    /**
     * Performs a binary search on a sorted array to find the target value.
     * 
     * @param a      The sorted array to search in
     * @param target The value to search for
     * @return       The index of the target if found, -1 otherwise
     */
    public int findTarget(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        // 'mid' is not defined here because it needs to be recalculated in each iteration
        // of the loop as the search range changes.

        // We use 'left <= right' to handle arrays with a single element and to ensure
        // that all elements are checked, including when left == right.

        while (left <= right) { 
            int mid = left + (right - left) / 2;
            // This formula for 'mid' is used instead of (left + right) / 2 to prevent
            // integer overflow for very large arrays.

            if (a[mid] > target) {
                right = mid - 1;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // Return -1 if the target is not found. -1 is used as it's not a valid
                   // array index. This can be changed based on specific requirements.
    }

    public static void main(String[] args) {
        BinarySearchSolution bs = new BinarySearchSolution();
        
        int[] a = {-1, 0, 2, 4, 6, 8};
        int target_a = 3;
        int target_b = 8;

        System.out.println("target_a : "+ target_a +" found at index: " + bs.findTarget(a, target_a));
        System.out.println("target_b : "+ target_b +" found at index: " + bs.findTarget(a, target_b));
    }
}