package io.ubona.udial.chat;

import java.util.concurrent.CountDownLatch;

import org.glassfish.tyrus.server.Server;


public final class  WebSocketServerManager {

    private Server server;

    public void runServer(boolean autoShutDown) throws Exception {
        server = new Server("localhost", 9090,
                "", null, ChatServer.class);

        server.start();

        
        if (autoShutDown) {
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                @Override
                public void run() {
                    server.stop();
                    System.out.println("Stopped WebSocket server");

                }
            }));

            System.out.print("Shutdown hook added");

        }

    }

    public void stop() {
        server.stop();
    }

    public static void main(String[] args) throws Exception {

        new WebSocketServerManager().runServer(false);
        new CountDownLatch(1).await();
    }

}
