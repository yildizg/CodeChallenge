package secondCodeChallenge;

public class Q05_forLoop {
    public static void main(String[] args) {

///Interview Question
        // 0-255 e kadar olan karakterlerin , sayı ve harf değerini
        // ekrana yazdırınız.
//        System.out.println("************ for loop *************");
//        for (int i = 0; i <=255 ; i++) {
//            char karakter = (char) i;
//            System.out.println(i +" -> " +karakter);
//        }
        System.out.println("************ while loop *************");
//        int karakterAscii = 0;
//
//        while (karakterAscii <= 255) {
//
//            char karakterChar = (char) karakterAscii;
//           System.out.println(karakterAscii +" -> " +karakterChar);
//            karakterAscii++;
//
//        }
        System.out.println("************ do while loop *************");
        int karakterAscii = 0;
        do {
            char karakterChar = (char) karakterAscii;
            System.out.println(karakterAscii +" -> " +karakterChar);
            karakterAscii++;
        } while (karakterAscii <= 255) ;








    }
}
