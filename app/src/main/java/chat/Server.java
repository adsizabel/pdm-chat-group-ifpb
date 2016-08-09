package chat;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Izabel Silva on 07/08/2016.
 */
public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(10999) );

        System.out.println("Cliente: enviando mensagem...");
        Socket socket = serverSocket.accept();
        //System.out.println("Cliente: enviando mensagem...");
        socket.getOutputStream().write("Hello!".getBytes());
        socket.getOutputStream().flush();
        socket.close();
        serverSocket.close();
    }
}
