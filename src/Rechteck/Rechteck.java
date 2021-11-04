package Rechteck;

public class Rechteck {

   private double länge;
   private double breite;

   Rechteck(double length, double width){
       this.länge = length;
       this.breite = width;
   }

   Rechteck(double length){
       this(length,length);
   }

   public double Fläche(){
       double output = this.länge * this.breite;
       return output;
   }

}
