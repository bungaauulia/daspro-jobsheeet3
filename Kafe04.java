import java.util.Scanner;
public class Kafe04 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double nominalBayar, totalHarga, hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.print("Keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga;

        System.out.println("Total harga:  Rp. " + totalHarga);
        System.out.println("Total harga dalam byte: Rp. " + totalByte);

        nominalBayar = totalHarga - (totalHarga*diskon);
        int nominalInt = (int) nominalBayar;

        System.out.println("Keanggotaan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, dan " + jmlRoti + " roti");
        System.out.println("Nominal bayar: Rp. " + nominalBayar);
        System.out.println("Nominal bayar dalam int: Rp. " + nominalInt);




    }
}