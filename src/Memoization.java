//Earlier we use to solve fib problems simply by recursion
//But in that we used to solve same step multiple time which increase the time of program
//Now we will solve it by the help of new method known as Memoization

public class Memoization {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n+1];
        int ans = DynamicRec(n,arr);
        System.out.println(ans);
    }

    public static int RecFib(int n){
        //base case to handle 0 and 1
        if (n==0 || n==1){
            return n;
        }
        int fib1 = RecFib(n-1);
        int fib2 = RecFib(n-2);

        int fibans = fib1+fib2;

        return fibans;

    }

    //Now Lets go with Dynamic Programming

    public static int DynamicRec(int n , int[] qb){

        if (n==0 || n==1){
            return n;
        }

        if (qb[n]!=0){
            return qb[n];
        }

        int fib1 = DynamicRec(n-1 , qb);
        int fib2 = DynamicRec(n-2 , qb);

        qb[n] = fib1+fib2;

        return fib1+fib2;

    }
}
