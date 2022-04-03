package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harflar=new ArrayList<>();
        harflar.add("D");//[D]
        harflar.add("M");//[D, M]
        harflar.add(1,"T");//[D, T, M]
        harflar.add(0,"T");//[T, D, T, M]

        System.out.println(harflar);//[T, D, T, M]

        System.out.println(harflar.contains("T"));//true

        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harflar.containsAll(karakterler));//true

        karakterler.add("F");
        System.out.println(harflar.containsAll(karakterler));//false


    }
}
