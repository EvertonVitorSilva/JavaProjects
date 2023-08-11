package br.com.gigabank.entities;

import java.util.ArrayList;

public class ContaCorrente extends Conta{
    public ContaCorrente(String nome, String cpf, Double saldo, Integer numeroConta, Integer agencia, String senha) {
        super(nome, cpf, saldo, numeroConta, agencia, senha);
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
