import java.util.Scanner;

public class InicioMain {
    public static void main(String[] args) throws Exception {
        Scanner en = new Scanner(System.in);
        int novo[] = new int[5];

        int cont = 0;

        while(cont < 5){
            novo[cont] = cont;
            System.out.println(novo[cont]);
            cont++;
        }
        
    }
}
