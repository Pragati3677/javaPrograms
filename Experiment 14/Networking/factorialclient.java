import java.io.*;
import java.net.*;
import java.util.Scanner;

public class factorialclient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            dos.writeInt(number);
            long result = dis.readLong();

            System.out.println("Factorial is: " + result);

            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}