package Funcionalidades;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // interfaces
    @Override
    public void fazStreaming(){
        System.out.println("Uma vídeoconferência foi iniciada no GooglePlus. ");
    }

    @Override
    public void compartilhar(){
        System.out.println("Uma publicação foi compartilhada no GooglePlus. ");
    }

    // métodos a herdar da rede social
    @Override
    public void postarFoto(){
        System.out.println("Foi postada uma foto no GooglePlus. ");
    }

    @Override
    public void postarVideo(){
        System.out.println("Foi postado um vídeo no GooglePlus. ");
    }

    @Override
    public void postarComentario(){
        System.out.println("Foi postada um comentário no GooglePlus. ");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Foi curtida uma publicação no GooglePlus. ");

    }
}
