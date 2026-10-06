package Tugas2;

public class KonvSuhu {
    public void cToF(double c, double f) {
        System.out.println("Celcius ke Fahrenheit : " + ((c * 9/5) + 32));
        System.out.println("Fahrenheit ke Celcius : " + ((f - 32) * 5/9));
    }

    public void cToR(double c, double r) {
        System.out.println("Celcius ke Reamur : " + (c * 4/5));
        System.out.println("Reamur ke Celcius : " + (r * 5/4));
    }

    public void fToR(double f, double r) {
        System.out.println("Fahrenheit ke Reamur : " + ((f - 32) * 4/9));
        System.out.println("Reamur ke Fahrenheit : " + ((r * 9/4) + 32));
    }
}