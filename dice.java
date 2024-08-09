public class dice {
    public static void main(String[] args) {
        diceq("", 5);
    }

    static void diceq(String p,int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 && i <=target ; i++) {
            diceq(p + i,target -i);
        }
    }
}
