package PraktikumBab3Program2;
public class Apotek {
    public String nama;
    public String alamat;
    public String namaObat[] = new String[8];
    public int kodeObat[] = new int[8];   
    public int harga[] = new int[8];   
    private int banyakObat[]= new int [10] ;
    private int pilihObat[]=new int [10];
    private int count=0;
    
    public Apotek() {
        kodeObat[0] = 151;
        namaObat[0] = "Panabol";
        harga[0] = 1000;
        kodeObat[1] = 152;
        namaObat[1] = "Bodrax";
        harga[1] = 1200;
        kodeObat[2] = 153;
        namaObat[2] = "Upilon";
        harga[2] = 1160;
        kodeObat[3] = 154;
        namaObat[3] = "Combatrim";
        harga[3] = 2500;
        kodeObat[4] = 155;
        namaObat[4] = "Diapit";
        harga[4] = 2000;
        kodeObat[5] = 156;
        namaObat[5] = "Flutamol";
        harga[5] = 2700;
        kodeObat[6] = 157;
        namaObat[6] = "Paracetamol";
        harga[6] = 1500;
        kodeObat[7] = 158;
        namaObat[7] = "Palamex";
        harga[7] = 500;
    }
    
    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void pilihObat(int kodeObat,int banyak) {
        for (int i = 0; i < 8; i++) {
            if (kodeObat == this.kodeObat[i]) {               
                pilihObat[count] = i;
                banyakObat[count]= banyak;
                count++;
            }
        }
    }

    public void pilihObat(String namaObat,int banyak) {
        for (int i = 0; i < 8; i++) {
            if (namaObat.equals(this.namaObat[i])) {                
                pilihObat[count] = i;
                banyakObat[count]= banyak;
                count++;
            }
        }
    }

    public void cetakDaftarObat() {
        System.out.println("'~'~'~'~'~'~DAFTAR OBAT APOTEK~'~'~'~'~'~'~");
        System.out.println("-------------------------------------------");
        System.out.println("| Kode Obat |  Nama Obat   | Harga/tablet |");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-5s%-7d%-3s%-12s%s%6d%s%n", "|", kodeObat[i], "|", namaObat[i], "| Rp. ", harga[i], ",- |");
        }
        System.out.println("-------------------------------------------\n");
    }
    
    public void cetakPembayaranObat(Apotek data){
        int total = 0;
        System.out.println("---------------KARTU PEMBAYARAN OBAT---------------");
        System.out.println("Nama   : " +data.nama);
        System.out.println("Alamat : "+data.alamat);
        System.out.println("~-~-~-~-~-~-~Daftar Obat Yang Di Pesan~-~-~-~-~-~-~");
        System.out.println("---------------------------------------------------");
        System.out.println("| Kode Obat |  Nama Obat   | Banyak |     Harga   |");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-5s%-7d%-3s%-12s%-3s%-6d%s%6d%s%n","|",kodeObat[pilihObat[i]],"|", namaObat[pilihObat[i]],"|",banyakObat[i],"|Rp. ",harga[pilihObat[i]]*banyakObat[i],",- |");
        }
        for (int i = 0; i < count; i++) {
            total+=harga[pilihObat[i]]*banyakObat[i];
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("%-36s%s%6d%s%n","|  Total Harga Keseluruhan ","|Rp. ",total,",- |");
        System.out.println("---------------------------------------------------\n");
    }
}
