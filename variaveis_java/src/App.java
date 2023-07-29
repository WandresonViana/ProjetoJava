import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //objeto para entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Tipos de variáveis
        String mensagem = "Exemplo de mensagem de texto";
        int inteiro = 5;
        float pontoFlutuante = 5.4f;
        boolean condicao = true;

        //Exemplo de um aluno
        String nomeAluno;
        float nota1;
        float nota2;
        float media;

        //Trabalhando com entrada de dados
        System.out.print("Digite O nome do aluno: ");
        nomeAluno = entrada.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextFloat();

        //calculando a média
        media = (nota1 + nota2)/2;

        //Mostrando no terminal
        System.out.printf("Aluno(a): %s. Sua primeira nota é %.2f e sua segunda nota é %.2f. Sua média é igual a: %.2f", nomeAluno, nota1, nota2, media);



    }
}
