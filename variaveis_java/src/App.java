import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //objeto para entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Tipos de variáveis
        String mensagem = "Mensagem de texto";
        int inteiro = 5;
        float pontoFlutuante = 5.4f;
        boolean condicao = true;

        //Trabalhando com entrada de dados
        System.out.println("Digite uma mensagem com caracteres: ");
        mensagem = entrada.nextLine();
        System.out.println("Digite um número inteiro: ");
        inteiro = entrada.nextInt();
        System.out.println("Digite um número com ponto flutuante: ");
        pontoFlutuante = entrada.nextFloat();


        //Mostrando no terminal
        System.out.println("Esta é uma mensagem em String: " + mensagem);
        System.out.println("Este é um número inteiro: " + inteiro);
        System.out.println("Este é um númrero com ponto flutuante: " + pontoFlutuante);
        System.out.println("Esta é uma condicinal lógica: " + condicao);
    }
}
