    package fourthCodeChallenge;

    import java.util.*;

    public class Q08_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */




//      gülhan
//        int [] arr = {5,8,9,10,12,14,8};
//        int t=0;
//
//        Arrays.sort(arr);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Kactane max sayi istersin");
//        int sayi = input.nextInt();
//        int [] arr2 = new int[sayi];
//        arr2 = Arrays.copyOfRange(arr, sayi, arr.length-1);
//        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int [] arr={1,2,3,4,5,6,7,8,6,99,55,66,77,33};
        int n = 5;//en buyuk  bes max degeri getirmesi icin atndi
        //list ten gidelim
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {//arrayin tum elemanlari list e atandi
            list.add(arr[i] );
        }
        System.out.println("list = " + list);//list = [1, 2, 3, 4, 5, 6, 7, 8, 6, 99, 55, 66, 77, 33]
        List<Integer> maxDegerlerListi = new ArrayList<>();//istenen sayi kadar max degerler bunun icine atilacak
        //   int count = 0 ;
        //   while (count< n){//liste eklenecek sinir kadar
        while (n > 0){//liste eklenecek sinir kadar
            int max=list.get(0);
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i) > max){//listin herbir elemani max ile reasiyona sokuldu
                    max=list.get(i);//herbir eleman eger max degerden buyuk ise max olarak atandi
                }
            }
            maxDegerlerListi.add(max);//max degerler yeni listeye atandi
            list.remove(list.indexOf(max));
            System.out.println("list = " + list);
            //   count++;
            n--;
        }
        System.out.println("arrayin ilk "+n+ " max degerleri "+maxDegerlerListi);//arrayin ilk 0 max degerleri [99, 77, 66]
                //Ahmet bey
        //        ArrayList<Integer >str=new ArrayList<>(Arrays.asList( 1,2,3,4,5,6,7,8));
        //        Scanner input=new Scanner(System.in);
        //        System.out.println("kac maksimum deger istiyorsun");
        //        int aded= input.nextInt();
        //        for (int i = 0; i <aded ; i++) {
        //            System.out.println("Collections.max(str) = " + Collections.max(str));
        //        }
        //Gulhan hanim
        //        int [] arr = {5,8,9,10,12,14,8};
        //        int t=0;
        //
        //        Arrays.sort(arr);
        //
        //        Scanner input = new Scanner(System.in);
        //        System.out.println("Kactane max sayi istersin");
        //        int sayi = input.nextInt();
        //        int [] arr2 = new int[sayi];
        //        arr2 = Arrays.copyOfRange(arr, sayi, arr.length-1);
        //        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }
    }
