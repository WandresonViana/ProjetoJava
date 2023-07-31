import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float primeiroValor;
        float segundoValor;
        float resultado = 0;
        String operador;
        String saida = " ";

        do{
            System.out.println("BEM VINDO A CALCULADORA");
            System.out.print("Digite o primeio valor: ");
            primeiroValor = entrada.nextFloat();
            System.out.print("Digite o segundo valor: ");
            segundoValor = entrada.nextFloat();
            System.out.println(" ");
            System.out.println("Digite [+] Para somar");
            System.out.println("Digite [-] para subtrair");
            System.out.println("Digite [*] para multiplicar");
            System.out.println("Digite [/] para dividir");
            operador = entrada.nextLine();

            switch(operador){
                case "+":
                    resultado = primeiroValor + segundoValor;
                    break;
                case "-":
                    resultado = primeiroValor - segundoValor;
                    break;
                case "*":
                    resultado = primeiroValor * segundoValor;
                    break;
                case "/":
                    resultado = primeiroValor / segundoValor;
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
            System.out.println(" ");
            System.out.println("O resultado é: " + resultado);

            //saida do programa

            System.out.print("Digite [S] para sair: ");
            saida = entrada.nextLine();
            if(saida.equals("S")){
                saida = "S";
            }else{
                saida = " ";
            }

        }while(saida == " ");

        System.out.println("FIM DO PROGRAMA!");
    }
}
