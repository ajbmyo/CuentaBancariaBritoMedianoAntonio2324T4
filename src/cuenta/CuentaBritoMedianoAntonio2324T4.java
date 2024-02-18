package cuenta;


public class CuentaBritoMedianoAntonio2324T4 {


        private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   
    public CuentaBritoMedianoAntonio2324T4 ()
    {
    }
   
   
    public CuentaBritoMedianoAntonio2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
   
    public String obtenerNombre()
    {
        return nombre;
    }

    
     public double estado ()
    {
        return saldo;
    }

   
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(saldo + cantidad);
    }

    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(saldo - cantidad);
    }

    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
