import java.util.Scanner;

public class ClimbingSMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stepsStorage = new int[n];
        for (int i=0;i<n;i++){
            stepsStorage[i] = sc.nextInt();
        }
        //Dynamic Array should be n+1 as array indexing starts from 0
        //Here we will use Integer in place of int as it will store null in place of 0 in every block
        //and in this only addreess are given and number is stored on other location

        Integer[] dparr = new Integer[n+1];
        dparr[n] = 0;   //Steps taken will be 0 but path will be 1

        //Run the two loops in this
        //We will solve the problem top bottom so thats why run the loop from top and come towards 0th index

        for (int i=n-1;i>=0;i--){
            //i+j condition will keep a check that whether the loop is not going out of bounds
            if (stepsStorage[i]>0) {
                Integer min = Integer.MAX_VALUE;
                for (int j = 1; j <= stepsStorage[i] && i + j < dparr.length; j++) {
                    if (dparr[i+j]!=null) {
                        min = Math.min(min,dparr[i+j]);
                    }
                }
                if (min!=Integer.MAX_VALUE){
                    dparr[i] = min+1;
                }
            }
        }
        System.out.println(dparr[5]);
    }
}
