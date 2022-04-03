package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        //arrayi nasil deklare ederiz
        //data turu ,array'in ismi ve koseli parantez yazarak array deklare edilir

        int arr1[]={1,3,5};
        int[] arr2={2,3,5};
        int [] arr3={1,4,5};

        double arr4[]={10.2,20.5,5};

        String arr5[]={"ali","veli","ayse"};

        //assign mecburi midir?
        int sayi;

        int arr6[];

        //kullanmadan once mutlaka deger ataması yapmaniz gerekir

        //hem deklare edip hem atama nasıl yapabilirim?
        //1-deklare edip esitligin sagina suslu parantez icerisinde degerleri yazabilirim
        String arr7[]={"ali","veli","ayse"};
        //2-olusturup icine deger atamadan olusturmak isterseniz,boyutu belirlemeniz gerekir

        int arr8[]= new int[5]; // java icinde 5 tane default deger olan bir array olusturur
                                //[0,0,0,0,0]
    }
}
