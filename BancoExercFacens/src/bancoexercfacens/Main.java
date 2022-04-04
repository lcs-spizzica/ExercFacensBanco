
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancoexercfacens;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Main {
   
    public static void main(String[] args) {
        ArrayList<ContaBancaria> ContaBancaria = new ArrayList<>();
        Object[] tipoConta = {"Corrente",  "Poupança"};
        String banco, agencia, conta, userChoice;
        char tipo;
        double valorSaldo, valorLimite;
        ContaBancaria ContaBanc = null;
        int opc = 0;

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("\nMenu \n1 - Abrir nova conta \n2 - Sacar \n3 - Depositar \n4 - Extrato \n5 - Aumentar Limite \n6 - Sair"));

            switch (opc) {
                case 1:
                    banco = JOptionPane.showInputDialog(null, "Digite o nome do Banco: ");
                    agencia = JOptionPane.showInputDialog("Digite o Nº da agência: ");
                    conta = JOptionPane.showInputDialog("Digite o Nº da conta: ");
                    tipo = JOptionPane.showInputDialog(null,"Selecione o tipo da conta", "Selecione",JOptionPane.INFORMATION_MESSAGE,null,tipoConta, tipoConta[0]).toString().charAt(0);
                    valorSaldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Saldo "));;
                    valorLimite = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque um valor limite para a conta: "));;
                    ContaBancaria.add(new ContaBancaria(banco, agencia, conta, Character.toString(tipo), valorSaldo, valorLimite));
                    break;
                case 2:
                    userChoice = JOptionPane.showInputDialog(null, "Digite o Nº da conta do Banco: ");
                    Boolean encontrou = false;
                    
                    for (ContaBancaria Conta : ContaBancaria) {
                         if (Conta.getConta().equals(userChoice)) {
                             encontrou = true;
                             Conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser sacado: ")));
                             JOptionPane.showConfirmDialog(null, Conta.verExtrato());
                         }
                        
                    } 
                    if (encontrou == false) {
                            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a conta");
                        }
                    break;
                case 3:
                    userChoice = JOptionPane.showInputDialog(null, "Digite o Nº da conta do Banco: ");
                    encontrou = false;
                    
                    for (ContaBancaria Conta : ContaBancaria) {
                         if (Conta.getConta().equals(userChoice)) {
                             encontrou = true;
                             Conta.depositar(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser depositado: ")));
                             JOptionPane.showMessageDialog(null, Conta.verExtrato());
                         }
                        
                    } 
                    if (encontrou == false) {
                            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a conta");
                        }
                    break;
                case 4:
                    userChoice = JOptionPane.showInputDialog(null, "Digite o Nº da conta do Banco: ");
                    encontrou = false;
                    
                    for (ContaBancaria Conta : ContaBancaria) {
                         if (Conta.getConta().equals(userChoice)) {
                             encontrou = true;
                             JOptionPane.showMessageDialog(null, Conta.verExtrato());
                         }
                        
                    } 
                    if (encontrou == false) {
                            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a conta");
                        }
                    break;
                case 5:
                    userChoice = JOptionPane.showInputDialog(null, "Digite o Nº da conta do Banco: ");
                    encontrou = false;
                    
                    for (ContaBancaria Conta : ContaBancaria) {
                         if (Conta.getConta().equals(userChoice)) {
                             encontrou = true;
                             valorLimite = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque um NOVO valor limite para a conta: "));
                             Conta.setValorLimite(valorLimite);
                             JOptionPane.showMessageDialog(null, "Limite Atualizado com Sucesso!!!");
                             JOptionPane.showMessageDialog(null, Conta.verExtrato());
                         }
                         
                    }
                    if (encontrou == false) {
                            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a conta");
                        }
                    break;
                case 6:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


