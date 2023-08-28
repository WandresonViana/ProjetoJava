import java.util.Scanner;

public class InicioMain {
    public static void main(String[] args) throws Exception {
        Scanner en = new Scanner(System.in);
        int novo[] = new int[5];
        
        int cont = 0;
        

        while(cont < 5){
            System.out.println("Digite um valor");
            novo[cont] = en.nextInt();
            cont++;
        }

        for(int cot = 0; cot < novo.length; cot++){
            System.out.print(novo[cot] + " ");
        }
        
    }
}
