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
            System.out.println(m[i]);

        }
        
    }
}
