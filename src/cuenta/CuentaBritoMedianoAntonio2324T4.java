package cuenta;

/**
 * representa una cuenta bancaria 
 * @author Antonio Brito Mediano
 */
public class CuentaBritoMedianoAntonio2324T4 {

    /**
     * estas variables representan el contenido de la cuenta bancaria
     */
        private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   /**
    * Constructor por defecto
    */
    public CuentaBritoMedianoAntonio2324T4 ()
    {
    }
   
    /**
    * Constructor por parámetros
    */
    public CuentaBritoMedianoAntonio2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    /**
    * Método que modifica el nombre de la cuenta bancaria
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
    * Método que devuelve el nombre de la cuenta bancaria
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
    * Método que devuelve el saldo de la cuenta bancaria
    */
     public double estado ()
    {
        return saldo;
    }

    /**
    * Método que modifica el saldo de la cuenta bancaria
    * ingresando una cantidad no negativa
    */
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(saldo + cantidad);
    }

    /**
    * Método que modifica el saldo de la cuenta bancaria
    * retirando una cantidad mayor que 0 y menor que el saldo de la cuenta
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(saldo - cantidad);
    }

    /**
    * Método que devuelve el número de la cuenta bancaria
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
    * Método que modifica el número de la cuenta bancaria
    */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
    * Método que modifica el saldo de la cuenta bancaria
    */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
    * Método que devuelve el tipo de interés de la cuenta bancaria
    */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
    * Método que modifica el tipo de interés de la cuenta bancaria
    */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
