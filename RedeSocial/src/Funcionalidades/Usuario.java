package Funcionalidades;

import Exceptions.NullPointerE;
import Exceptions.UsuarioInvalidoE;

import java.util.Set;

public class Usuario{

    private String nome;
    private String email;
    Set<RedeSocial> redesSociais;

    public Usuario(Set<RedeSocial> redesSociais) {
        this.redesSociais = redesSociais;
    }

    private boolean emailValido(String email){
        String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z]+\\.com$";
        return email.matches(regex);
    }

    public void setNome(String nome) throws UsuarioInvalidoE {
        if(nome.length()>50) {
            throw new UsuarioInvalidoE("Nome muito longo. ");
        }
        else{
            this.nome = nome;
        }
    }

    public void setEmail(String email) throws UsuarioInvalidoE {
        if (emailValido(email) == false) {
            throw new UsuarioInvalidoE("E-mail inválido. ");
        } else {
            this.email = email;
        }
    }

    public void mostrarInfo() throws NullPointerE {
        System.out.println("Redes sociais que o usuário [" + nome + "] e e-mail [" + email + "] possui: ");
        for(RedeSocial rede: redesSociais){
                if(rede == null) {
                    throw new NullPointerE("Valor nulo, inválido. ");
                }else{
                    if(rede instanceof Twitter){
                        System.out.println("Twitter");
                    }
                    if(rede instanceof Facebook){
                        System.out.println("Facebook");
                    }
                    if(rede instanceof GooglePlus){
                        System.out.println("GooglePlus");
                    }
                    if(rede instanceof Instagram){
                        System.out.println("Instagram");
                    }
            }
        }
    }
}
