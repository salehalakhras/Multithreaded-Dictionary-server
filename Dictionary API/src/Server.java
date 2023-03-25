import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(999);
        Socket clientSocket = serverSocket.accept();
        PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputString;
        while ((inputString = input.readLine()) != null) {
            output.println("from server" + inputString);
        }
        output.close();
        input.close();
        clientSocket.close();
        serverSocket.close();
    }
}
