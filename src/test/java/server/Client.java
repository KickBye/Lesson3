package server;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
    public static void main(String[] args) {
        //создали клиент
        HttpClient client = HttpClient.newHttpClient();

//объект класса запроса, отправляем запрос на сервер  с заголовком хеллоу
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:4450/home4"))
                .header ( "Type","Home4")
                .build();



//создание ответа, создание переменной куда сохраним ответ
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        //вывод тела ответа
        System.out.println(response.body());



        getSome();






        HttpClient client5 = HttpClient.newHttpClient();
        HttpRequest request5 = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:4450/home5"))
                .header ( "Type","Home5")
                .build();
        HttpResponse<String> response5 = null;

        try {
            response5 = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("концовка");

    }




//клиент через мавен
    public static void getSome() {
        try{
            //HttpResponse такой класс уже есть поэтому точный путь указан
        com.mashape.unirest.http.HttpResponse<String> response = Unirest
                .get("http://localhost:4450/home5")
                .header("Type", "Home5")
                .asString();
            System.out.println(response.getBody());
    }catch (UnirestException e){
            e.printStackTrace();
        }
    }

}
//Задание
//3.1 Написать несколько контектов для сервера, которые возможно будут делать некоторые вычисления в зависимости от запроса, или присылать что ни будь интересное.
