class Praktikum4 {
    public static void main(String[] args) {
        var n = new Nilai();
        var huruf = n.getNilHuruf(70);
        var pred = n.getPredikat(huruf);

        System.out.println("Predikat: " + pred);
        System.out.println("Huruf: " + huruf);
    }
}

class Nilai {
    char nHuruf;
    String predikat;

    String getPredikat(char huruf) {
        switch (huruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
                break;
        }
        return predikat;
    }

    char getNilHuruf(int nilai) {
        if (nilai >= 85)
            nHuruf = 'A';
        else if (nilai >= 70 && nilai <85)
            nHuruf = 'B';
        else if (nilai >= 60 && nilai <70)
            nHuruf = 'C';
        else if (nilai >= 40 && nilai <60)
            nHuruf = 'D';
        else
            nHuruf = 'E';
        return nHuruf;
    }
}

// 85-100   A Apik
// 70-84    B Baik
// 60-69    C Cukup
// 40-59    D Dablek
// 0-39     E Elek

