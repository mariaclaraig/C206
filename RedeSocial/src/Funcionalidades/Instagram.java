package Funcionalidades;
public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // métodos a herdar de rede social
    @Override
    public void postarFoto(){
        System.out.println("Foi postada uma foto no Instagram. ");
    }

    @Override
    public void postarVideo(){
        System.out.println("Foi postado um vídeo no Instagram. ");
    }

    @Override
    public void postarComentario(){
        System.out.println("Foi postada um comentário no Instagram. ");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Foi curtida uma publicação no Instagram. ");

    }

}
