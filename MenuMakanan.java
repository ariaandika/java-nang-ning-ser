import java.util.Scanner;

class MenuMakanan {
    public static void main(String[] args) {
        var menu = new MenuMakanan();
        var sc = new Scanner(System.in);

        while (true) {
            menu.printMenu();
            int pilihan;
            String pilih_menu;

            System.out.print("Pilih Menu:");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    pilih_menu = "Nasi Rames";
                    break;
                case 2:
                    pilih_menu = "Nasi Goreng";
                    break;
                case 3:
                    pilih_menu = "Nasi Gudeg";
                    break;
                case 4:
                    pilih_menu = "Nasi Kibuli";
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    continue;
            }

            System.out.println("Pilihan anda: " + pilih_menu);

            System.out.print("Pilih Lagi Y/N ?");
            String lagi = sc.next();

            if (lagi.equals("Y") || lagi.equals("y")) {
                continue;
            }
            break;
        }
    }

    void printMenu() {
        System.out.println("============");
        System.out.println("Nasi Rames");
        System.out.println("Nasi Goreng");
        System.out.println("Nasi Gudeg");
        System.out.println("Nasi Kibuli");
        System.out.println("============");
    }
}
