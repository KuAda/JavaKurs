package day40_overriding_polymorphism;

public class C02 extends C01{

    private void method4() {
        System.out.println("Child method 4");
        //parent clastaki private method4 e
        // Child class dan ulasmamiz mumkun olmadıgından
        // Java bu iki methodu
        // TAMAMEN FARKLI IKI METHOD olarak kabul eder
        //@override kullanmak isreseknJava kabul etmez CTE verir
    }

    @Override
    protected String method3() {
    //Covariant icin yazildi
        return "Java";
    }
    @Override
    public void method2() {
        /*
        @Override notasyonu overridden method ile overridding methodu
        birbirine baglar
        Farkinda olunmadan overriden method silinirse veya signature degistirilirse bu iliski
        bozulacagi icin Java CTE verir

        Notasyon kullanilmazsa Java bunlarin iliskisini bilir ama overridden method
        silinirse sesini cikarmaz
         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        C02 obj=new C02();

        obj.method1();//parent method1
        obj.method2();//child method2

        C01 obj2=new C02();
        obj2.method1();//parent method1
        obj2.method2();//child method2

        C01 obj3=new C01();
        obj3.method1();//parent method1
        obj3.method2();//parent method2




    }
}
