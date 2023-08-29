import java.util.Scanner;

public class InicioMain {
    public static void main(String[] args) throws Exception {
        Scanner en = new Scanner(System.in);
        int novo[] = new int[5];
        
        int cont = 0;
        int maior = 0;

        while(cont < 5){
            System.out.println("Digite um valor");
            novo[cont] = en.nextInt();
            cont++;
        }

        for(int cot = 0; cot < novo.length; cot++){
            if(novo[cot] >= 99){
                System.out.println("Abacaxi");
            }
            System.out.println(novo[cot] + " ");
        }

        for(int op = 0; op < novo.length; op++ ){
            if(op == 0){
                maior = novo[0];
            }else if(maior < novo[op]){
                maior = novo[op];
            }
        }
        System.out.println("Esse é o maior valor " + maior);
    }
}
