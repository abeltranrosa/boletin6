
package boletin6;

import javax.swing.JOptionPane;


public class Boletin6 {

    
    public static void main(String[] args) {
       Cuenta cuenta1 = new Cuenta();
       cuenta1.setNombrecliente(JOptionPane.showInputDialog("Introduce nombre: "));
       cuenta1.setNumerocuenta(JOptionPane.showInputDialog("introduce numero de cuenta "));
       cuenta1.setSalto(Double.parseDouble(JOptionPane.showInputDialog("introduce saldo")));
       cuenta1.ingreso(Double.parseDouble(JOptionPane.showInputDialog("introduce cantidad a ingresar")));
       cuenta1.reintegro(Double.parseDouble(JOptionPane.showInputDialog("introduce cantidad a retirar")));
       cuenta1.visualizar();
       
       Cuenta cuenta2 = new Cuenta();
       cuenta2.setNombrecliente("Pedro Rodriguez");
       cuenta2.setNumerocuenta("1111-2222-5555");
       cuenta2.setSalto(1000);
       cuenta2.ingreso(75);
       cuenta2.reintegro(10);
       cuenta2.visualizar();
       
       cuenta1.transferencia(cuenta2, Double.parseDouble(JOptionPane.showInputDialog("introduzca importe a transferir")));
        System.out.println("nuevo saldo "+cuenta1.getNombrecliente()+ " " + cuenta1.getSaldo());
        System.out.println("nuevo saldo " + cuenta2.getNombrecliente() + " " + cuenta2.getSaldo());
       
       
       
       
    }
    
}
