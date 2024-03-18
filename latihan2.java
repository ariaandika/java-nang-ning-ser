import java.util.Scanner;

class Latihan2 {
    public static void main(String[] args) {
        System.out.println("LATIHAN OOP JAVA");
        System.out.println("================");

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Masukan nama anda :");
        String nama = sc1.nextLine();
        System.out.println("Halo :" + nama);

        System.out.print("Masukan nilai anda :");
        int nilai = sc1.nextInt();
        System.out.println("Nilai anda :" + nilai);

        if (nilai >= 90) {
            System.out.println("Nilai huruf A");
        } else if (nilai >= 80) {
            System.out.println("Nilai huruf AB");
        } else if (nilai >= 70) {
            System.out.println("Nilai huruf B");
        } else if (nilai >= 65) {
            System.out.println("Nilai huruf BC");
        } else if (nilai >= 55) {
            System.out.println("Nilai huruf C");
        } else {
            System.out.println("Nilai huruf D");
        }

        System.out.print("Masukan angka 1: ");
        int angka1 = sc1.nextInt();
        System.out.print("Masukan angka 2: ");
        int angka2 = sc1.nextInt();

        int hasil = angka1 + angka2;
        System.out.println("Hasil");

        String ya = "Y";

        while (ya) {
            String iya = "Y";
            if (iya == "Y" || iya == "y") {
                int pil = 0;
                System.out.println("== MENU ==");
                System.out.println("1. TAMBAH ");
                System.out.println("2. KURANG ");
                System.out.println("3. KALI   ");
                System.out.println("4. BAGI   ");
                System.out.println("5. KELUAR ");
                System.out.println("==========");

                System.out.print("PILIH");
                pil = sc1.nextInt();

                if (pil == 5) {
                    break;
                } else if (pil == 1) {
                    System.out.println("Anda memilih " + pil);
                }
            }
        }

    }
}






