package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan iki tamsayi alip bu sayilari ve
        // aralarındaki tum sayilari yazddıran bir kod olusturun

        int baslangic=40;
        int bitis=60;

        for (int i =baslangic; i <=bitis ; i++) {

            System.out.print(i +" ");

        }
        System.out.println("");


        //ayni soruyu while loop ile yapalım

        int i=baslangic;
        while (i<=bitis){

            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);

    }
}
