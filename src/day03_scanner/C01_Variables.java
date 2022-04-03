package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

       //1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf);

        int sayi1=10 ,sayi2=20;
        System.out.println(sayi1+sayi2);

        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //isminiz : Mehmet
        //soyisminiz : Bulutluoz
        //seklinde yazdirin

        String isim= "Nezir";
        String soyisminiz="Yildiz";

        System.out.println(" isminiz : " + isim);
        System.out.println("soyisminiz " + soyisminiz );

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        short sayi3=20;
        double sayi4=30;

        System.out.println(sayi3+sayi4);
        System.out.println("iki sayinin toplami : " + (sayi3+sayi4));


        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        //5 – char data turunde bir variable olusturun ve yazdirin

         char ozelkarakter='#';
        System.out.println(ozelkarakter);

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf); //117

        // char data turunde degiskenler matematiksel islemlerde kullanılırsa
        // o char degerinin ASCII karsılıgı isleme alınır


    }
}
