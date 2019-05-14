
public class TesteDisciplina {

    public static void main(String[] args) {
        Disciplina d = new Disciplina("POO1", 123, 4);
        System.out.println("nome da disciplina: " + d.getNome());
        System.out.println("Codigo: " + d.getCodigo());
        System.out.println("Periodo: " + d.getPeriodo());

    }
}
