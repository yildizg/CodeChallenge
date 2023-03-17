package firstCodeChallenge;

import java.util.Scanner;

public class Q04_IfStatement {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Y veya N tusunua basininz");
        String cevap =input.next();

        if ( cevap.equals("Y") || cevap.equals("y") ){
            System.out.println("YES");
        } else if (cevap.equals("N") || cevap.equals("n")) {
            System.out.println("NO");
        }else System.out.println("yanlis tuslama yaptiniz");
        //2 . cozum primitive ile
        char cevap2=input.next().charAt(0);
        if ( cevap2=='y' || cevap2=='Y' ){
            System.out.println("YES");
        } else if (cevap2=='n' || cevap2=='N') {
            System.out.println("NO");
        }else System.out.println("yanlis tuslama yaptiniz");




    }



}
