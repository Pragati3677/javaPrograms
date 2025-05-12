import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalysis {
    public static void main(String[] args) {
       
        String filePath = "sample.txt";

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
              
                for (char ch : line.toCharArray()) {
                    char c = Character.toLowerCase(ch);
                    if ("aeiou".indexOf(c) != -1) {
                        vowelCount++;
                    }
                    if (c == 'a') {
                        aCount++;
                    }
                }

                
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

           
            System.out.println("📄 File Analysis Results:");
            System.out.println("Total Vowels: " + vowelCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total 'a' characters: " + aCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
