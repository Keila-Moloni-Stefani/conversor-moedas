import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String apiKey = "42a70cfbf1ca1a47ec046ca7";
        ConversorMoedas conversor = new ConversorMoedas(apiKey);

        while (true) {
            exibirMenu();

            try {
                int opcao = scanner.nextInt();

                if (opcao == 7) {
                    System.out.println("\n Obrigado por usar o Conversor de Moedas! Até logo!");
                    break;
                }

                if (opcao < 1 || opcao > 7) {
                    System.out.println("\n Opção inválida! Por favor, escolha uma opção entre 1 e 7.");
                    continue;
                }

                System.out.print("\n Digite o valor que deseja converter: ");
                double valor = scanner.nextDouble();

                if (valor <= 0) {
                    System.out.println("\n Por favor, digite um valor maior que zero.");
                    continue;
                }

                String resultado = conversor.converter(opcao, valor);
                System.out.println("\n" + resultado);

            } catch (Exception e) {
                System.out.println("\n Erro: Por favor, digite um número válido.");
                scanner.nextLine(); // Limpa o buffer
            }

            System.out.println("\n" + "=".repeat(50));
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("BEM-VINDO AO CONVERSOR DE MOEDAS");
        System.out.println("=".repeat(50));
        System.out.println("\nEscolha uma opção de conversão:\n");
        System.out.println("1) Dólar (USD) → Real Brasileiro (BRL)");
        System.out.println("2) Real Brasileiro (BRL) → Dólar (USD)");
        System.out.println("3) Dólar (USD) → Peso Argentino (ARS)");
        System.out.println("4) Peso Argentino (ARS) → Dólar (USD)");
        System.out.println("5) Dólar (USD) → Peso Colombiano (COP)");
        System.out.println("6) Peso Colombiano (COP) → Dólar (USD)");
        System.out.println("7) Sair");
        System.out.print("\n➤ Digite sua opção: ");
    }
}
