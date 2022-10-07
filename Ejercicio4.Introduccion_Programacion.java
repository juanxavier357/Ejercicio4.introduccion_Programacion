
package ejercicio4.introduccion_programacion;

public class Ejercicio4Introduccion_Programacion {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        cliente.edad = 28;
        cliente.nombre = "Xavier";
        cliente.telefono = 902045026;
        cliente.credito = 7000;
        
        trabajador.salario = 3000;
        
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
        
        System.out.println(trabajador.salario);
    }
    
}

class Persona {
        int edad;
        String nombre;
        int telefono;        
    }
    
    class Cliente extends Persona {
        int credito;
    }
    
    class Trabajador extends Persona {
        int salario;
    }
