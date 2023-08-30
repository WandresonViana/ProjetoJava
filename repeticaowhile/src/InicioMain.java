import java.util.Scanner;

public class InicioMain {
    public static void main(String[] args) throws Exception {
        Scanner en = new Scanner(System.in);
        int novo[] = new int[5];
        
        int cont = 0;
        int maior = 0;
        int menor = 0;

        while(cont < 5){
            System.out.println("Digite um valor");
            novo[cont] = en.nextInt();
            cont++;
        }

        for(int cot = 0; cot < novo.length; cot++){
            if(novo[cot] >= 9){
                System.out.println("Número maior que nove!");
            }
            
        }
        //Verificando o maior valor
        for(int op = 0; op < novo.length; op++){
            if(op == 0){
                maior = novo[op];
            }else if(maior < novo[op]){
                maior = novo[op];
            } 
        }
        System.out.println("Esse é o maior valor " + maior);

        for(int i = 0; i < novo.length; i++){
            for(int j = 0; j < novo.length; j++){
                if(novo[i] < novo[j]){
                    menor = novo[i];
                    novo[i] = novo[j];
                    novo[j] = menor;
                }
            }
        }

        for(int numeros = 0; numeros < novo.length; numeros++){
            System.out.println(novo[numeros]);
        }
    }
}
