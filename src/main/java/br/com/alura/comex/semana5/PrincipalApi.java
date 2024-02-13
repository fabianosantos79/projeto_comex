package br.com.alura.comex.semana5;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {

        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do produto");
        id = scanner.nextInt();
        String endereco = "https://fakestoreapi.com/products/"+id;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String>response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(json);

        Gson gson = new Gson();
    }
}
