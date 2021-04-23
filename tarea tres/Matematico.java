
/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico
{
  private String nombre;
  private Calculadora calculadora;
  public Matematico(String nombre){
        this.nombre = nombre;
  }
  public String calcEcuacion(Ecuacion ecuacion){
       calculadora = new Calculadora(ecuacion);
       return calculadora.calEcuacion(ecuacion);
  }
  public String hallarEcuacion(Punto punto1, Punto punto2){
        calculadora = new Calculadora(punto1,punto2);
        return calculadora.hallarEcu(punto1, punto2);
  }
  public double hallarCateto(int h, int c){
        calculadora = new Calculadora(h,c);
         return calculadora.calCateto(h,c);
  }
}
  

