import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) throws Exception {
        int n[] = new int[4];
        n[0] = 3;
        n[1] = 4;
        n[2] = 8;
        n[3] = 6;

        Arrays.sort(n);
        System.out.println(n.length);
        for(int valor: n){
            System.out.print(valor + " ");
        }

        System.out.println(" ");
        System.out.println("Iniciando vetor M");

        int m[] = {4,8,6,2,9,20,56};
        
        for(int i = 0; i < m.length; ++i){
            System.out.print(m[i] + " ");

        }
        System.out.println(" ");
        
        System.out.println("Iniciando vetor de nomes!");

        String s[] = {"Maria", "Carla", "Paula"};
        for(String contardor: s){
            System.out.println(contardor + " ");
        }

        System.out.println("Vetor de produtos");

        Produtos prod[] = new Produtos[2];

        prod[0] = new Produtos("Suco", "Caixa", 5);
        prod[1] = new Produtos("Café", "Pacote", 6.50);
        
        
        for(int i= 0; i < prod.length; i++){
            System.out.println(prod[i].getDescricao());
        }
    }
}
