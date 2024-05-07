class Uts3 {
    public static void main(String[] args) {
        var ph = new Phone("oddo", 500000);
        ph.test();
        ph.test("Camera");

        ph.add();
        ph.add(2);

        System.out.println("Total: " + ph.calculate());
    }
}

abstract class Product {
    String name;
    int price;
    int count;
    public abstract int calculate();
}

class Phone extends Product {
    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
        this.count = 0;
    }
    @Override
    public int calculate() {
        return this.price * this.count;
    }
    public void test() {
        System.out.println("phone testing");
    }
    public void test(String testing) {
        System.out.println("phone testing: " + testing);
    }
    public void add() {
        this.count += 1;
    }
    public void add(int count) {
        this.count += count;
    }
}

