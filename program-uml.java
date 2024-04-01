class BangunDatar {
    public float luas() {
        return 0;
    }

    public float keliling() {
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return sisi * 4;
    }

}

class Lingkaran extends BangunDatar {
    float r;

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float)3.14 * r * r;
    }

    @Override
    public float keliling() {
        return 2 * (float)3.14 * r;
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return (panjang + lebar) * 2;
    }
}

class Segitiga extends BangunDatar {
    float tinggi;
    float alas;

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    @Override
    public float luas() {
        return alas * tinggi / 2;
    }

    @Override
    public float keliling() {
        return alas * 3;
    }
}

class ProgramUml {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(8);

        System.out.println("Persegi dengan sisi 8:");
        System.out.println("Keliling: " + persegi.keliling());
        System.out.println("Luas: " + persegi.luas());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(8);

        System.out.println("Lingkaran dengan r 8:");
        System.out.println("Keliling: " + lingkaran.keliling());
        System.out.println("Luas: " + lingkaran.luas());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(12);
        persegiPanjang.setLebar(8);

        System.out.println("Persegi Panjang dengan panjang 12 dan lebar 8:");
        System.out.println("Keliling: " + persegiPanjang.keliling());
        System.out.println("Luas: " + persegiPanjang.luas());

        Segitiga segitiga = new Segitiga();
        segitiga.setTinggi(12);
        segitiga.setAlas(8);

        System.out.println("Segitiga dengan tinggi 12 dan alas 8:");
        System.out.println("Keliling: " + segitiga.keliling());
        System.out.println("Luas: " + segitiga.luas());
    }
}

