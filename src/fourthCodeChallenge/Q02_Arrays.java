    package fourthCodeChallenge;

    import java.util.ArrayList;
    import java.util.Arrays;

    public class Q02_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        // ahmet bey
           String str="HeySiri";
            //array ile cozumu
           String []arr= str.split("y");//[He, Siri]
           System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
           arr[0]="Bye";
           System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
           str=arr[0]+arr[1];
           System.out.println("str = " + str);


            // String str="HeySiri";
               String []str2=str.split("y");
                ArrayList<String> yeni=new ArrayList<String>(Arrays.asList(str2));
                for (int i = 0; i < yeni.size() ; i++) {
                    yeni.set(0,"Bye");
                }
                System.out.println("yeni.get(0)+yeni.get(1) = " + yeni.get(0) + yeni.get(1));




    }
}
