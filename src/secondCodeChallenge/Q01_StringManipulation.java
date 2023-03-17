package secondCodeChallenge;

public class Q01_StringManipulation {
    public static void main(String[] args) {


       String str="$13.99 ";

       // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space
             \\S   ==> space disindaki hersey  */
        String  str1 = "$13.99";
        String str2  = "$10.55";
        // str1=str1.replace( '$','0');// bu sekiilde de yapilabilir
        //1. cozum
        str1=str1.replaceAll( "[$]","");
        str2=str2.replaceAll( "[$]","");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        Double sayi1FromStr1 = Double.valueOf(str1);
        Double sayi2FromStr2 = Double.valueOf(str2);
        System.out.println("str1+str2 = " + (sayi1FromStr1 + sayi2FromStr2));
//2. cozum
//        str1=str1.substring(1);
//
//        str2=str2.substring(1);
//
//
//        Double sayi1FromStr1 = Double.valueOf(str1);
//
//        Double sayi2FromStr2 = Double.valueOf(str2);
//
//        System.out.println("sayi1FromStr1 = " + sayi1FromStr1);
//        System.out.println("sayi2FromStr2 = " + sayi2FromStr2);
//
//        System.out.println(sayi1FromStr1 + sayi2FromStr2);








    }
}
