package day20_scope_Arrays;

public class C01_IntanceVariables {

      int sayi;
      String bransIsmi="Java";
      boolean okuldaMi;

    public static void main(String[] args) {

        //sayi=10;  sayi variable'ı static olmadıgı icin main method'dan direk kullanılamaz
        //instance variable'lara static methodlardan ulasabilmek icin obje olusturmamız gerekir

        C01_IntanceVariables obj1=new C01_IntanceVariables();
        System.out.println(obj1.sayi);//0
        obj1.sayi=10;
        System.out.println(obj1.sayi);//10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi);//false

        C01_IntanceVariables obj2=new C01_IntanceVariables();
        System.out.println(obj2.sayi);//0
        System.out.println(obj2.bransIsmi);//Java

        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);









    }
}
