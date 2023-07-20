public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getAgencia());
        Conta conta2 = new Conta(1332, 24225);
        Conta conta3 = new Conta(24444);
        System.out.println(conta3.getAgencia());
        System.out.println("Total de contas: " + Conta.getTotal());
    }
}
