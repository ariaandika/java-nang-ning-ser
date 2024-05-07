class Uts4 {
    public static void main(String[] args) {
        var tv = new Televisi("LG",'M');
        var kp = new Kipas("Sanyo");
        tv.hidupkan();
        tv.matikan();
        tv.perbesarVolume();
        tv.perkecilVolume();
        tv.gantiChannel(4);
        kp.hidupkan();
        kp.matikan();
        kp.percepatKipas();
        kp.perlambat();
    }
}

interface Elektronik {
    public void hidupkan();
    public void matikan();
}

class Televisi implements Elektronik {
    String merk;
    char channel;
    int volume;
    public Televisi(String merk, char channel) {
        this.merk = merk;
        this.channel = channel;
        this.volume = 0;
    }
    public void hidupkan() {
        System.out.println("hidupkan tv");
    }
    public void matikan() {
        System.out.println("matikan tv");
    }
    public void gantiChannel(int channel) {
        this.channel = (char)channel;
    }
    public void perbesarVolume() {
        this.volume += 1;
    }
    public void perkecilVolume() {
        this.volume -= 1;
    }
}

class Kipas implements Elektronik {
    String merk;
    int kecepatanKipas;
    public Kipas(String merk) {
        this.merk = merk;
        this.kecepatanKipas = 0;
    }
    public void hidupkan() {
        System.out.println("hidupkan kipas");
    }
    public void matikan() {
        System.out.println("matikan kipas");
    }
    public void percepatKipas() {
        this.kecepatanKipas += 1;
    }
    public void perlambat() {
        this.kecepatanKipas -= 1;
    }
}

