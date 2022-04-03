package day33_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Prize Dikkat");

        System.out.println(sb1.insert(12," edin."));

        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8));//Hayatta Prize Dikkat edin.

        System.out.println(sb1.reverse());//.nide takkiD ezirP attayaH

        System.out.println(sb1.reverse());//Hayatta Prize Dikkat edin.

        System.out.println( sb1.substring(3,5));//at

        System.out.println(sb1);//Hayatta Prize Dikkat edin.

        System.out.println(sb1.subSequence(3,5));//at
        System.out.println(sb1);//Hayatta Prize Dikkat edin.
    }
}
