package Funcionalidades;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // interfaces
    @Override
    public void fazStreaming(){
        System.out.println("Uma vídeoconferência foi iniciada no Facebook. ");
    }

    @Override
    public void compartilhar(){
        System.out.println("Uma publicação foi compartilhada no Facebook. ");
    }

    // métodos a herdar da rede social
    @Override
    public void postarFoto(){
        System.out.println("Foi postada uma foto no Facebook. ");
    }

    @Override
    public void postarVideo(){
        System.out.println("Foi postado um vídeo no Facebook. ");
    }

    @Override
    public void postarComentario(){
        System.out.println("Foi postado um comentário no Facebook. ");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Foi curtida a publicação no Facebook. ");
    }

}
