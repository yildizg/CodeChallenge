package secondCodeChallenge;

import java.util.Scanner;

public class Q03_StringManipulation {
    public static void main(String[] args) {
/* String girildiginde
    sart 1 ilk iki karakteri haric tamamini yazsin (bu sart else de yapmalisin cunku true false kontrol etcek bir paramter yok)
    sart 2  ilk karakter g ise ikinci karakter haric hepsini yazsin
    sart 3  ilk karakter p ise p haric yazsin
    sart 4 Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de
        return edilsin (gh  -  g  -  h   : 3 durum var)
       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String str1 = input.next();
        //1. cozum sart 4 icin
        if (str1.substring(0,2).equals("gh")){
        }
        //2. cozum sart 4 icin
        if (str1.startsWith("gh")){// gh ile basliyorsa true verir bu if body si calisir
            System.out.println(str1);
        } else if (str1.startsWith("g")) {//sart 2 icin calisildi
            //  str1.replaceAll("[o]","");
            System.out.println(str1.replace( str1.charAt(1) , ' ').replaceAll("\\s",""));
            System.out.println(str1.charAt(0) +  str1.substring(2));
        } else if (str1.charAt(0)=='p') {//sart 3 icin
            System.out.println(str1.substring(1));
        }else System.out.println(str1.substring(2));



    }
}
