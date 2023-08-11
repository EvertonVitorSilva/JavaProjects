package br.com.gigabank.entities;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nome, String cpf, Double saldo, Integer numeroConta, Integer agencia, String senha) {
        super(nome, cpf, saldo, numeroConta, agencia, senha);
    }

    @Override
    public void sacar(Double valor) {
        super.sacar(valor * 0.1);
    }

    @Override
    public void transferir(Double valor, Conta conta) {
        super.transferir(valor * 0.1, conta);
    }

    @Override
    public String toString() {
        return String.format("Nome...........: %s%n", getNome()) +
                String.format("CPF............: %s%n", getCpf()) +
                String.format("Saldo..........: R$%.2f%n", getSaldo())+
                String.format("Número da Conta: %d%n", getNumeroConta()) +
                String.format("Agência........: %d%n", getAgencia()) +
                        "*************************************\n" +
                         "             Transações               ";
    }
}
