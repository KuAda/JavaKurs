package day26_forEachLoop_constructer;

public class C01_ForEachLoop {
    public static void main(String[] args) {


        int arr[]={2,4,6,8,11};

        //elementleri for loop ile yazdiralım

        for (int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");

        //bunu for each loop ile yapacak olursak
        // for each loop'u calıstırmak için hedef bir collection vermeliyiz

        for(int each : arr

        ){
            System.out.print(each + " ");
        }

        // avantaji :index, baslangic degeri,bitis degeri gibi detaylarla
        // ugrasmamiza gerek kalmadan collections'dan tum elementi bize getirir
        //dezavantaji : index e bagli bir islem yapamayiz



    }
}
