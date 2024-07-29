import java.util.Arrays;

public class factors_of_no {
    public static void main(String[] args) {
        search(20);
        System.out.println();
        search2(20);

    }
    public static void search(int n){

        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.print( i+" ");

            }


        }




    }
    public static void search2(int n){
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0) {
                if (n % i == i) {
                    System.out.println(i);
                }else {


                    System.out.print( +i + " "+n/i);

                }
            }


        }
    }
}
