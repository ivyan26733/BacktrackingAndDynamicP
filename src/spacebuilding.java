import java.util.Scanner;

public class spacebuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long os = 1;
        long ob = 1;

        for (long i=2;i<=n;i++){
            long nb = os;
            long ns = os+ob;

            os = ns;
            ob = nb;
        }

        long total = os+ob;
        total *= total;

        System.out.println(total);
    }
}
