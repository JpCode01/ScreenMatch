package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excessao.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Deserializer {
    public static Titulo jsonToObj(String endereco) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        Titulo meuTitulo = null;
        try {
            HttpClient client = HttpClient.newHttpClient(); // Cria o client (quem vai fazer o pedido)
            HttpRequest request = HttpRequest.newBuilder() // Cria uma requisição e informa o endereço para onde vai
                    .uri(URI.create(endereco)) // Obs: Utiliza o padrão builder, pois é um objeto complexo que precisa ser simplificado, muito usado no Design Pattern
                    .build();
            HttpResponse<String> response = client // É uma interface que obtem uma resposta
                    .send(request, HttpResponse.BodyHandlers.ofString());// send é responsável por obter a resposta
            String json = response.body();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

            meuTitulo = new Titulo(meuTituloOmdb);

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o enderço");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }
        return meuTitulo;
    }
}
