import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedSafeFileReader {
    public static void main(String[] args) {
        String content = readFromFile("nonexistentfile.txt");
        if (content != null) {
            System.out.println(content);
        }
    }

    public static String readFromFile(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            return content.toString();
        } catch (IOException e) {
            System.out.println("An error occurred while attempting to read the file: " + e.getMessage());
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file reader: " + e.getMessage());
                }
            }
        }
    }
}
