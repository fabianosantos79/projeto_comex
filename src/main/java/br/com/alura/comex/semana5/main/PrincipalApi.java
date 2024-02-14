package br.com.alura.comex.semana5.main;

import br.com.alura.comex.semana5.api.APIConverter;
import br.com.alura.comex.semana5.api.ProductApi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do produto");
        int id = scanner.nextInt();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        String endereco = "https://fakestoreapi.com/products/"+id;

        try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(json);

        APIConverter minhaApiConvertida = gson.fromJson(json, APIConverter.class);
        ProductApi myproductApi = new ProductApi(minhaApiConvertida);
        System.out.println(myproductApi);
        }catch(NumberFormatException erro){
            System.out.println("Aconteceu um erro: " + erro.getMessage());
        }
    }
}
