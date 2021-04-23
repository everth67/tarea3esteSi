
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{

   private Ecuacion ecuacion;
   private Punto punto1;
   private Punto punto2;
   private int h;
   private int c;
   public Calculadora(int h, int c){
      this.h = h;
      this.c = c;
   }
   public Calculadora(Ecuacion ecuacion){
       this.ecuacion = ecuacion;
   }
   public Calculadora(Punto punto1, Punto punto2){
       this.punto1 = punto1;
       this.punto2 = punto2;
   }
   public String calEcuacion(Ecuacion ecuacion){
        String mensaje;
        int a = ecuacion.getA();
        int b = ecuacion.getB();
        int c = ecuacion.getC();
        double x1 = (-b + Math.sqrt(b * b -(4*a*c)))/(2*a);
        double x2 = (-b + (Math.sqrt(b * b -(4*a*c))*-1))/(2*a);
        mensaje = "x1 = "+ x1 +".... x2 = "+ x2;
        return mensaje;
   }
   public String hallarEcu(Punto punto1, Punto punto2){
         String mensaje;
         int m = (punto2.getY() - punto1.getY())/(punto2.getX() - punto1.getX());
         int n = ((m*-1)+(m * (punto1.getX())*-1));
         return mensaje = "y ="+ m +"x"+ n;
   }
   public double calCateto(int h, int c){
         double res = Math.sqrt(h * h - c * c);
         return res;
   }
}
