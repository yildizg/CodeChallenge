    package fifthCodeChallenge;

    import java.util.Arrays;

    public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String str="Her sey güzel olacak";
        String[] arr=str.replace(" ","").split("");

        System.out.println(arr.length);

    }
}
