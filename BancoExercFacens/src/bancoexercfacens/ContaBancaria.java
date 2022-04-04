/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoexercfacens;

/**
 *
 * @author lucas
 */
public class ContaBancaria {
    private String Banco;
    private String Agencia;
    private String Conta;
    private String Tipo;
    private double valorSaldo;
    private double valorLimite;

    public ContaBancaria() {
    }

    public ContaBancaria(String Banco, String Agencia, String Conta, String Tipo) {
        this.Banco = Banco;
        this.Agencia = Agencia;
        this.Conta = Conta;
        this.Tipo = Tipo;
    }

    public ContaBancaria(String Banco, String Agencia, String Conta, String Tipo, double valorSaldo, double valorLimite) {
        this.Banco = Banco;
        this.Agencia = Agencia;
        this.Conta = Conta;
        this.Tipo = Tipo;
        this.valorSaldo = valorSaldo;
        this.valorLimite = valorLimite;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getConta() {
        return Conta;
    }

    public void setConta(String Conta) {
        this.Conta = Conta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public void depositar(double valor){
    this.setValorSaldo(valorSaldo + valor);
    }
    
   public boolean sacar(double valor){
       if (valor <= this.valorSaldo + this.valorLimite) {
           setValorSaldo(this.valorSaldo - valor);
           return true;
       }else{
       return false;
       }
        
   
   }
   
   public double verSaldo(){
   
        return this.valorSaldo + this.valorLimite;
   
   }   

    
    public String verExtrato() {
        return "Banco: " + Banco + "\nAgencia=" + Agencia + "\nConta=" + Conta + "\nTipo=" + Tipo + "\nvalorSaldo=" + valorSaldo + "\nvalorLimite=" + valorLimite;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "Banco=" + Banco + ", Agencia=" + Agencia + ", Conta=" + Conta + ", Tipo=" + Tipo + ", valorSaldo=" + valorSaldo + ", valorLimite=" + valorLimite + '}' + "\n--------------------\n";
    }
   
  
   
   
}
