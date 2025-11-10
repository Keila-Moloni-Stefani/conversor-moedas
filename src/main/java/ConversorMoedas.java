import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoedas {
    private String apiKey;
    private HttpClient client;
    private Gson gson;

    public ConversorMoedas(String apiKey) {
        this.apiKey = apiKey;
        this.client = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public String converter(int opcao, double valor) {
        String moedaOrigem = "";
        String moedaDestino = "";

        switch (opcao) {
            case 1:
                moedaOrigem = "USD";
                moedaDestino = "BRL";
                break;
            case 2:
                moedaOrigem = "BRL";
                moedaDestino = "USD";
                break;
            case 3:
                moedaOrigem = "USD";
                moedaDestino = "ARS";
                break;
            case 4:
                moedaOrigem = "ARS";
                moedaDestino = "USD";
                break;
            case 5:
                moedaOrigem = "USD";
                moedaDestino = "COP";
                break;
            case 6:
                moedaOrigem = "COP";
                moedaDestino = "USD";
                break;
        }

        try {
            double taxa = obterTaxaCambio(moedaOrigem, moedaDestino);
            double valorConvertido = valor * taxa;

            return String.format(
                    "Conversão realizada com sucesso!\n" +
                            "   %s %.2f → %s %.2f\n" +
                            "   Taxa de câmbio: 1 %s = %.4f %s",
                    moedaOrigem, valor,
                    moedaDestino, valorConvertido,
                    moedaOrigem, taxa, moedaDestino
            );

        } catch (Exception e) {
            return "Erro ao realizar conversão: " + e.getMessage();
        }
    }

    private double obterTaxaCambio(String moedaOrigem, String moedaDestino)
            throws IOException, InterruptedException {

        String url = String.format(
                "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                apiKey, moedaOrigem, moedaDestino
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        if (response.statusCode() != 200) {
            throw new IOException("Erro na API: Status " + response.statusCode());
        }

        // JSON usando GSON
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);

        // Verifica se a resposta foi bem-sucedida
        String result = jsonResponse.get("result").getAsString();
        if (!result.equals("success")) {
            throw new IOException("Erro na resposta da API: " + result);
        }

        // Extrai a taxa de conversão
        return jsonResponse.get("conversion_rate").getAsDouble();
    }
}