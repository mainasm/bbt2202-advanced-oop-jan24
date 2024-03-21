import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedFileContentReader {
      public static String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }
        reader.close();
        return content.toString();
    }

    public static void main(String[] args) {
        try {
            String content = readFile("src/existentfile.txt");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }
}
