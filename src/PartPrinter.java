public class PartPrinter {

    public static void printPartInfo(Parts part) {
        System.out.println("        +---------------------------->");
        System.out.println("        |      " + part.getClass().getSimpleName() );
        System.out.println("        +---------------------------->");
        System.out.println("        +---------------------------->");
        System.out.println("        | - ID: " + part.id);
        System.out.println("        | - Name: " + part.name);
        System.out.println("        | - Type: " + part.type);
        System.out.println("        | - Brand: " + part.brand);
        System.out.println("        | - Price: " + part.price+"$");

        if (part instanceof Engine) {
            System.out.println("        | - Horse Power: " + ((Engine) part).getHorsepower()+" BHP");
        }
        else if(part instanceof Wheels){
            System.out.println("        | - Wheel Size: " + ((Wheels) part).getDiameter()+" inches");
        }
        else if(part instanceof Turbo){
            System.out.println("        | - Boost max: " + ((Turbo) part).getBoost()+" psi");
        }
        else if(part instanceof RearWing){
            System.out.println("        | - Wing material: " + ((RearWing) part).getMaterial());
        }
        else if(part instanceof AeroKit){
            System.out.println("        | - Color available: " + ((AeroKit) part).getColor());
        }
        System.out.println("        | - Available parts: " + part.volume);
        System.out.println("        +---------------------------->");
    }
}
