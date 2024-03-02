import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UniqueStringGenerator {
    //checks the different brand name and act likes a dictionary that holds unique string
    public static Set<String> generateUniqueStrings(String csvFilePath) {
        Set<String> uniqueStrings = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                //  index 3 contains the string of interest
                String stringValue = data.length > 3 ? data[3].trim() : "";

                if (!stringValue.isEmpty()) {
                    uniqueStrings.add(stringValue);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uniqueStrings;
    }
}
