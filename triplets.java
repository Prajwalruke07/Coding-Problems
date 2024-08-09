import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class triplets {
    public void main(String[] args) {
        int [] arr = {-10, 5, 5, -5, 2};
        int n = 5;

        findTriplets(new int[]{-10, 5, 5, -5, 2},5);

    }

    public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);

        for(int i =0; i < n ; i++){
            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];

                if(sum == 0){
                    return true;
                }
                else if(sum <0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }

        return false;
    }


    public static ArrayList<ArrayList<Integer>> findTripletsl(ArrayList<Integer> arr, int n) {
        // Write your code here.

        Collections.sort(arr); //sort the array

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr.get(i)+arr.get(j)+arr.get(k);

                if(sum==0){
                    result.add(new ArrayList<>(Arrays.asList(arr.get(i),arr.get(j),arr.get(k))));

                    j++; k--;

                    // skip duplicate elements
                    while(j<k && arr.get(j).equals(arr.get(j-1))){
                        j++;
                    }
                    // skip duplicate elements
                    while(j<k && arr.get(k).equals(arr.get(k+1))){
                        k--;
                    }
                }
                else if (sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
            // skip duplicate elements
            while(i+1<n && arr.get(i).equals(arr.get(i+1))){
                i++;
            }
        }

        return result;

    }


}
