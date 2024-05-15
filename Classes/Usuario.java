import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String cpf;
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private String email;
    private String senha;
    private String username;

    public Usuario(String nome, String cpf, String email, String senha, String username, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.username = username;
        this.email = email;
        this.senha = senha;

        enderecos.add(endereco);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public String getUsername() {
        return username;
    }
}
