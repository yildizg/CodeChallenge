    package fourthCodeChallenge;

    public class Q06_MdArrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][]arr={{1,3,6},{2,8},{5,7,9,14}};
        ciftToplam(arr);
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];

            }

            }
        }System.out.println("toplam = " + toplam);

    }

        private static int ciftToplam(int[][] MDArray) {
            int sum=0;
            for (int i = 0; i <MDArray.length ; i++) {
                for (int j = 0; j <MDArray[i].length ; j++) {
                    if (MDArray[i][j] % 2==0){
                        sum += MDArray[i][j];
                    }
                }
            }
            return sum;
        }
    }



        //Gulhan hanim
        //        int toplam =0;
        //        for (int i = 0; i < arrSayi.length ; i++) {
        //            for (int j = 0; j <arrSayi[i].length ; j++) {
        //                if (arrSayi[i][j] % 2 == 0){
        //                    toplam += arrSayi[i][j];
        //                }
        //            }
        //        }
        //        System.out.println("toplam = " + toplam);
            //Fethiye hanim
        //        int toplam=0;
        //        for (int i = 0; i < arr.length ; i++) {
        //            for (int j = 0; j <arr[i].length ; j++) {
        //                if (arr[i][j]%2==0){
        //                    toplam+=arr[i][j];
        //                }
        //            }
        //        }
        //        System.out.println("toplam = " + toplam);




