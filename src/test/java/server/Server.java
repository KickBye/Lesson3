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
        //Задание порта вручню
     int portNum = 4450;

// Задание порта из pom файла, через приведение типов ...





        HttpServer server = null;



//трай кеч на случай если сервер упадет
        try {
            //говорим какой порт будет занимать штатный сервер внутри явы
            server= HttpServer.create();
            server.bind (new InetSocketAddress(portNum),0);
        }catch (IOException e) {
            e.printStackTrace();
        }



        HttpContext context = server.createContext("/",new Server.EchoHandler());
        HttpContext context2 = server.createContext("/page2",new Server.EchoHandler2());

        //Домашняя работа
        HttpContext context3 = server.createContext("/home3",new Server.EchoHandler3());
        HttpContext context4 = server.createContext("/home4",new Server.EchoHandler4());
        HttpContext context5 = server.createContext("/home5",new Server.EchoHandler5());
        HttpContext context6 = server.createContext("/home6",new Server.EchoHandler6());


        //запуск сервера
        server.setExecutor(null);
        server.start();

    }

    //создание класса расширенного интерфейсом, запуск сервера 1
    static class EchoHandler implements HttpHandler{
//реализация метода из интерфейса, получаем на вход запрос
        //HttpExchange встроенный в ява сервер
        @Override
        public void handle(HttpExchange exchange) throws IOException {


            //генерит обычную строку
            StringBuilder builder = new StringBuilder();

            //создание коллекции хедеров, получаем все его заголовки
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s->headers.add(s.toString()));
            //выводим заголовки
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("headers:"+o));



            for (String a: headers){
                //если заголовок будет содержать слово "хэллоу", то выводить строку
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");

                }
            }


            //всегда выводим просто так
            builder.append("GoGoGo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


            //записываем вывод в массив с байтами
            byte[] bytes = builder.toString().getBytes();
            //отправь заголовки с кодом 200, и количество байтов))
            exchange.sendResponseHeaders(200,bytes.length);

            //взять тело ответа,
            OutputStream os = exchange.getResponseBody();
            //запиши туда байты
            os.write(bytes);
            //закрой OutputStream, его всегда нужно закрывать, чтобы он не висел как поток отдельный
            os.close();
            //закрытие самого запроса
            exchange.close();

        }
    }

    //запуск сервера 2 для второй странички
    static class EchoHandler2 implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            //записывание заголовков в массив
            exchange.getRequestHeaders().values().forEach(s-> headers.add(s.toString()));
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

            String value1 = "First value ";
            String value2 = "Second value";





            builder.append(value1+value2);


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
                if (a.contains("Home4")){
                    builder.append(headers);

                }
            }
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
                if (a.contains("Home5")){
                    builder.append("Пятое выбрано");

                }
            }
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
