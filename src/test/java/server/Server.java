package server;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
      int portNum = 4446;




        HttpServer server = null;

        try {
            server= HttpServer.create();
            server.bind (new InetSocketAddress(portNum),0);
        }catch (IOException e) {
            e.printStackTrace();
        }
        HttpContext context = server.createContext("/",new Server.EchoHandler());
        HttpContext context2 = server.createContext("/page2",new Server.EchoHandler2());
        HttpContext context3 = server.createContext("/page3",new Server.EchoHandler3());
        HttpContext context4 = server.createContext("/page4",new Server.EchoHandler4());
        HttpContext context5 = server.createContext("/page5",new Server.EchoHandler5());
        HttpContext context6 = server.createContext("/page6",new Server.EchoHandler6());
        server.setExecutor(null);
        server.start();

    }

    static class EchoHandler implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s->headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));

            for (String a: headers){
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");

                }
            }
            builder.append("GoGoGo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
    static class EchoHandler2 implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));

            for (String a: headers){
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");

                }
            }
            builder.append("page2");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
    static class EchoHandler3 implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s->headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));

            for (String a: headers){
                if (a.contains("Hello3")){
                    builder.append("Hello to, my friend3");

                }
            }
            builder.append("GoGoGo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!3333333333333");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
    static class EchoHandler4 implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s->headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));

            for (String a: headers){
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");

                }
            }
            builder.append("GoGoGo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!4444444444");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
    static class EchoHandler5 implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s->headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));

            for (String a: headers){
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");

                }
            }
            builder.append("GoGoGo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!555555555");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
    static class EchoHandler6 implements HttpHandler{


        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s->headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));

            for (String a: headers){
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");

                }
            }
            builder.append("GoGoGo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!666666666");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
}
