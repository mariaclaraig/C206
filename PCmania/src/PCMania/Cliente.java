package PCMania;

public class Cliente {

    public String nome;
    public long cpf;
    Computador[] computador = new Computador[99];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){
        int precoTotal = 0;

        for(int i=0; i< this.computador.length; i++){
            if(computador[i] != null){
                precoTotal += computador[i].preco;
            }
        }

        return precoTotal;
    }
}
