package day19_doWhileLoop;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan bir tamsayi alip while loop ile 5'den kucuk pozıtıf tamsayilari yazıralım

        int input=3;

        int sayi=1;
        int sayac=1;
        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayac : " + sayac);

        //ayni soruyu do while loop ile yapalım
        sayi=1;
        do{
            System.out.println(sayi);
              sayi++;
        }while (sayi<input);


    }
}
