import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        //Creating 1st array which consist of cost from that point to n,n
        int[][] costgiven = new int[row][col];
        for (int i=0;i<costgiven.length;i++){
            for (int j=0;j<costgiven[0].length;j++){
                costgiven[i][j] = sc.nextInt();
            }
        }
        //Second dynamic array which will updated for every point
        int[][] dparr = new int[row][col];

        for (int i = dparr.length-1 ; i>=0 ; i--){
            for (int j= dparr[0].length-1 ; j>=0 ; j--){
                //Here four cases will be created
                //Last element n,m
                if (i==dparr.length-1 && j==dparr[0].length-1){
                    dparr[i][j] = costgiven[i][j];
                }
                //Last row
                else if (i== dparr.length-1){
                    dparr[i][j] = dparr[i][j+1] + costgiven[i][j];
                }
                //Last column
                else if (j==dparr[0].length-1){
                    dparr[i][j] = dparr[i+1][j] + costgiven[i][j];
                }
                //For the rest of matrix
                else{
                    dparr[i][j] = Math.min(dparr[i][j+1] , dparr[i+1][j]) + costgiven[i][j];
                }



            }

        }

        System.out.println(dparr[0][0]);
    }
}
