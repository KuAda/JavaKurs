package day39_overriding;

public class OverriddingChild extends OverriddingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        Bir obje olusturulurken Data turu ve Constructor ayni class dan secilmisse
        Java direk o class a gider hem variable hemde method icin
        o class ta varsa kullanır , yoksa o class in parent larina bakar
         */

        OverriddingChild obj1=new OverriddingChild();
        obj1.method1();//Child class method1
        obj1.method2();//Parent class method2

        OverriddingParent obj3=new OverriddingParent();
        obj3.method2();//Parent class method2
        obj3.method1();//Parent class method1

        /*
        Eger Data turu Parent, Constructor Child Class dan secildiyse
        variable larda yukaridaki sekilde calisma devam eder
        Ancak
        Methodlar icin Data turunun oldugu  class daki method Child class
        tarafindan OVERRİDE edilmis mi diye kontrol etmemiz gerekir
        Eger child class larda bu method override edilmisse
        override eden method calisir
         */

        OverriddingParent obj2=new OverriddingChild();
        obj2.method2();//Parent class method2
        obj2.method1();//Child class method1

    }
}
