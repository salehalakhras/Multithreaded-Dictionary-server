import java.io.*;
import java.net.*;

public class ClientServer {
    public static void main(String[] args) throws Exception {
        Socket clienSocket = new Socket("localhost", 999);
        PrintWriter output = new PrintWriter(clienSocket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            output.println(userInput);
            System.out.println(input.readLine());
        }
        output.close();
        input.close();
        stdIn.close();
        clienSocket.close();
    }
}
