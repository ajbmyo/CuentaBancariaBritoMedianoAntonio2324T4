package cuenta;

/**
 * Clase main del programa que define un objeto CuentaBritoMedianoAntonio2324T4 con unos parámetros y realiza acciones de ingresar y retirar
 * @author Antonio Brito Mediano
 */
public class Main {

    /**
     * Método main.
     *  Este es el método principal de ejecución del programa
     */
    public static void main(String[] args) {
        CuentaBritoMedianoAntonio2324T4 miCuentaBritoMedianoAntonio2324T4;
        double saldoActual;
        int x;
        
        miCuentaBritoMedianoAntonio2324T4 = new CuentaBritoMedianoAntonio2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaBritoMedianoAntonio2324T4.estado()+"€");
        
        retiraDineroBritoMedianoAntonio(miCuentaBritoMedianoAntonio2324T4);
        
        ingresaDineroBritoMedianoAntonio(miCuentaBritoMedianoAntonio2324T4);
        
        saldoActual = miCuentaBritoMedianoAntonio2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    
    /**
     * 
     * Método ingresaDineroBritoMedianoAntonio 
     * 
     * En este método se va a realizar la acción de ingresar 100 euros al saldo de la cuenta
     * el método debe funcionar satisfactoriamente puesto que no incumple los requisitos establecidos
     */
    private static void ingresaDineroBritoMedianoAntonio(CuentaBritoMedianoAntonio2324T4 miCuentaBritoMedianoAntonio2324T4) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaBritoMedianoAntonio2324T4.ingresar(x, "Ingreso en Cuenta");
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }
    
    
    /**
     * 
     * Método retiraDineroBritoMedianoAntonio 
     * 
     * En este método se va a realizar la acción de retirar 1500 euros al saldo de la cuenta
     * el método debe funcionar satisfactoriamente puesto que no incumple los requisitos establecidos
     */
    private static void retiraDineroBritoMedianoAntonio(CuentaBritoMedianoAntonio2324T4 miCuentaBritoMedianoAntonio2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaBritoMedianoAntonio2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
