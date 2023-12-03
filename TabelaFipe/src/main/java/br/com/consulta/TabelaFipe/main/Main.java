package br.com.consulta.TabelaFipe.main;

import br.com.consulta.TabelaFipe.model.DadosVeiculos;
import br.com.consulta.TabelaFipe.model.Modelos;
import br.com.consulta.TabelaFipe.model.Veiculo;
import br.com.consulta.TabelaFipe.service.ConsumoApi;
import br.com.consulta.TabelaFipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

        //Declaração de instancias fixas
        private Scanner leitura = new Scanner(System.in);
        private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1";
        private ConsumoApi consumo = new ConsumoApi();
        private ConverteDados conversor = new ConverteDados();

        public void exibeMenu(){
            var menu = """              
                    ------ Opções ------
                    -> Carro 
                    -> Moto
                    Escolha um tipo de veículo consultar valores:
                    """;
            System.out.print(menu);
            var ler = leitura.nextLine();
            String endereco = null;

            if (ler.toLowerCase().contains("carro")) {
                endereco = URL_BASE + "/carros/marcas";
            } else if (ler.toLowerCase().contains("moto")) {
                endereco = URL_BASE + "/motos/marcas";
            }

            var json = consumo.obterDados(endereco);
            var marcas = conversor.obterLista(json, DadosVeiculos.class);
            marcas.stream()
                    .sorted (Comparator.comparing (DadosVeiculos::codigo))
                    .forEach(System.out::println);

            System.out.println("Informe o código da marca para consulta:");
            var codigoMarca = leitura.nextLine();
            endereco = endereco + "/" + codigoMarca + "/modelos";
            json = consumo.obterDados(endereco);
            var modeloLista = conversor.obterDados(json, Modelos.class);

            System.out.println("\nModelos dessa marca");
            modeloLista.modelos().stream()
                    .sorted(Comparator.comparing(DadosVeiculos::codigo))
                    .forEach(System.out::println);

            System.out.println("Digite um trecho do nome de um veiculo:");
            var nomeVeiculo = leitura.nextLine();

            List<DadosVeiculos> modelosFiltrados = modeloLista.modelos().stream()
                    .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                    .collect(Collectors.toList());

            System.out.println("\nModelos filtrados:");
            modelosFiltrados.forEach(System.out::println);

            System.out.println("Digite o codigo do modelo filtrado:");
            var codigoModelo = leitura.nextLine();

            endereco = endereco + "/" + codigoModelo + "/anos";
            json = consumo.obterDados(endereco);
            List<DadosVeiculos> anos = conversor.obterLista(json,DadosVeiculos.class);
            List<Veiculo> veiculos = new ArrayList<>();

            for (int i = 0; i < anos.size(); i++) {
                var enderecoAnos = endereco + "/" + anos.get(i).codigo();
                json = consumo.obterDados(enderecoAnos);
                Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
                veiculos.add(veiculo);
            }

            System.out.println("Todos os veiculos filtrados por ano:");
            veiculos.forEach(System.out::println);
    }

}
