package firstCodeChallenge;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki
         * basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki
         * basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner input =new Scanner(System.in);
        System.out.println("5 basamakli sayi giriniz ");
        int sayi =input.nextInt();
        int ilkIkiBasamak = sayi / 1000; //12
        int sonIkiBasamak =sayi % 100 ; //45
        System.out.println("sayi = " + sayi);//sayi degismedi cunku atama yapmadik
        int ilkIkiToplam = ( ilkIkiBasamak % 10 ) + ( ilkIkiBasamak / 10 ) ;// 2 + 1
        int sonIkiToplam = ( sonIkiBasamak % 10 ) + ( sonIkiBasamak / 10 ) ; //5 + 4
        int totalToplam=ilkIkiToplam+sonIkiToplam;
        System.out.println("totalToplam = " + totalToplam);
        //AFK away from keybord




    }
}
