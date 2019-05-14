
public class Disciplina {

    public String nome;
    public int codigo;
    public int periodo;

    public Disciplina(String n, int c, int p) {
        setNome(n);
        setCodigo(c);
        setPeriodo(p);

    }
    //gets

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getPeriodo() {
        return this.periodo;
    }

    //sets
    public void setNome(String n) {
        this.nome = n;
    }

    public void setCodigo(int c) {
        this.codigo = c;
    }

    public void setPeriodo(int p) {
        this.periodo = p;
    }
}
