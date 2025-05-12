// TCP Server (Chat)
import java.io.*;
import java.net.*;

public class serverchat {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1520);
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String inputLine, outputLine;

            while (true) {
                inputLine = in.readLine();
                System.out.println("Friend: " + inputLine);
                if (inputLine.equalsIgnoreCase("exit")) break;

                System.out.print("You: ");
                outputLine = userInput.readLine();
                out.println(outputLine);
                if (outputLine.equalsIgnoreCase("exit")) break;
            }

            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}