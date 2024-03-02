public class Engine extends Parts {
    private int horsepower;

    public Engine(int id, String name, String type, String brand, int price, int volume, int horsepower) {
        super(id, name, type, brand, price, volume);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
