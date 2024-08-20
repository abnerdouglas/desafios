import java.io.IOException;
import java.util.Scanner;

public class ViaCepMain {

    public static void main(String[] args) throws IOException {

        int sair = 1;

        while(sair != 0){
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um CEP para buscar o endereço: ");
            String cep = leitura.nextLine();

            ConsultaCEP consultar = new ConsultaCEP();
            Endereco endereco = consultar.buscaEndereco(cep);
            System.out.println(endereco);

            GeradorJson geradorJson = new GeradorJson();
            geradorJson.arquivoJson(endereco);

            Scanner opcao = new Scanner(System.in);
            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            String saida = opcao.nextLine();

            if (saida.equals("0")) {
                break;
            }
        }
    }
}