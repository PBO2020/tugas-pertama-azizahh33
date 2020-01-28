package coba;

public class Kalkulator {

    public static void main(String[] args) {
        Coba az = new Coba();

        az.setAngka1(50);
        az.setAngka2(5);

        System.out.println(" Angka 1 : " + az.getAngka1());
        System.out.println(" Angka 2 : " + az.getAngka2());
        System.out.println("============================");
        System.out.println(" Hasil Pertambahan   = " + az.getpertambahan());
        System.out.println(" Hasil Pengurangan   = " + az.getpengurangan());
        System.out.println(" Hasil Perkalian     = " + az.getperkalian());
        System.out.println(" Hasil Pembagian      = " + az.getpembagian());
    }
}
