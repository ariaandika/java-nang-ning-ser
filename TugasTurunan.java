
class TugasTurunan {
    public static void main(String[] args) {
        Hewan sapi = new Sapi("Sapi","Mamalia",4,"mbemm");
        Kucing kucing = new Kucing("Kucing","Mamalia",4,"skriiit");
        Bebek bebek = new Bebek("Bebek","Non-Mamalia",2,"whoosh");
        Kambing kambing = new Kambing("Kambing","Mamalia",4,"vrooom");

        sapi.bersuara();
        kucing.bersuara();
        bebek.bersuara();
        kambing.bersuara();
    }
}

class Hewan {
    String nama;
    String jenis;
    int kaki;
    String suara;

    // kelas turunan
    // class sapi
    // class kucing
    // class bebek
    // class ayam
    // class kambing

    public Hewan(String nama, String jenis, int kaki, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.kaki = kaki;
        this.suara = suara;
    }

    public void bersuara() {
        System.out.println(nama + " bersuara " + suara);
    }
}

class Sapi extends Hewan {
    public Sapi(String nama, String jenis, int kaki, String suara) {
        super(nama,jenis,kaki,suara);
    }
}

class Kucing extends Hewan {
    public Kucing(String nama, String jenis, int kaki, String suara) {
        super(nama,jenis,kaki,suara);
    }
}

class Bebek extends Hewan {
    public Bebek(String nama, String jenis, int kaki, String suara) {
        super(nama,jenis,kaki,suara);
    }
}

class Kambing extends Hewan {
    public Kambing(String nama, String jenis, int kaki, String suara) {
        super(nama,jenis,kaki,suara);
    }
}

