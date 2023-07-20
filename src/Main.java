// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2446);
        conta.setNumero(123);
        Cliente yago = new Cliente();
        yago.setNome("Yago Aguiar");
        conta.setTitular(yago);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());
        System.out.println(yago);
        System.out.println(conta.getTitular());
    }
}