package secondCodeChallenge;

import java.util.Scanner;

public class Q06_forLoop {
    public static void main(String[] args) {

        /*
         *
         * *
         * ! *
         * ! ! *
         * ! ! ! *
         * ! ! ! ! *
         * ! ! ! ! ! *
         * * * * * * * *
         */
        Scanner input =new Scanner(System.in);
        System.out.println("satir gir");
        int st=input.nextInt();
        for (int i = 1; i <= st ; i++) {
            System.out.print("-");
            for (int k = st; k >= i ; k--) {//inner loop 1
                System.out.print("/");
            }
            for (int m = 1; m <= i ; m++) {//inner loop 2
                if (m==1 || m==i || i==st ){
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }
            System.out.println();
        }


    }
}
