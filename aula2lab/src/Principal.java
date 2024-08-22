import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor de n para descobrir seu fatorial e os números pares no intervalo: ");
        int n = entrada.nextInt();

        Operacoes resultadoFatorial = new Operacoes();

        System.out.print("Resultado do fatorial de " + n + ": ");
        System.out.println(resultadoFatorial.calcFatorial(n));

        Operacoes resultadoMostraPares = new Operacoes();

        System.out.print("Pares entre 0 e " + n + ": ");
        for(int i=1; i<n ; i++){
            if(resultadoMostraPares.mostraPares(i)){
                System.out.print(i + " ");
            }
        }
    }
}

