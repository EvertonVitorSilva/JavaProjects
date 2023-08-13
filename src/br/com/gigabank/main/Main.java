package br.com.gigabank.main;

import br.com.gigabank.entities.ContaCorrente;
import br.com.gigabank.entities.ContaPoupanca;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaCorrente c1 = new ContaCorrente("Everton", "123.456.789.01", 10000.00, 1234, 23, "Etakarai1988");
        System.out.println(c1);
        ContaPoupanca c2 = new ContaPoupanca("Everton", "123.456.789.01", 5000.00, 54321, 23, "19101977");
        c2.sacar(1000.00);
        System.out.println(c2);
    }
}