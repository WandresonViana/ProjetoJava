import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        String nomePessoa, alistamento;
        int idade;

        System.out.print("Digite o Seu nome: ");
        nomePessoa = leitura.nextLine();
        System.out.print("Digite a sua Idade: ");
        idade = leitura.nextInt();

        if(idade < 16){
            alistamento = "Não obrigatório";
        }else{
            if(idade == 16 && idade >=18){
                alistamento = "Opcional";
            }else{
                alistamento = "Obrigatório";
            }
        }
        System.out.printf("O %s tem %s anos e o seu alistamento é %s", nomePessoa, idade, alistamento);

     
    }
}
