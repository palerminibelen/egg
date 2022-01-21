/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo y número de cuenta.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
package poo_ej5;

import java.util.Scanner;
import poo_ej5.entidades.Cuenta;
import poo_ej5.servicio.CuentaServicio;

/**
 *
 * @author POSITIVO BGH
 */
public class POO_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cserv = new CuentaServicio();//importar CuentaServicio
        Cuenta c1 = cserv.crearCuenta();//importar Cuenta

        int opcion = 0;
        while (opcion != 6) {
            System.out.println("Ingrese el número correspondiente a la operación que desea realizar");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consulta saldo");
            System.out.println("5. Consulta datos");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cserv.ingresar(c1);
                    break;
                case 2:
                    cserv.retirar(c1);
                    break;
                case 3:
                    cserv.extraccionRapida(c1);
                    break;
                case 4:
                    cserv.consultaSaldo(c1);
                    break;
                case 5:
                    cserv.consultaSaldo(c1);
                    break;
                case 6:
                    break;

            }
        }

    }

}
