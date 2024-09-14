package PCMania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Maria Clara Ribeiro Ignácio", 1236657129); // informações do cliente

        int codigoPromocao; // referente ao código para selecionar a promoção
        int memoriaOpcional; // 1 ou 0, se o cliente escolhe incluir memória ou não

        System.out.println("Seja Bem-Vindo/a ao sistema de compras do PCMania!");
        System.out.println("===================================================");
        System.out.println("Promoções disponíveis:");
        System.out.println(" *Promocao 1: PC Positivo");
        System.out.println(" *Promocao 1: PC Acer");
        System.out.println(" *Promocao 1: PC Vaio");
        System.out.print("Insira a promoção desejada (1, 2 ou 3) ou (0) para sair do sistema de compras: ");

        boolean validacao = true; // flag para validar código de entrada dentro do switch
        int i = 0; // contador dentro da flag

        while(validacao){
            codigoPromocao = entrada.nextInt(); // entrar com código da promoção que deseja comprar
            switch(codigoPromocao){

                case 0: // case 0 sai do sistema de compra
                    validacao = false;
                    System.out.println("Você saiu do sistema de compra.");
                    break;

                case 1: // promoção 1
                    cliente.computador[i] = new Computador();
                    cliente.computador[i].marca = "Positivo";
                    cliente.computador[i].preco = 1980.00f; // 1980 + 0
                    cliente.computador[i].sistemaOperacional.nome = "Linux Ubuntu";
                    cliente.computador[i].sistemaOperacional.tipo = 32;
                    cliente.computador[i].hardwareBasico[0] = new HardwareBasico("Pentium Core i3", 2200f);
                    cliente.computador[i].hardwareBasico[1] = new HardwareBasico("Memória RAM", 8f);
                    cliente.computador[i].hardwareBasico[2] = new HardwareBasico( "HD", 500f);
                    cliente.computador[i].hardwareBasico[2].capacidade = 500.00f;
                    System.out.println("Você deseja adicionar Memória USB? Acompanha o PC um Pen-drive de 16Gb.");
                    System.out.println("Sim (1)");
                    System.out.println("Não (0)");
                    memoriaOpcional = entrada.nextInt();
                    if(memoriaOpcional == 1){
                        MemoriaUSB memoriaAdicionada = new MemoriaUSB(16, "Pen-drive");
                        cliente.computador[i].addMemoriaUSB(memoriaAdicionada);
                        System.out.println("Memória extra adicionada.");
                    }
                    System.out.println("Insira a próxima promoção desejada (1, 2 ou 3) ou (0) para sair do sistema de compras: ");
                    break;

                case 2: // promoção 2
                    cliente.computador[i] = new Computador();
                    cliente.computador[i].marca = "Acer";
                    cliente.computador[i].preco = 3214.00f; // 1980 + 1234
                    cliente.computador[i].sistemaOperacional.nome = "Windows 8";
                    cliente.computador[i].sistemaOperacional.tipo = 64;
                    cliente.computador[i].hardwareBasico[0] = new HardwareBasico("Pentium Core i5", 3370f);
                    cliente.computador[i].hardwareBasico[1] = new HardwareBasico("Memória RAM", 16f);
                    cliente.computador[i].hardwareBasico[2] = new HardwareBasico( "HD", 1000f);
                    System.out.println("Você deseja adicionar Memória USB? Acompanha o PC um Pen-drive de 32Gb.");
                    System.out.println("Sim (1)");
                    System.out.println("Não (0)");
                    memoriaOpcional = entrada.nextInt();
                    if(memoriaOpcional == 1){
                        MemoriaUSB memoriaAdicionada = new MemoriaUSB(32, "Pen-drive");
                        cliente.computador[i].addMemoriaUSB(memoriaAdicionada);
                        System.out.println("Memória extra adicionada.");
                    }
                    System.out.println("Insira a próxima promoção desejada (1, 2 ou 3) ou (0) para sair do sistema de compras: ");
                    break;

                case 3: // promoção 3
                    cliente.computador[i] = new Computador();
                    cliente.computador[i].marca = "Vaio";
                    cliente.computador[i].preco = 7658.00f; // 1980 + 5678
                    cliente.computador[i].sistemaOperacional.nome = "Windows 10";
                    cliente.computador[i].sistemaOperacional.tipo = 64;
                    cliente.computador[i].hardwareBasico[0] = new HardwareBasico("Pentium Core i7", 4500f);
                    cliente.computador[i].hardwareBasico[1] = new HardwareBasico("Memória RAM", 32f);
                    cliente.computador[i].hardwareBasico[2] = new HardwareBasico( "HD", 2000f);
                    System.out.println("Você deseja adicionar Memória USB? Acompanha o PC um HD Externo de 1Tb.");
                    System.out.println("Sim (1)");
                    System.out.println("Não (0)");
                    memoriaOpcional = entrada.nextInt();
                    if(memoriaOpcional == 1){
                        MemoriaUSB memoriaAdicionada = new MemoriaUSB(1000, "HD Externo");
                        cliente.computador[i].addMemoriaUSB(memoriaAdicionada);
                        System.out.println("Memória extra adicionada.");
                    }
                    System.out.println("Insira a próxima promoção desejada (1, 2 ou 3) ou (0) para sair do sistema de compras: ");
                    break;

            }
            i++;
        }


        // saída das informações

        System.out.println("Compra conluída! Seguem detalhes finais da compra: ");
        System.out.println("----- Informações pessoais -----");
        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("CPF registrado: " + cliente.cpf);
        System.out.println("----- Resumo de compras -----");
        for(int j=0; j<cliente.computador.length; j++){
            if(cliente.computador[j] != null) {
                cliente.computador[j].mostraPCConfigs();
            }
        }
        System.out.println(" ");
        System.out.println("VALOR FINAL: " + cliente.calculaTotalCompra());


    }
}