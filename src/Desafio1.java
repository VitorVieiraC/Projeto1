import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldoConta=0;
        String nomeTipoConta="";
        System.out.println("Vamos começar o cadrastro: ");
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("********");
        System.out.println("OBS: ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Contas Correntes iniciam com R$: 2000,50 e ");
        System.out.println("Contaa Poupançaa iniciam com R$: 2000,50");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("*************");
        System.out.println("1- Corrente");
        System.out.println("--------------");
        System.out.println("2- poupança ");
        System.out.println("******************");
        System.out.print("Escolha o tipo de conta: ");
        int opcao = leitor.nextInt();
        switch(opcao) {
            case 1:
                saldoConta = 2500.50;
                nomeTipoConta="Corrente";
                break;
            case 2:
                saldoConta = 2000.50;
                nomeTipoConta="Poupança";
                break;

            default:
                System.out.println("Escolha errada tente novamente");
                break;
        }

        System.out.println("***********************************************");
        System.out.println("Dodos iniciais: ");
        System.out.println("***********************************************");
        System.out.println("Nome: " + nome);
        System.out.println("---------------------------------------------");
        System.out.println("Tipo de conta: " + nomeTipoConta);
        System.out.println("---------------------------------------------");
        System.out.println("Saldo inicial: R$:" + saldoConta);
        System.out.println("***********************************************");
        double operacao= 0 ;
        while (operacao != 5){
            System.out.println("Operações : ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Saldo");
            System.out.println("3 - Transferir saldo");
            System.out.println("4 - Dados inicias");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            operacao = leitor.nextDouble();
            if (operacao==1){
                System.out.println("***********************************************");
                System.out.println("Seu saldo atualizado é : R$:"+saldoConta);
                System.out.println("***********************************************");
            } else if (operacao==2) {
                System.out.print("Qual valor do deposito: R$: ");
                double receber = leitor.nextDouble();
                saldoConta+=receber;
                System.out.println("***********************************************");
                System.out.println("Seu saldo atualizado é : R$:"+saldoConta);
                System.out.println("***********************************************");
            } else if (operacao==3) {
                System.out.print("Entre com valor da transferencia : R$:");
                double transferir = leitor.nextDouble();
                while (transferir>saldoConta){
                    System.out.println("Valor excede o saldo!!");
                    System.out.print("Tente novamente!! Digite um valor válido: R$:  ");
                    transferir = leitor.nextDouble();
                }
                saldoConta-=transferir ;
                System.out.println("***********************************************");
                System.out.println("Seu saldo atualizado é : R$:"+saldoConta);
                System.out.println("***********************************************");


            } else if (operacao==4) {
                System.out.println("***********************************************");
                System.out.println("Dodos iniciais: ");
                System.out.println("***********************************************");
                System.out.println("Nome: " + nome);
                System.out.println("---------------------------------------------");
                System.out.println("Tipo de conta: " + nomeTipoConta);
                System.out.println("---------------------------------------------");
                System.out.println("Saldo inicial: R$:" + saldoConta);
                System.out.println("***********************************************");

            } else if (operacao==5) {
                System.out.println("***********************************************");
                System.out.print("Obrigado pela atenção!! ");
                System.out.println("Ate logo!!");
                System.out.println("***********************************************");
            } else {
                System.out.println("Operação invalida!!");
                System.out.println("Tente novamente");
            }
        }
    }
}



