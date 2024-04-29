class Percabangan {
    public static void main(String[] args) {
        int a = 0;
        if (a < 10) {
            System.out.println("Ini pernyataan Benar");
        } else {
            System.out.println("Ini pernyataan Salah");
        }

        int nilai = 90;
        if (nilai > 90) {
            System.out.println("Predikat Istimewa");
        } else if (nilai > 80) {
            System.out.println("Predikat terpuji");
        } else {
            System.out.println("Predikat lumayan");
        }

        String nilai_huruf = "A";
        switch (nilai_huruf) {
            case "A":
                System.out.println("Predikat Apik");
                break;
            case "B":
                System.out.println("Predikat Baik");
                break;
            case "C":
                System.out.println("Predikat Cukup");
                break;
            default:
                System.out.println("Predikat Kurang Baik");
                break;
        }
    }
}

