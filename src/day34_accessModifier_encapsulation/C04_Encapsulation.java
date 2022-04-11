package day34_accessModifier_encapsulation;

public class C04_Encapsulation {

    public static void main(String[] args) {
        /* Bir variable i encapsule etmek icin
        1- Access Modifier i private yapariz
        2-okuma ve yazma ozellıklerinin kullanilmasini
        istedigimiz gibi sinirlayabiliriz
        -Eger sadece okunmasini istiyorsaniz getter
        -sadece deger girilebilsin isterseniz setter
        methodlarini olustururuz

        Bir variable icin hem getter hem setter olusturursaniz o variable
        public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz

        Piyasada developerlar arasındada genel uygulamada boyledir

         */

        C03 obj = new C03();

        System.out.println( obj.getSayi());

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj);//sayi=0, str=Java Java Java


    }
}