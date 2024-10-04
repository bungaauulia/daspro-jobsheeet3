import java.util.Scanner;
public class Jobsheet3Listrik {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

        boolean jmlPenggunaan;
        double tagihanListrik, hargaListrik = 1500;
        int lamaPemakaian;

        System.out.println("Apakah jumlah penggunaan listrik > 500 kwh? (true/false): ");
        jmlPenggunaan = input.nextBoolean();
        System.out.println("Masukkan jumlah penggunaan listrik/kwh: ");
        lamaPemakaian = input.nextInt();
        System.out.println("Harga listrik/jam: " + hargaListrik);

        tagihanListrik = lamaPemakaian * hargaListrik;
        System.out.println("Tagihan listrik anda: " + tagihanListrik);
    }
}