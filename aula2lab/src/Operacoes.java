public class Operacoes{

    int n;

    int calcFatorial(int n) {
        int fatorial = 1;
        for (int i=1; i<=n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    boolean mostraPares(int n){

        boolean par = false;

        if(n%2==0){
            par = true;
        }

        return par;
    }
}
