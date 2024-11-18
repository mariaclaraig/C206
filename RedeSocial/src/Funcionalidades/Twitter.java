package Funcionalidades;

public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // interfaces
    @Override
    public void compartilhar(){
        System.out.println("Uma publicação foi compartilhada no Twitter. ");
    }

    // métodos a herdar da rede social
    @Override
    public void postarFoto(){
        System.out.println("Foi postada uma foto no Twitter. ");
    }

    @Override
    public void postarVideo(){
        System.out.println("Foi postado um vídeo no Twitter. ");
    }

    @Override
    public void postarComentario(){
        System.out.println("Foi postada um comentário no Twitter. ");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Foi curtida uma publicação no Twitter. ");

    }
}
