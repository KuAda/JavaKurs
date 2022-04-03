package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {

        //verilen iki sayiyi toplayan bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=30;
        int sayi5=30;

        //birde uc sayi toplayan method olusturalim

        //birde uc sayiyi toplayan method olusturalım

        toplaGel();
        toplaGel(sayi1);
        toplaGel(sayi1,sayi2);
        toplaGel(sayi1,sayi2,sayi3);
        toplaGel(sayi1,sayi2,sayi3,sayi4);
        toplaGel(sayi1,sayi2,sayi3,sayi4,sayi5);

    }

    private static void toplaGel(int...  sayi1) {



    }
}
