    package fourthCodeChallenge;

    import java.util.Arrays;
    import java.util.List;

    public class Q09_ArrayList {
    public static void main(String[] args) {
    /*
    If the list has 12 as element, change all 12s to 21
    Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
*/
        List<Integer > list= Arrays.asList(12, 11, 12, 15, 12, 34, 43);
        System.out.println("list = " + list);
        if (list.contains(12)){
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)==12){
                    list.set(i,21);//[21, 11, 21, 15, 21, 34, 43]
                    //     list.set(list.indexOf(12),21);//[21, 11, 21, 15, 21, 34, 43]
                    //    list.set(list.indexOf(list.get(i)),21);//[21, 11, 21, 15, 21, 34, 43]
                }
            }
        }else System.out.println("list doesn't contain 12");
        System.out.println("list = " + list);//list = [21, 11, 21, 15, 21, 34, 43]
        //Ahmet bey
        //        int[]arr={12, 11, 12, 15, 12, 34, 43};
        //        for (int i = 0; i < arr.length ; i++) {
        //            if (arr[i]==12){
        //                arr[i]=21;
        //            }
        //        }
        //        System.out.println(Arrays.toString(arr));





    }
    }