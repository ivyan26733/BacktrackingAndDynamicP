import java.util.Scanner;

public class countBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int zero = 1;
        int ones = 1;

        for (int i=2;i<=target;i++){
            int maxvalzero = ones;
            int maxvalueones = zero+ones;

            ones = maxvalueones;
            zero = maxvalzero;
        }

        System.out.println(ones + zero);
    }

}
