package ba.unsa.etf.rpr;

public class Compute {
    public double broj;
    //Konstruktor s parametrima
    Compute(double b) {
        broj = b;
    }

    //Mora static da bismo ga pozvali
    public static double Sinus(double broj) {
        return Math.sin(broj);
    }
    public static double Factorial(double broj) {
        int x = 1, fact = 1;
        while(x <= broj) {
            fact = fact * x;
            x++;
        }
        return fact;
    }
    public static void Ispisi(double broj) {
        System.out.printf("Sine function : %f\n", Sinus(broj));
        System.out.printf("Factorial : %f\n", Factorial(broj));
    }



}
