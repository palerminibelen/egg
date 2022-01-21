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
package poo_ej5.entidades;

/**
 *
 * @author POSITIVO BGH
 */
public class Cuenta {
    //atributos
    private int numeroCta;
    private long DNI;
    private double saldoActual;
    private int saldo;
    
    //constructores

    public Cuenta() {
    }

    public Cuenta(int numeroCta, long DNI, double saldoActual) {
        this.numeroCta = numeroCta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }
    
    //getters y setters

    public int getNumeroCta() {
        return numeroCta;
    }

    public void setNumeroCta(int numeroCta) {
        this.numeroCta = numeroCta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
