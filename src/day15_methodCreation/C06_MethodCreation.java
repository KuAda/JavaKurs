package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variablenin degerlerini toplayan bir method olusturalim
        //1.adım method adını yazalım
        //2. adım methoda gondermem gondermem argument varmı

      ikiSayiTopla(25,50);

      C04.dortHarfiTersineCevir("sema");
    }
      //bir methodu olusturmak calismasi icin yeterli degildir
      // method ancak cagirilirsa calisir
    //ayni class veya farklı class'da olmasinin hicbir onemi yoktur
    //Java main method da yukarıdan asagıya dogru calısır
    //ve geldigi satırı calıstırır

    private static void ikiSayiTopla(int a, int b) {

        System.out.println("verilen iki sayinin toplami : " + (a+b));


    }
}
