package PCMania;

public class Computador {
    public String marca;
    public float preco;
    public HardwareBasico[] hardwareBasico;
    public SistemaOperacional sistemaOperacional;
    public MemoriaUSB memoriaUSB;

    public Computador(){
        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico[99];
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Sistema Operacional e tipo: " + this.sistemaOperacional.nome + " / " + this.sistemaOperacional.tipo + " bits");
        for(int i=0; i<this.hardwareBasico.length; i++){
            if(hardwareBasico[i]!=null){
                System.out.println("Tipo de Hardware Básico " + i + ": " + this.hardwareBasico[i].nome + ", com capacidade " + this.hardwareBasico[i].capacidade);
                }
        }
        System.out.println("---------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
