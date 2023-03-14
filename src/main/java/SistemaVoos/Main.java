package SistemaVoos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação das estratégias de busca
        BuscaMenorPreco buscaPorPreco = new BuscaMenorPreco();
        BuscaMenorTempo buscaPorTempo = new BuscaMenorTempo();

        // Criação do contexto da busca de voos
        SistemaDeBuscaDeVoos buscaDeVoos = new SistemaDeBuscaDeVoos();

        // Definição da lista de voos
        List<Voo> voos = new ArrayList<>();
        voos.add(new Voo("São Paulo", "Rio de Janeiro", "01-04-2023", 2.3, 150.0));
        voos.add(new Voo("São Paulo", "Rio de Janeiro", "01-04-2023", 1.8, 160.0));
        voos.add(new Voo("São Paulo", "Rio de Janeiro", "02-04-2023", 2.1, 155.0));
        voos.add(new Voo("São Paulo", "Belo Horizonte", "01-04-2023", 1.0,200.0));
        voos.add(new Voo("São Paulo", "Belo Horizonte", "01-04-2023", 1.0,215.0));
        voos.add(new Voo("São Paulo", "Brasília", "01-04-2023", 2.3,250.0));
        voos.add(new Voo("São Paulo", "Curitiba", "01-04-2023", 2.0,100.0));

        // Menu de busca de voos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o critério de busca de voos:");
        System.out.println("1 - Menor preço");
        System.out.println("2 - Menor tempo de voo");
        int opcao = scanner.nextInt();

        // Execução da busca de voos com base na opção escolhida
        switch (opcao) {
            case 1:
                buscaDeVoos.definirCriterioDeBusca(buscaPorPreco);
                break;
            case 2:
                buscaDeVoos.definirCriterioDeBusca(buscaPorTempo);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        List<Voo> voosEncontrados = buscaDeVoos.buscarVoos("São Paulo", "Rio de Janeiro", "01-04-2023", voos);

        // Exibição dos resultados da busca
        if (voosEncontrados.isEmpty()) {
            System.out.println("Nenhum voo encontrado para os critérios de busca informados");
        } else {
            System.out.println("Voos encontrados:");
            for (Voo voo : voosEncontrados) {
                System.out.println(voo);
            }
        }
    }
}
