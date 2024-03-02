public class AeroKit extends Parts {
    private String color;  // Additional attribute for Aero Kit

    public AeroKit(int id, String name, String type, String brand, int price, int volume, String color) {
        super(id, name, type, brand, price, volume);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

