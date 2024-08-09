
    import java.util.Arrays;

    class ClosestToZeroSum {
        public static void findClosestToZeroSum(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array should contain at least two elements.");
                return;
            }

            Arrays.sort(arr); // Sort the array in ascending order

            int left = 0;
            int right = arr.length - 1;
            int closestSum = Integer.MAX_VALUE; // Initialize with a large value
            int num1 = 0, num2 = 0;

            while (left < right) {
                int currentSum = arr[left] + arr[right];
                if (Math.abs(currentSum) < Math.abs(closestSum)) {
                    closestSum = currentSum;
                    num1 = arr[left];
                    num2 = arr[right];
                }

                if (currentSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println("Two elements with the sum closest to zero: " + num1 + " and " + num2);
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, -3, 4, -1};
            findClosestToZeroSum(arr);
        }
    }


