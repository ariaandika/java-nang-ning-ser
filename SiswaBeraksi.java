class SiswaBeraksi {
    public static void main(String[] args) {
        Siswa sw = new Siswa();

        sw.setName("John Cena");
        sw.setNis("12378173913");
        sw.setAge(94);

        System.out.println("Nama siswa: " + sw.getName());
        System.out.println("Nis siswa: "  + sw.getNis());
        System.out.println("Umur siswa: " + sw.getAge());
    }
}
