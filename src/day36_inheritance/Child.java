package day36_inheritance;

public class Child extends Parent {

    Child(){
        super();
        System.out.println("Child cons. calisti");
    }

    //Tum class'larda biz gormesek bile
    //Java nın olusturdugu default constructor vardir

    //Extends keyword kullanan classlardaki
    // Tum constructor larin ilk satirinda
    // biz gormesek bile super() constructor call vardir
    //yani parent class 'in parametresiz constructor call
    public static void main(String[] args){

        Child child=new Child();
    }




}
