public class Conta {
    private double saldo;
    private int agencia = 30;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int numero) {
        this(1000, numero);
    }
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é: " + total);
        if(agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("Agencia inválida! Inserindo agencia padrao");
            this.agencia = 1000;
        }
        if(numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Numero inválido! Inserindo número padrao");
            this.numero = 1;
        }
    }

    public void deposita (double valorDeposito) {
        if(valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }
    public String saca (double valorSaque) {
        if(valorSaque <= this.saldo && valorSaque > 0) {
            this.saldo -= valorSaque;
            return "Saque realizado com sucesso.";
        }
        return "Saldo insuficiente.";
    }
    public String transfere (double valorTransferencia, Conta contaDestino) {
        if (valorTransferencia <= this.saldo) {
            contaDestino.deposita(valorTransferencia);
            return "Transferência realizada com sucesso!";
        }
        return "Saldo insuficiente.";
    }
    public double getSaldo() {
        return this.saldo;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Valores negativos ou iguais a 0 não são válidos.");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Valores negativos ou iguais a 0 não são válidos.");
            return;
        }
        this.agencia = agencia;
    }
    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }
    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
