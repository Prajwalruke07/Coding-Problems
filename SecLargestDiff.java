import java.util.Arrays;

public class SecLargestDiff {

    public static void main(String[] args) {
        int arr [] = {12,34,53,76,81};
        //output should be 81-12 = 69 76-12 =64
        //64
        diff(arr);
        System.out.println(diff(arr));
    }

    private static  int diff(int [] arr){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        int largestdiff = arr[left] - arr[right];
        int seclargest= arr[left] - arr[right-1];

//        if (largestdiff > seclargest){
//            seclargest = left - (right -1);
//
//        }
        return -seclargest;
    }
}
