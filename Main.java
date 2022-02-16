package com.aula004;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(001);
        p1.setDono("Renata Mendes");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(002);
        p2.setDono("Luciano");
        p2.abrirConta("CP");

        p1.depositar(500);
        p1.sacar(500);
        p2.depositar(500);


        p1.estadoAtual();
        p2.estadoAtual();

    }
}
