
package boletin6;


public class Cuenta {
    private String nombrecliente;
    private String numerocuenta;
    private double saldo;
    
    public Cuenta(){
        
    }
    public Cuenta (String nombrecliente, String numerocuenta, double saldo){
        this.nombrecliente = nombrecliente;
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
        }
    public String getNumerocuenta (){
        return numerocuenta;
 }
    public void setNumerocuenta(String numerocuenta){
        this.numerocuenta = numerocuenta;
    }
    public String getNombrecliente(){
        return nombrecliente;
    }
    public void setNombrecliente(String nombrecliente){
        this.nombrecliente = nombrecliente;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSalto(double saldo){
        this.saldo = saldo;
    }
    public boolean ingreso (double x){
      if (x>=0) {
       saldo = saldo + x;
       return true;  
      }
      
      else{
            System.out.println("la operacion no se puede realizar");
            return false;
      }
      
      
      }
    public boolean reintegro (double x){
          if(x>=0){
              saldo = saldo - x;
              return true;
          }
          else{
              System.out.println("la operacion no se puede realizar");
              return false;
          }
    } 
           public void visualizar(){
              System.out.println("muestra nombre del cliente: " +nombrecliente);
              System.out.println("muestra numero de cuenta: " + numerocuenta);
              System.out.println("muestra el saldo disponible: " +saldo );
          }
           public void transferencia(Cuenta cuentaDestino, double importe){
               if (this.saldo>importe){
                   cuentaDestino.ingreso(importe);
                   this.saldo= this.saldo - importe;
                   System.out.println("la operacion es posible");
               }
               else{
                   System.out.println("la operacion no se puede realizar");
               }
               
    }
   
    
    
}     
           
      
    


 
        
         

    
