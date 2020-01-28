package coba;

public class Coba {

    private int hasil;
    private int angka1;
    private int angka2;
    int hasilpertambahan;
    int hasilpengurangan;
    int hasilperkalian;
    int hasilpembagian;

    public static void main(String[] args) {
        

    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka1() {
        return this.angka1;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public int getAngka2() {
        return this.angka2;
    }

    public void settHasil() {
        this.hasil = angka1;

    }

    public int getHasil() {
        return this.angka1 - angka2;

    }

    public int getpertambahan() {

        hasilpertambahan = angka1 + angka2;
        return hasilpertambahan;
    }

    public int getpengurangan() {

        hasilpengurangan = angka1 - angka2;
        return hasilpengurangan;
    }

    public int getperkalian() {

        hasilperkalian = angka1 * angka2;
        return hasilperkalian;
    }

    public int getpembagian() {

        hasilpembagian = angka1 / angka2;
        return hasilpembagian;

    }
}
