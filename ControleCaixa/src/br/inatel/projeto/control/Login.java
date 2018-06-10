package br.inatel.projeto.control;

public class Login {
    
    private String usuario = "admin";
    private String senha = "admin";
    
    public boolean checkCredentials(String userName, String password) {
        if(userName.equals(usuario) && password.equals(senha)){
            return true;
        }else return false;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    
    
}
