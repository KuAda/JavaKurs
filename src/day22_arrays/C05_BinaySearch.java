package day22_arrays;

public class C05_BinaySearch {

    public static void main(String[] args) {

        //Verilen arrayde istenen bir elementin var olup olmadıgını true/false yazdirarak
        //gösteren bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        int istenenSayi=5;

        istenenElemanVarMi(arr,istenenSayi);

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==istenenSayi){
                sonuc=true;
               break;
            }
        }
        System.out.println(sonuc);
    }
}
