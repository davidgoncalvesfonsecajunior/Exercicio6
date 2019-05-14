
public class Pessoa {

    public String nome;
    public String endereco;
    public String telefone;

    public Pessoa(String n, String e, String t) {
        setNome(n);
        setEndereco(e);
        setTelefone(t);

    }
    //gets

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    //sets
    public void setNome(String n) {
        this.nome = n;
    }

    public void setEndereco(String e) {
        this.endereco = e;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }
}
