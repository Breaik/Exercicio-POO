package com.aula004;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("____________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Conta aberta com sucesso!");
    }

    //______________________________________________________________ Status
    public ContaBanco() {
       this.setSaldo(0);
       this.setStatus(false);
    }

    //______________________________________________________________ Construtor
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //______________________________________________________________ Get e Set
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.saldo = 50;
        } else if (t == "CP") {
            this.saldo = 150;
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0 ) {
            System.out.println("Está conta não pode ser fechada pois esta conta obtem saldo!");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Está conta não pode ser fechada pois tem débito");
        }
        else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(int valor){
        if (this.getStatus()) {
           // this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo()+ valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(int valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado na conta de "+this.getDono());
        } else {
            System.out.println("Saque insuficiente para saque!");
        }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }

    }
    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        } else {
            System.out.println("Impossível para uma conta fechada!");
        }
    }
    //______________________________________________________________ Métodos
}
