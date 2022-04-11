package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    //bir class i child class yaptıgımızda
    // parent class daki constructor a ulasmasi gerekir
    // bu durumda parent classtaki constructor in
    // access modifier i uygun olmalidir

    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){
        //Child class da tum constructor ların ilk satirinda
        // Java nin yerlestirdigi constructor PARAMETRESİZ dir
        // yani super()
        System.out.println("Child class parametreli cons.");
    }
    Child(int sayi1,int sayi2){
        //eger parent class tan parametresiz constructor i degilde
        //baska bir constructor i calistirmak isterseniz
        //bunu Child class taki constructor in ILK SATIRINA yazmalisiniz
        super(sayi1, sayi2);
        System.out.println("Child iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);
    }

}
