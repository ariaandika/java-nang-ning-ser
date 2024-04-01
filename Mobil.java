class Mobil {
    private String jenis;
    private String nama;
    private int tahun;

    public Mobil() {}
    public Mobil(String jenis, String nama, int tahun) {
        this.jenis = jenis;
        this.nama = nama;
        this.tahun = tahun;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    String getNama() {
        return nama;
    }

    String getJenis() {
        return jenis;
    }

    int getTahun() {
        return tahun;
    }

    void showRoom() {
        System.out.println("Nama mobil : " + this.getNama());
        System.out.println("Jenis mobil : " + this.getJenis());
        System.out.println("Tahun mobil : " + this.getTahun());
    }
}
