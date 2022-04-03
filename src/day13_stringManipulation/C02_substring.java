package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        //1-48 of results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        // az ise "az sonuc bulundu"

        String str="1-48 of 7000 results for \"java\"";

        int ilkSpaces =str.indexOf(" "); // 4
        int ikinciSpaces =str.indexOf(" ", ilkSpaces+1);
        int ucuncuSpaces =str.indexOf(" ",ikinciSpaces+1);

        String aramaSonucSayisiStr=str.substring(ikinciSpaces+1,ucuncuSpaces);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt>100){
            System.out.println("super");
        }else {
            System.out.println("az sonuc bulundu");
        }

    }
}
