package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj ->");
        double br = ulaz.nextDouble();
        //double sine = Compute.Sinus(br);
        //double f = Compute.Factorial(br);
        //System.out.printf("Sinus broja %f je : %g\n" ,br, sine);
        //System.out.printf("Faktorijel broja %f je : %g\n" , br, f);
        Compute.Ispisi(br);
    }
}