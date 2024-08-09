import java.util.*;

public class Frequencysort {


    public static void main(String[] args) {
        int [] arr = {4,2,2,8,3,3,3,1};
        System.out.println(sortByFreq(arr,8));
    }

    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        HashMap<Integer , Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        ArrayList<Integer> Ue = new ArrayList<>(mp.keySet());
        Collections.sort(Ue , (a,b)->{
            int freqA = mp.get(a);
            int freqB = mp.get(b);

            if (freqA == freqB){
                return a-b;
            }
            return  freqB - freqA;
        });

        ArrayList<Integer> result = new ArrayList<>();
        for (int element : Ue){
            int freq = mp.get(element);
            for (int i = 0; i < freq; i++) {
                result.add(element);

            }
        }
        return result;

    }


}
