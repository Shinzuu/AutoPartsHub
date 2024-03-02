public class Wheels extends Parts {
    private int diameter;

    public Wheels(int id, String name, String type, String brand, int price, int volume, int diameter) {
        super(id, name, type, brand, price, volume);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}

