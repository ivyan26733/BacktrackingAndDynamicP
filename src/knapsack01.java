import java.util.Scanner;

public class knapsack01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] value = new int[num];
        int[] weight = new int[num];
        for (int i=0;i<value.length;i++){
            value[i] = sc.nextInt();
        }
        for (int i=0;i<weight.length;i++){
            weight[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int[][] dparr = new int[num+1][target+1];

        for (int i=1;i<dparr.length;i++){
            for (int j=1;j< dparr[0].length;j++){
                if (j>=weight[i-1]){
                    int rCap = j - weight[i-1];
                    if (dparr[i-1][rCap]+value[i-1]>dparr[i-1][j]){
                        dparr[i][j] = dparr[i-1][rCap]+value[i-1];
                    }
                    else{
                        dparr[i][j] = dparr[i-1][j];   //Equals to previous element
                    }

                }
                else{
                    dparr[i][j] = dparr[i-1][j];   //Equals to previous element
                }
            }
        }

        System.out.println(dparr[num][target]);
    }
}
