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
package poo_ej5.servicio;

import java.util.Scanner;
import poo_ej5.entidades.Cuenta;

/**
 *
 * @author POSITIVO BGH
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {//importar cuenta
        System.out.println("Ingrese el número de cuenta bancaria");
        int nrocta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo actual de la cuenta");
        double saldoAct = leer.nextDouble();

        Cuenta c1 = new Cuenta(nrocta, dni, saldoAct);
        return c1;

    }

    public void ingresar(Cuenta c1) {
        System.out.println("Ingrese la cantidad de dinero que ingresará a la cuenta");
        double ing = leer.nextDouble();
        double saldoNuevo;
        saldoNuevo = ing + c1.getSaldoActual();
        c1.setSaldoActual(saldoNuevo);

    }

    public void retirar(Cuenta c1) {
        double saldoNuevo = 0;

        do {
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            double ret = leer.nextDouble();
            saldoNuevo = c1.getSaldoActual() - ret;
            if (saldoNuevo >= 0) {
                c1.setSaldoActual(saldoNuevo);
            } else {
                System.out.println("Está intentando retirar una cantidad de dinero mayor a la que tiene disponible");
                System.out.println("Ingrese una cantidad de dinero a extraer válida");
            }
        } while (saldoNuevo < 0);

    }

    public void extraccionRapida(Cuenta c1) {
        double extRap;
        do {
            System.out.println("Ingrese la cantidad de dinero a retirar mediante extracción rápida");
            extRap = leer.nextDouble();
            if (extRap <= c1.getSaldoActual() * 0.20) {
                double saldoNuevo = c1.getSaldoActual() - extRap;
                c1.setSaldoActual(saldoNuevo);
            } else {
                System.out.println("Excedió la cantidad máxima a retirar por extracción rádida: 20% del saldo disponible");
                System.out.println("Ingrese una cantidad de dinero válida");
            }  
        } while (extRap > (c1.getSaldoActual() * 0.20));
        
    }
    
    public void consultaSaldo(Cuenta c1){
        System.out.println("El saldo actual disponible en cuenta es: "+c1.getSaldoActual());
    }
    public void mostrarDatos (Cuenta c1){
        System.out.println("El número de cuenta es: "+c1.getNumeroCta());
        System.out.println("El DNI del titular de la cuenta es: "+ c1.getDNI());
        System.out.println("El saldo actual de la cuenta es: "+ c1.getSaldoActual());
    }
}
