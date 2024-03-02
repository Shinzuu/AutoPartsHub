import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class Selector extends Parts {
    int x;

    public Selector(int x) {
        super(0, "", "", "", 0, 0);
        this.x = x;
        switch (x) {
            case 1:
                printPartAll();
                break;
            case 2:
                printPartType();
                break;
            case 3:
                printPartBrand();
                break;
            default:
                break;
        }
        new CallBack();
    }

    public static void printPartAll() {
        String csvFilePath = "Database/PartsData.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                Parts part = Parts.createFromCSVLine(line);
                printPart(part);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printPartAll(String s) {
        String csvFilePath = "Database/PartsData.csv";
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                Parts part = Parts.createFromCSVLine(line);
                if (part.type.equalsIgnoreCase(s) || part.brand.equalsIgnoreCase(s) || part.name.equalsIgnoreCase(s)) {
                    printPart(part);
                    found = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!found) {
            System.out.println("No parts found for the specified criteria: " + s);
        }
    }

    public void printPartType() {
        // Use AppScanner instead of direct Scanner
        System.out.println("Please select which type of product you want to see by, inserting number(1-6)");
        System.out.println("'--> 1 for Engine.");
        System.out.println("'--> 2 for Wheels.");
        System.out.println("'--> 3 for Turbo.");
        System.out.println("'--> 4 for ECU.");
        System.out.println("'--> 5 for Rear Wing.");
        System.out.println("'--> 6 for Aero Kit.");
        System.out.print("Select range: ");
        int y = AppScanner.nextInt();

        while (y < 1 || y > 6) {
            System.out.println("Invalid range. Please insert a number between 1 to 6: ");
            System.out.print("Select range: ");
            y = AppScanner.nextInt();
        }

        switch (y) {
            case 1:
                printPartAll("Engine");
                break;
            case 2:
                printPartAll("Wheels");
                break;
            case 3:
                printPartAll("Turbo");
                break;
            case 4:
                printPartAll("ECU");
                break;
            case 5:
                printPartAll("Rear Wing");
                break;
            case 6:
                printPartAll("Aero Kit");
                break;
            default:
                break;
        }
    }

    private void printPartBrand() {
        String csvFilePath = "Database/PartsData.csv";
        Set<String> uniqueStrings = UniqueStringGenerator.generateUniqueStrings(csvFilePath);

        System.out.println("Unique Strings:");
        int i = 1;
        for (String str : uniqueStrings) {
            System.out.println(i++ + " for " + str);
        }

        int y = AppScanner.nextInt();
        while (y < 1 || y > (i - 1)) {
            System.out.println("Invalid range. Please insert a number between 1 to " + (i - 1) + "");
            System.out.print("Select range: ");
            y = AppScanner.nextInt();
        }

        i = 1;
        for (String str : uniqueStrings) {
            if (i == y) {
                System.out.println("\t=====You chose " + str + "=====");
                System.out.println("=====The available parts from " + str + " are=====");
                System.out.println();
                printPartAll(str);
            } else {
                // do nothing
            }
            i++;
        }
    }

    public static void printPartName(String s) {
        printPartAll(s);
        new CallBack();
    }

    private static void printPart(Parts part) {
        PartPrinter.printPartInfo(part);
    }
}
