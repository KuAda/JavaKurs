package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5)); // ile IT cok guzel
        // yukarıdaki String'i Mehmet Hoca ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));

        System.out.println(str.substring(9)); //yazılan index inclusive

        //Eger bir indexten sona kadar olan bolumu degil belirli bir parcayı almak isterssek
        //iki parametre yazmak gerekir
        // str.substring(baslangIcindexi,bitisIndexi)
        //baslangıcIndexi ==> inclusive/dahil
        //bitisIndexi==>exclusive/haric

        System.out.println(str.substring(0,5)); //Java
        System.out.println(str.substring(0,1));//J
        String harf=str.substring(5,6); //bana 6. harfi String olarak bulun
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); // hiclik dondurur

       // System.out.println(str.substring(5,2));// bitis index'i baslangıc index'inden kucuk olamaz

        System.out.println(str.substring(str.length()-1));//son harfi verir
        System.out.println(str.substring(str.length()-5));// son 5 harfi yazdıralım
        System.out.println(str.substring(str.length()));//son harften sonraki kismi yani hiclik yazdırır



    }
}
