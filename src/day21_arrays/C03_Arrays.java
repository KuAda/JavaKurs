package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        int arr[];// deger ataması yapmadık ama Java kabul etti
                  // ancak kulllanmamıza izin vermez
        arr= new int[6];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);//6
                                       //String deki length() , bunda yok (parantez)

        //array deki her bir elemanı index degeri kadar arttiralim

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=i;

        }
        System.out.println(Arrays.toString(arr));

        //son index teki elementi yazdiralim
        System.out.println(arr.length-1);
    }
}
