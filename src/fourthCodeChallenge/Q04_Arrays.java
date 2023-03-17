    package fourthCodeChallenge;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Q04_Arrays {
    public static void main(String[] args) {
         /*
        Kullanicidan aldigimiz 8 elemanli arrayin icinde
        kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scn=new Scanner(System.in);
        int[] arr = new int[8];
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + 1 + ". sayiyi giriniz");
            arr[i] = scn.nextInt();
            if(arr[i]%3==0){
                System.out.println(arr[i] + " ");
                count++;
            }
        }
        System.out.println("Girilen sayilar" + Arrays.toString(arr) + " ");
        System.out.print("3e bolunebilenler= "+ count + "tanedir");




            //Sureyya hanim
            //        int[] array = new int[8];
            //        int count = 0;
            //
            //        System.out.println("Lütfen 8 elemanlı bir dizi giriniz:");
            //        for (int i = 0; i < array.length; i++) {
            //            array[i] = scanner.nextInt();
            //        }
            //
            //        for (int i = 0; i < array.length; i++) {
            //            if (array[i] % 3 == 0) {
            //                count++;
            //            }
            //        }
                    //       System.out.println("Dizideki 3'e tam bölünebilen sayı adedi: " + count);
            //Gulhan hanim
            //        int[] sayi = new int[8];
            //        int count = 0;
            //        for (int i = 0; i <sayi.length; i++) {
            //            System.out.print(i + 1 + ".sayiyi giriniz");
            //            sayi[i] = input.nextInt();
            //            if (sayi[i] % 3 == 0) {
            //                count++;
            //            }
            //        }
            //        System.out.println("count = " + count);
            //




    }
}
