public class Parts {
    protected int id;
    protected String name;
    protected String type;
    protected String brand;
    protected int price;
    protected int volume;

    // Constructor
    public Parts(int id, String name, String type, String brand, int price, int volume) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
    }

    // Factory method to create Parts object from CSV line
    public static Parts createFromCSVLine(String line) {
        String[] data = line.split(",");
        int id = Integer.parseInt(data[0].trim());
        String name = data[1].trim();
        String type = data[2].trim();
        String brand = data[3].trim();
        int price = Integer.parseInt(data[4].trim());
        int volume = Integer.parseInt(data[5].trim());

        if (type.equalsIgnoreCase("Engine")) {
            // Parse additional data for Engine
            int horsepower = Integer.parseInt(data[6].trim());
            return new Engine(id, name, type, brand, price, volume, horsepower);
        }
        else if(type.equalsIgnoreCase("Wheels")){
            int diameter = Integer.parseInt(data[6].trim());
            return new Wheels(id, name, type, brand, price, volume, diameter);
        }
        else if(type.equalsIgnoreCase("Turbo")){
            String boost = (data[6].trim());
            return new Turbo(id, name, type, brand, price, volume, boost);
        }
        else if(type.equalsIgnoreCase("Ecu")){
            return new Ecu(id, name, type, brand, price, volume);
        }
        else if(type.equalsIgnoreCase("Rear wing")){
            String material = (data[6].trim());
            return new RearWing(id, name, type, brand, price, volume, material);
        }
        else if(type.equalsIgnoreCase("Aero Kit")){
            String color = (data[6].trim());
            return new AeroKit(id, name, type, brand, price, volume, color);
        }
        else {
            // For other types, create a regular Parts object
            return new Parts(id, name, type, brand, price, volume);
        }
    }
}
