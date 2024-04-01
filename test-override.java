class Mobil {
    public void mobilJalan() {
        System.out.println("gas kopling");
    }
}

class MobilMatic extends Mobil {
    @Override
    public void mobilJalan() {
        System.out.println("gas matic");
    }
}

class MobilTruk extends Mobil {
    public void mobilJalan() {
        super.mobilJalan();
    }
}

class TestOverride {
    public static void main(String[] args) {
        Mobil manual = new Mobil();
        Mobil matic = new MobilMatic();
        Mobil truk = new MobilTruk();

        manual.mobilJalan();
        matic.mobilJalan();
        truk.mobilJalan();
    }

}

