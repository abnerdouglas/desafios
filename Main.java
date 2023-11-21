import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Abner Machado";
        String tipoConta = "Corrente";
        double saldo = 1600;

        System.out.println("--------------------------------\n");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n--------------------------------");

        String menu = """
                *** Digite sua Opção ***
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        int ler = 0;
        Scanner opcao = new Scanner(System.in);
        double valor = 0;


        while(ler != 4){
            System.out.println(menu);
            ler = leitura.nextInt();
            
            if (ler == 1){
                System.out.println("Saldo Atual: " + saldo + "\n");
            }
            else if (ler == 2){
                System.out.println("Digite o valor que deseja transferir: ");
                valor = opcao.nextInt();
                if (valor > saldo){
                    System.out.println("Saldo Insuficente!" + "\n");
                }
                else {
                    saldo -= valor;
                    System.out.println("Transferencia Realizada! Saldo Atual: " + saldo + "\n");
                }
            }
            else if (ler == 3){
                System.out.println("Digite o valor que deseja receber: ");
                valor = opcao.nextInt();
                saldo += valor;
                System.out.println("Valor Recebido! Saldo Atual: " + saldo + "\n");
            }
            else if (ler != 4) {
                System.out.println("Opção inválida!" + "\n");
            }
        }
    }
}




