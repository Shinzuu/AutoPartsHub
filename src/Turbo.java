public class Turbo extends Parts {
    private String boost;  // Additional attribute for Turbo

    public Turbo(int id, String name, String type, String brand, int price, int volume, String boost) {
        super(id, name, type, brand, price, volume);
        this.boost = boost;
    }

    public String getBoost() {
        return boost;
    }
}

