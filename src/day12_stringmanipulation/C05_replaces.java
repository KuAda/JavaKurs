package day12_stringmanipulation;

public class C05_replaces {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        // bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println("space haric karakter sayisi : " +  str.replace(" " , "").length()); //

        // atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi : "+str.length());

        //str da kalıcı degisiklik yapalım
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun","Yarın");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalıcı degisiklikten sonra : " + str);

        str.replace("ne cok","ne az");
        System.out.println(str);
        //atama yapılmadıgı icin son kısmı degistirmedi

    }
}
