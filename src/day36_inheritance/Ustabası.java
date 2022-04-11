package day36_inheritance;

public class Ustabası extends Isci{

    public static void main(String[] args) {

        Ustabası ustabası1 = new Ustabası();

        ustabası1.saatUcreti=15;
        ustabası1.isim="Murat";
        ustabası1.soyisim="Gokcek";
        ustabası1.maas= ustabası1.maasHesapla();
        ustabası1.statu="Isci";
        ustabası1.isciStatu="Ustabasi";
        System.out.println(ustabası1);

    }

    @Override
    public String toString() {
        return "Ustabası{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
