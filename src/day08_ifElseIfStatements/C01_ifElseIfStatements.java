package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_ifElseIfStatements {
    public static void main(String[] args) {

        // girilen bir karakterin ,harf olup olmadıgını bulalım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter= scan.next().charAt(0);

        if ( (karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z' )){

            System.out.println("girdiginiz karakter bir harf");
        } else {
            System.out.println("Girdiginiz karakter bir harf degil");
        }


    }

}
