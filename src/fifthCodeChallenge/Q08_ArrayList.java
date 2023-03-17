    package fifthCodeChallenge;

    import java.awt.*;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Q08_ArrayList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner input=new Scanner(System.in);
        System.out.println("kac elemanli list olsun");
        int boyut= input.nextInt();
        ArrayList<Integer>depo=new ArrayList<>();
        for (int i = 0; i <boyut ; i++) {
            System.out.println(i + ".elemani gir");
            int eleman= input.nextInt();
           depo.add((eleman));

        }
        System.out.println(depo);



//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        for (int i = 0; i < list.size() ; i++) {
//            boolean as = false;
//            for (int j = 0; j < i ; j++) {
//
//                if (list.get(i).equals(list.get(j))) {
//                    as = true; break;
//                }
//            }
//            if (!as) list2.add(list.get(i));
//        }
//        System.out.println("list2 = " + list2);
    }

    }

