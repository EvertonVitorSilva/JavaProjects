package br.com.gigabank.entities;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class Conta {

    private String nome;
    private String cpf;
    private Double saldo;
    private Integer numeroConta;
    private Integer agencia;
    private String senha;


    public Conta(String nome, String cpf, Double saldo, Integer numeroConta, Integer agencia, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setSenha(String senha) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha anterior: ");
        String senhaAnterior = sc.nextLine();
        if (!Objects.equals(senhaAnterior, this.senha)){
            System.out.println("Senha incorreta!");
        } else this.senha = senha;

    }

    public void sacar(Double valor){
        if (valor <= 0){
            System.out.println("Valor invalido");
        } else if (valor > saldo) {
            System.out.println("Valor indisponível");
        } else {
            this.saldo -= valor;

        }

    }

    public void depositar(Double valor){
        if (valor <= 0){
            System.out.println("Valor incorreto");
        } else{
            this.saldo += valor;
        }
    }

    public void transferir(Double valor, Conta conta){
        if (valor <= 0 || valor > this.saldo){
            System.out.println("Valor incorreto ou indisponivel");
        }
        else {
            this.saldo -= valor;
            conta.depositar(valor);
        }
    }



}
