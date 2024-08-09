import java.util.ArrayList;

public class Subseq2 {
    public static void main(String[] args) {
        subseq("","abcd");
        //skip("","jsdhasiebaaafe");
        System.out.println(subseqlist("","abds"));
    }

    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        subseq(p, up.substring(1));
        subseq(p+ch,up.substring(1));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> subseqlist(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);


        ArrayList<String> left = (subseqlist(p, up.substring(1)));
        //subseq(p, up.substring(1));
        ArrayList<String> right = (subseqlist(p+ch,up.substring(1)));

        left.addAll(right);

        return left;
    }
}
