package day11_StringManipulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali"+" Can";
        System.out.println("str1: " +str1);
        System.out.println("str2: " +str2);

        System.out.println("== ile karsılstır :" + (str1==str2));
        System.out.println("equals ile karsılastır:" + str1.equals(str2));

        String str3=str1+"";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karsılstır :" + (str3==str2));
        System.out.println("equals ile karsılastır:" + str3.equals(str2));

        // String'de == herzaman dogru sonuc vermez
        // bunun icin emin oldugumuz equals method'unu kullanmayi tercih ederiz

        String str4="hasan";
        String str5="HASAN";

        System.out.println(str4.equals(str5));
        System.out.println(str4.toUpperCase().equals(str5));


    }
}
