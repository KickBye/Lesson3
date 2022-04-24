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
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:4446/"))
                .header ( "Type","Hello")
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(response.body());

        getSome();






        HttpClient client5 = HttpClient.newHttpClient();
        HttpRequest request5 = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:4446/page5"))
                .header ( "Type","Hello")
                .build();
        HttpResponse<String> response5 = null;

        try {
            response5 = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("55555555555dsfsdf");

    }





    public static void getSome() {
        try{
        com.mashape.unirest.http.HttpResponse<String> response = Unirest
                .get("http://localhost:4446/")
                .header("Type", "Hello")
                .asString();
            System.out.println(response.getBody());
    }catch (UnirestException e){
            e.printStackTrace();
        }
    }

}
//Задание
//3.1 Написать несколько контектов для сервера, которые возможно будут делать некоторые вычисления в зависимости от запроса, или присылать что ни будь интересное.
