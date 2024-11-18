package Funcionalidades;
import Exceptions.UsuarioInvalidoE;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<RedeSocial> redesSociais = new HashSet<>();
        Usuario usuario = new Usuario(redesSociais);

        // Adicionando um usuário usando uma exceção checked
        try{
            usuario.setNome("Maria Clara Ignácio");
            usuario.setEmail("m.clara@gmail.com");
        }catch (UsuarioInvalidoE e){
            System.out.println(e.getMessage());
        }

        Twitter twitter = new Twitter("@11223344", 102);
        Facebook facebook = new Facebook("@ABC123", 386);
        GooglePlus googlePlus = new GooglePlus("Senha123.", 149);
        Instagram instagram = null;

        redesSociais.add(twitter);
        redesSociais.add(facebook);
        redesSociais.add(googlePlus);
        // Vai ser considerado exceção pela NullPointerException; unchecked
        //redesSociais.add(instagram);

        // Mostrando informações sobre as redes do usuário
        usuario.mostrarInfo();

        System.out.println();

        // Chamando métodos de duas redes sociais
        System.out.println("/// Métodos escolhidos para Twitter: ///");
        twitter.compartilhar(); // Rede que possui compartilhamento
        twitter.curtirPublicacao();
        twitter.postarComentario();
        System.out.println();

        System.out.println("/// Métodos escolhidos para Facebook: ///");
        facebook.fazStreaming();
        facebook.postarFoto();
        facebook.postarVideo();
    }
}