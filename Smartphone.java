class Smartphone {
    private String name;
    private int price;
    private int releaseYear;

    public Mobil() {}
    public Mobil(String name, int price, int releaseYear) {
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    String getName() {
        return name;
    }

    String getPrice() {
        return price;
    }

    int getReleaseYear() {
        return releaseYear;
    }

    void showTime() {
        System.out.println("Phone name" + this.getName());
        System.out.println("Phone price" + this.getPrice());
        System.out.println("Phone release year" + this.getReleaseYear());
    }
}
