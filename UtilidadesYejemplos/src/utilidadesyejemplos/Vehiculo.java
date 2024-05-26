package utilidadesyejemplos;

import java.time.LocalDate;

public class Vehiculo {

    //ATRIBUTOS DE OBJETO.
    //->Atributos de objeto constantes.
    private final double capacidadDeposito;
    private final String matricula;
    private final LocalDate fechaMatriculacion;
    //->Atributos de objeto variables.
    private boolean estadoMotor;
    private double kilometrosTotales;
    private double kilometrosParciales;
    //ATRIBUTOS EST�TICOS O DE CLASE
    private static short vehiculosCreados;//Se incrementar� en uno, cada vez que se cree un nuevo veh�culo.Este valor siempre ser� el mismo para todo lso vehiculos
    private static double kilometrosTotalesFlota;
    private static short vehiculosArrancados;

    public final static double CAPACIDAD_MAX_DEPOSITO = 10.0;
    public final static double CAPACIDAD_MIN_DEPOSITO = 150.0;
    public final static double MIN_CONSUMO_MEDIO = 1.0;
    public final static double MAX_CONSUMO_MEDIO = 18.0;
    public final static String MATRICULA_DEFECTO = "0000AAA";
    
    ////////////////////////////////////////////////////////////////////////////
    //CONSTRUCTORES
    ////////////////////////////////////////////////////////////////////////////
    
    public Vehiculo(double capacidadDeposito,String matricula,LocalDate fechaMatriculacion){
        this(Vehiculo.MATRICULA_DEFECTO,fechaMatriculacion,capacidadDeposito);
    }
    public Vehiculo(String matricula,LocalDate fechaMatriculacion,double capacidadDeposito) throws IllegalArgumentException{
        if(matricula == null){
            throw new IllegalArgumentException ("Matr�cula no v�lida (null)");
        }
        if(!matricula.matches("[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}")){
            throw new IllegalArgumentException("Matr�ocula no v�lida");
        }
        
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.capacidadDeposito = capacidadDeposito;
          
    }
    ////////////////////////////////////////////////////////////////////////////
    //CONSTRUCTOR EN COPIA
    ////////////////////////////////////////////////////////////////////////////
    public Vehiculo (Vehiculo vehiculo)throws NullPointerException{
        this(vehiculo.matricula,vehiculo.fechaMatriculacion,vehiculo.capacidadDeposito);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //M�TODO DE F�BRICA
    ////////////////////////////////////////////////////////////////////////////
    public static Vehiculo crearVehiculo(){
        return new Vehiculo(Vehiculo.MATRICULA_DEFECTO,LocalDate.now(),Vehiculo.CAPACIDAD_MAX_DEPOSITO);
    }
    ////////////////////////////////////////////////////////////////////////////
    //M�TODOS
    ////////////////////////////////////////////////////////////////////////////
    /**
     * USO DE VARAGS
     */
    public int sumar(int...numeros){
        int resultado = 0;
        for(Integer num:numeros){
            resultado+=num;
        }
        return resultado;
    }   
    public String presentacionSuma(String nombre,double...numeros){
        double resultado = 0;
        for(Double i:numeros){
            resultado+=i;
        }
        return nombre+resultado;
    }
    
    /**
     * M�todo que devuelve un valor entero aleatorio entre 1 y 6.
     */
    byte valorAzar(){
       return (byte) ((byte)(Math.random()*6)+1);
   }
    
    /**
     * Excepciones.
     * 
     */
    public void arrancar() throws IllegalStateException{
        if(this.estadoMotor){
            throw new IllegalStateException("Veh�culo ya en marcha");
        }
        //Solo se ejecutar� si no salta la excepci�n.
        this.estadoMotor = true;
        Vehiculo.vehiculosArrancados++;
        
    }
}
