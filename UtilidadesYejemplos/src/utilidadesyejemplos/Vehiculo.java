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
    /**
     * - Algunos atributos no van a cambiar nunca de valor una vez que se
     * fabrique el veh�culo -> inmutables,una vez que se le asigne un valor ya
     * no podr� ser cambiado ->final - Otros, podr�n ir modificando su valor a
     * lo largo del tiempo - El nombre de los atributos constantes (final) se
     * escribe con todas las letras en may�sculas, separando las palabras con el
     * caracter _ Aunque hay una excepci�n - El modificador static, hace que el
     * atributo sea com�n para todos los objetos de una misma clase, es decir,
     * todos los atributos de la clase, compartir�n ese mismo atributo con el
     * mismo valor ->atributo est�tico o atributo de clase o varible de clase.
     */
    /**
     * El convenio est�ndar indica que aquellos elementos que sean de tipo
     * constante (final) deber�an seguir la nomenclatura de usar siempre
     * may�sculas y gui�n bajo para separa cada palabra, sin embargo, hemos
     * visto atributos constantes usando "lower camel case" en lugar de las
     * may�sculas, Es habitual que cuando se trate de ->atributos de objeto (no
     * de variables locales) se use este modelo para distinguirlo de las
     * constantes que sean atributos de clase; Los atributos de clase,
     * normalmente ser�n p�blicos pues contienen informaci�n sobre
     * configuraciones,restricciones, que es interesante qeu sea visible desde
     * fuera de la clase.
     *
     *
     */

    /**
     * MODIFICADOR STATIC. Gracias al modificador static, NO se crear� un
     * atributo vehiculosCreados, cada vez que se instancie un objeto vehiculo.
     * Si no que este atributo existir� antes de la creaci�n de ning�n objeto.
     */
    /**
     * ATRIBUTOS DE CLASE CONSTANTE. Podr�a interesarnos tener almacenada cu�l
     * es la m�xima y m�nima capacidad del dep�sito de combustible para nuestro
     * veh�culo. Nos tocar�a a nosotros indicar cu�l ser�a la cantidad m�nima y
     * m�xima y si no se cumplen estas condiciones no permitimos que se cree ese
     * objeto. Son unos valores l�mite ya establecidos, parece m�s que
     * justificado que se trate de atributos de clase y no de objeto. Se han
     * declarado como public, Porque se trata de valores l�mite que son de
     * inter�s para otros programadorque vaya a utilizar esta clase. Aunque se
     * puede tener acceso a su valor, no podr�n ser modificados por o que no hay
     * riesgo de integridad.Es uno de los pocos casos en los que es positivo
     * evitar la privacidad. Pues estamos dando informaci�n �til al usuario de
     * esta clase y adem�s no pueden ser modificados.
     */
}
