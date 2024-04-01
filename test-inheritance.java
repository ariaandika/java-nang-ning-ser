class Hewan {
    String nama;
    String suara;

    public void namaHewan(String nama) {
        this.nama = nama;
        System.out.println("Nama hewan: " + nama);
    }

    public void suaraHewan(String suara) {
        this.suara = suara;
        System.out.println("Suara hewan: " + suara);
    }
}

class Anjing extends Hewan {
    
}

class Kucing extends Hewan {
    
}

class TestInheritance {
    public static void main(String[] arg) {
        Hewan kucing = new Kucing();
        kucing.namaHewan("Kucing");
        kucing.suaraHewan("Meong");

        Hewan anjing = new Anjing();
        anjing.namaHewan("Anjing");
        anjing.suaraHewan("kur kur");
    }
}


