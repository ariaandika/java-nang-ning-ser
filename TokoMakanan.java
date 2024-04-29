// semua masakan 15k
// tampil menu, pilih: 5 itung, 6 minggat
// masukan uang bayar, dan hit kemali
// ngulang nganti 6

import java.util.Scanner;

class TokoMakanan {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        loop_toko:
        while (true) {
            System.out.print("1. Nasi Goreng ");
            System.out.print("2. Nasi Rawon ");
            System.out.print("3. Nasi Gudeg ");
            System.out.println("4. Jus Jeruk");

            String pilihan1 = null;
            String pilihan2 = null;
            String pilihan3 = null;
            String pilihan4 = null;

            while (true) {
                System.out.print("Pilih menu: ");
                int pilihan = sc.nextInt();

                if (pilihan == 1) {
                    pilihan1 = "Nasi Goreng";
                } else if (pilihan == 2) {
                    pilihan2 = "Nasi Rawon";
                } else if (pilihan == 3) {
                    pilihan3 = "Nasi Gudeg";
                } else if (pilihan == 4) {
                    pilihan4 = "Jus Jeruk";
                } else if (pilihan == 5) {
                    break;
                } else if (pilihan == 6) {
                    break loop_toko;
                }

                System.out.println("");
            }

            System.out.print("Pilihan anda: ");
            int harga = 0;

            if (pilihan1 != null) {
                System.out.print(pilihan1 + ", ");
                harga += 15000;
            }
            if (pilihan2 != null) {
                System.out.print(pilihan2 + ", ");
                harga += 15000;
            }
            if (pilihan3 != null) {
                System.out.print(pilihan3 + ", ");
                harga += 15000;
            }
            if (pilihan4 != null) {
                System.out.print(pilihan4 + ", ");
                harga += 15000;
            }

            System.out.println("");
            System.out.println("Harga total: " + harga);
            System.out.print("Masukan uang anda: ");

            int uang = sc.nextInt();

            var kembalian = uang - harga;

            if (kembalian < 0) {
                System.out.println("Uang anda kurang: " + (kembalian * -1));
            } else {
                System.out.println("Kembalian anda: " + kembalian);
            }
        }
    }
}
