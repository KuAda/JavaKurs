package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10

         */
        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'tan once sayi1: " + sayi1 + " sayi2 : " + sayi2);

        // 1. adım bos bir variable olusturup sayi1 ' i ona atayalım

        int temp= sayi1;

        //2. adımda sayi1'e yeni degerini atayalım

        sayi1=sayi2;

        //3.adım sayi2'ye temp'e yedekledigimiz sayi degerini atayalım

        sayi2=temp;

        System.out.println("Swap'tan sonra sayi1: " + sayi1 + " sayi2 : " + sayi2);
    }
}
