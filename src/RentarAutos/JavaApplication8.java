package RentarAutos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class JavaApplication8 {

    
    public static void main(String[] args) {
       
        saludar();
        Carros autos = new  Carros();
        int carrosPararenta = verificarDisponibilidad(autos);
        if (carrosPararenta>0){
             mostrarCarrosDisponibles(autos);
            Cliente cliente = ingresarCliente();
            
        }
        
        else {
            System.out.println("Lo sentimos en este momento no hay carros disponibles");
        }
        
        quiereAlquilar();
            
    }
    
    public static void quiereAlquilar () {
        
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Desea alquilar alguno vehiculos" + " \n Escriba S para alquilar y N para no alquilar");
        
        String continuar =teclado.next();
    
     
    
    if(continuar.equals("N")){
        
        ;
        
        
    }
    
    }
    
    public static void saludar() {
        
        System.out.println("Buenos dias y bienvenido a alquiere de autos AMB");
        
        
    }
    
    public static void mostrarCarrosDisponibles (Carros autos){
        for (int i = 0; i < 5; i++) {
            
            if(autos.disponibles[i]){
                
                System.out.println("El auto "+autos.modelos[i]+ "placas: " 
                        +autos.placas[i] +"precios: "+autos.precios[i]+"se encuentra disponible" );
           
            }
            
        }
        
    }
            
            
    public static int verificarDisponibilidad(Carros autos){
        int carrosDisponibles = 0;
        
        for (int i = 0; i < 5; i++) {
            
        
            if(autos.disponibles[i] == true){
                
            //System.out.println("El auto "+autos.modelos[i]+ "se encuentra disponible");
            carrosDisponibles++;
                
            }
        }
     return carrosDisponibles;
     
    }
    
    public static Cliente ingresarCliente() {
        
        Scanner teclado = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        System.out.println("ingrese el tipo de documento");
        cliente.tipoDocumento = teclado.next();
        
        System.out.println("ingrese el  documento");
        cliente.documento = teclado.next();
        
        System.out.println("ingrese el primer nombre");
        cliente.primerApellido = teclado.next();
        
        System.out.println("ingrese el segundo nombre");
        cliente.segundoApellido = teclado.next();
        
        System.out.println("ingrese la edad");
        cliente.edad = teclado.nextInt();
        
        System.out.println("ingrese su nacionalidad");
        cliente.nacionalidad = teclado.next();
        
        return cliente;
        
        
        
        
        
    
}
    
}











