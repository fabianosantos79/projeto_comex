package br.com.alura.comex.semana5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        String endereco = "https://fakestoreapi.com/products/1";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String>response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(json);
    }
}
