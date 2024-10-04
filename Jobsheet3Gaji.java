import java.util.Scanner;
public class Jobsheet3Gaji {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double jamKerja, upah, gajiAwal, gajiBonus, gajiBersih;
        float pajak = 5 / 100f, bonus = 10 / 100f;

        System.out.println("Jam kerja karyawaan: ");
        jamKerja = sc.nextDouble();
        System.out.println("Upah karyawan/jam: ");
        upah = sc.nextDouble();

        gajiAwal = jamKerja * upah;
        System.out.println("Gaji anda: Rp. " + gajiAwal);

        gajiBonus = gajiAwal + (gajiAwal * bonus);
        System.out.println("Gaji bonus: Rp. " + gajiBonus);

        gajiBersih = gajiBonus - (gajiBonus * pajak);
        System.out.println("Gaji yang anda terima: Rp. " + gajiBersih);

        


    }
}