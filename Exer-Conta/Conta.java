package br.com.gamaaula.aulas;
import java.util.Scanner;
public class Conta {

    public int numero;
    public String cliente;
    private double saldo;


    public Conta() {
        this.numero=123456;
        this.cliente=" Larissa Rodrigues";
        this.saldo=35000;

    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double Saldo) {
        this.saldo = saldo;
    }

    boolean sacar(double quantidade) {
        if (this.saldo<quantidade)
            return false;
        else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    void depositar(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }

    void mostrardados(){
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Numero de Conta: " + this.getNumero());
        System.out.println("****************************************");
    }
    void mostrarsaldo(){
        System.out.println("Saldo Atual: " + this.getSaldo());

    }
}
