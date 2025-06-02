package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Deserializer;
import br.com.alura.screenmatch.modelos.SerializerWriter;
import br.com.alura.screenmatch.modelos.Titulo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import io.github.cdimascio.dotenv.Dotenv;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("API_KEY");
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + apiKey;
            titulos.add(Deserializer.jsonToObj(endereco));
            SerializerWriter.objToJson(titulos);
        }
        System.out.println(titulos);
        System.out.println("O programa finalizou corretamente");

    }
}
