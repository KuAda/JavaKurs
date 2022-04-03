package day23_multiDimensionsArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10

        //ilk inner array'in tum elementlrini yazdırın

        System.out.println(arr[0]);//arr[0]bir array oldugundan direk yazdirilamaz
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]

        System.out.println(Arrays.toString(arr));//[[I@5b464ce8, [I@57829d67]

        //MDArray'de tum elementleri bir array olark yazdırmak istersek

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]
    }
}
