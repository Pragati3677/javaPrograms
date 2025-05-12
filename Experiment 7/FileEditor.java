import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(" Please provide a filename as a command-line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        
        if (file.exists()) {
            System.out.println("📄 File found. Contents of the file:");
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
                return;
            }

            
            System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
            String response = scanner.nextLine().trim();

            if (response.equalsIgnoreCase("Yes")) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                    System.out.println("🔽 Enter data to append (type 'exit' on a new line to stop):");

                    while (true) {
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("exit")) break;
                        bw.write(input);
                        bw.newLine();
                    }

                    System.out.println("✅ Data appended to the file.");
                } catch (IOException e) {
                    System.out.println("Error appending to the file: " + e.getMessage());
                }
            } else {
                System.out.println(" No data appended.");
            }

        } else {
           
            System.out.println("📁 File does not exist. Creating new file: " + fileName);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                System.out.println("🔽 Enter data to store (type 'exit' on a new line to stop):");

                while (true) {
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                    bw.write(input);
                    bw.newLine();
                }

                System.out.println("✅ Data written to the new file.");
            } catch (IOException e) {
                System.out.println("Error creating/writing to the file: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
