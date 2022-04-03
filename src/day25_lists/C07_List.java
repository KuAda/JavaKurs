package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        //bir listede ort ustunde bulunan element sayisini bulunuz

        List<Double> sayilar=new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        //ortalamayı bul
        double ort=0.0;
        double toplam=0.0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+=sayilar.get(i);

        }
        ort=toplam/sayilar.size();
        System.out.println(ort);

        //ortalamanın ustunde olanlari,bir liste at

        List<Double> ortalamanınustundekiler=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i)>ort){
                ortalamanınustundekiler.add(sayilar.get(i));
            }

        }
        System.out.println(ortalamanınustundekiler);


    }
}
