import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) throws Exception {
        //Objeto para entrada de dados
        Scanner entrada = new Scanner(System.in);


        //Usando média do aluno como exemplo
        String aluno;
        float nota1;
        float nota2;
        float media;
        boolean statusdoAluno;


        System.out.print("Digite o nome do aluno(a): ");
        aluno = entrada.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextFloat();

        media = (nota1 + nota2)/ 2;

        if(media >= 6){
            statusdoAluno = true;
        }else{
            statusdoAluno = false;
        }


        System.out.printf("%s teve como primeira nota: %.2f e como segunda nota: %.2f. Sua media foi: %.2f.", aluno, nota1, nota2, media);
        if(statusdoAluno == true){
            System.out.print(" Aluno aprovado.");
        }else{
            System.out.print(" Aluno reprovado.");
        }



    }
}
