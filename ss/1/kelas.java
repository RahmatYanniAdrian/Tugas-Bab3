package OOPpraktikumBAB3;

public class kelas {

    private String angka[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    public void overloadingMeth(int input) {
        if (input == 0) {
            System.out.println("nol");
        } else if (input < 12) {
            System.out.println(angka[input]);
        } else if (input < 20) {
            System.out.println(angka[input - 10] + " belas");
        } else if (input < 100) {
            System.out.println(angka[input / 10] + " puluh " + angka[input - (input / 10 * 10)]);
        } else if (input == 100) {
            System.out.println("seratus");
        }
    }

    public void overloadingMeth(String teks) {

        if (teks.equals("nol")) {
            System.out.println(0);
        }
        for (int i = 1; i < 12; i++) {
            if (teks.equals(angka[i])) {
                System.out.println(i);
            }
        }
        for (int i = 2; i < 10; i++) {
            if (teks.equals(angka[i] + " belas"))
            System.out.println(i + 10);
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (teks.equals(angka[i] + " puluh " + angka[j])) {
                    System.out.print(i);
                     System.out.println(j);
                }
               
            }
        }
        if (teks.equals("seratus")) {
            System.out.println(100);
        }

    }

}
