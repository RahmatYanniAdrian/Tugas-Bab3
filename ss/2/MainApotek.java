package PraktikumBab3Program2;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apotek pembeli = new Apotek();
        int pilihan = 0;
        int pil = 0;
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("SELAMAT DATANG DI SISTEM INFORMASI PENJUALAN APOTEK");
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-\n");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan Nama Anda   : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        String alamat = in.nextLine();
        Apotek data = new Apotek(nama, alamat);
        System.out.println("---------------------------------------------------\n");
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~-~-~-~-~-~-~-~-~-~PILIHAN MENU~-~-~-~-~-~-~-~-~-~-");
            System.out.println("\t1. Lihat daftar obat");
            System.out.println("\t2. Pilih obat melalui kode obat");
            System.out.println("\t3. Pilih obat melalui nama obat");
            System.out.println("\t4. Cetak total pembayaran");
            System.out.println("\t5. Keluar");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Pilihan anda : ");
            pilihan = in.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            switch (pilihan) {
                case 1:
                    pembeli.cetakDaftarObat();
                    break;
                case 2:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    do {
                        System.out.print("Masukkan kode obat   : ");
                        int kodeObat = in.nextInt();
                        System.out.print("Masukkan banyak obat : ");
                        int banyak = in.nextInt();
                        pembeli.pilihObat(kodeObat, banyak);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Pilih lagi ? 1. ya     2. tidak");
                        System.out.print(">>> ");
                        pil = in.nextInt();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    } while (pil != 2);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    break;
                case 3:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    do {
                        System.out.print("Masukkan nama obat   : ");
                        String namaObat = in.nextLine() + in.nextLine();
                        System.out.print("Masukkan banyak obat : ");
                        int bnyak = in.nextInt();
                        pembeli.pilihObat(namaObat, bnyak);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Pilih lagi ? 1. ya     2. tidak");
                        System.out.print(">>> ");
                        pil = in.nextInt();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    } while (pil != 2);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    break;
                case 4:
                    pembeli.cetakPembayaranObat(data);
                    break;
            }
        } while (pilihan != 5);
    }
}
