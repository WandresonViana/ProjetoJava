import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) throws Exception {
        //Objeto para entrada de dados
        Scanner entrada = new Scanner(System.in);


        //Usando média do aluno como exemplo
        String aluno;
        float nota1 = 0;
        float nota2 = 0;
        float media = 0;
        boolean statusdoAluno;

        //Solicitando ao usuário os dados
        System.out.print("Digite o nome do aluno(a): ");
        aluno = entrada.nextLine();
        for(int cont = 0; cont < 1; cont ++){
            System.out.print("Digite a nota do aluno: ");
            if(cont == 0){
                nota1 = entrada.nextFloat();
            }else{
                nota2 = entrada.nextFloat();
            }  
        }    
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextFloat();

        //Calculando a media
        media = (nota1 + nota2)/ 2;

        //Verificando se o aluno está aprovado
        statusdoAluno= (media >= 6)?true:false;

        //Saida de dados
        System.out.printf("%s teve como primeira nota: %.2f e como segunda nota: %.2f. Sua media foi: %.2f.", aluno, nota1, nota2, media);
        if(statusdoAluno == true){
            System.out.print(" Aluno aprovado.");
        }else{
            System.out.print(" Aluno reprovado.");
        }
    }
}
