
class Inheritance {
    public static void main(String[] args) {
        Anak an1 = new Anak("Wigyo", 34);
        an1.cetak_data();

        System.out.println("Tunjangan: " + an1.tunjangan);
    }
}


class Bapak {
    String nama;
    int usia;

    public Bapak(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    } 
}

class Anak extends Bapak {
    int tunjangan = 15000;

    public Anak(String nama, int usia) {
        super(nama,usia);
    } 

    public void cetak_data() {
        System.out.println("Nama Anak :"+ nama);
        System.out.println("Usia :"+ usia);
    }
}

