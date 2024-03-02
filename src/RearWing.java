public class RearWing extends Parts {
    private String material;  // Additional attribute for Rear Wing

    public RearWing(int id, String name, String type, String brand, int price, int volume, String material) {
        super(id, name, type, brand, price, volume);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
