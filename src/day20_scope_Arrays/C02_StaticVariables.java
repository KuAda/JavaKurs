package day20_scope_Arrays;

public class C02_StaticVariables {

    //instance variablelar obje ye bagımlıdır ve her obje farklı degerler alabilir
    //ogrenci notlari veya ogretmen bransları gibi
    //bir objeye aıt bir variable 'ın son degerini bulmak icin sadece o objeyi dikkate aliriz

    //static variable lar ise class variable olarak tanımlanır
    //ve tum class uyeleri icin aynıdır. Okul ismi, okul mudurunun adi gibi
    //eger static variable in degeri degiştirilirse herkes icin degisir

   static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcıkMi;


    public static void main(String[] args) {

        System.out.println(okulIsmi);// yıldız Koleji
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcıkMi);//false

        staticMethod();

        System.out.println(okulNo);

    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);
    }

}
