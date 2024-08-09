public class minJumps {
    public static void main(String[] args) {

        int n = 11;
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));

    }

    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        if (n <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        int i = 1;
        for (i = 1; i < n; i++) {
            if (i == n - 1)
                return jump;

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }

        return -1;
    }
}
