// TCP Client (Chat)
import java.io.*;
import java.net.*;

public class clientchat {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("10.1.88.64", 1520);
            System.out.println("Connected to server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String inputLine, outputLine;

            while (true) {
                System.out.print("You: ");
                outputLine = userInput.readLine();
                out.println(outputLine);
                if (outputLine.equalsIgnoreCase("exit")) break;

                inputLine = in.readLine();
                System.out.println("Friend: " + inputLine);
                if (inputLine.equalsIgnoreCase("exit")) break;
            }

            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}