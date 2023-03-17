    package fourthCodeChallenge;

    import java.util.Arrays;

    public class Q07_Arrays {
    public static void main(String[] args) {
    /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Egitimde ter dokmeyen Savasta kan Doker"
            a e i o u */



        String str="Egitimde ter dokmeyen, savAsta kan doker";
        str = str.replace("," ,"").replace(" ","").toLowerCase();
        System.out.println("str = " + str);//str = egitimdeterdokmeyensavastakandoker
        String [] arr=str.split("");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        String [] sesliHarfler={"a" ,"e", "i", "o" ,"u"};
        System.out.println("Arrays.toString(sesliHarfler) = " + Arrays.toString(sesliHarfler));
        int count=0;
        for (int i = 0; i <arr.length ; i++) {//bu loop arr icin acildi
            for (int j = 0; j < sesliHarfler.length ; j++) {//bu loop sesli harfler array i icin acildi
                if (arr[i].equals(sesliHarfler[j])){
                    count++;
                }
            }
        }
        System.out.println("count = " + count);//count = 14
                //Ahmey bey
        //        String sesli=" a e i o u";
        //        int count=0;
        //
        //        String []str2=str.split("");
        //
        //        for (int i = 0; i <str2.length ; i++) {
        //            if (sesli.contains(str2[i].toLowerCase())){
        //                count++;
        //            }
        //        }
        //        System.out.println("count = " + count);
                //Gulhan hanim
        //        String str = "Egitimde ter dökmeyen SAvasta kan döker";
        //        String bosluksuz = str.replaceAll("\\s","");
        //        String[] str2 = str.split("");
        //        int count =0;
        //        for (int i = 0; i <str2.length ; i++) {
        //            if (str2[i].equals("a")  || str2[i] .equals("e") ||str2[i] .equals("i") ||str2[i].equals("o")||str2[i].equals("u")){
        //                count++;
        //            }
        //
        //        }
        //        System.out.println("count = " + count);
    }
    }

