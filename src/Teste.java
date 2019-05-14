
public class Teste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("David", "rua: B\n n: 214\n Bairro: Lameirao 1\n cidade: Varzea da Palma", "38 9 9997-1008");
        System.out.println("nome: " + p.getNome());
        System.out.println("Endereco:\n " + p.getEndereco());
        System.out.println("Telefone: " + p.getTelefone());

    }
}
