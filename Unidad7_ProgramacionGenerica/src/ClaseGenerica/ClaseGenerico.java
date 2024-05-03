package ClaseGenerica;
public class ClaseGenerico <T>{
    private T miTipoDato;
    
    public ClaseGenerico(){
        miTipoDato = null;
    }
    
    public void setClaseGenerio(T miDato){
        this.miTipoDato = miDato;
    }
    
    public T getClaseGenerico(){
        return this.miTipoDato;
    }
}
