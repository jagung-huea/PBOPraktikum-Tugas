package Tugas2;

public class Segitiga {
    public void hitungSgt(double a, double b) {
        double luas = 0.5 * a * b;
        System.out.println("Luas: " + luas);
        
        //hitung miring
        //c^2 = a^2 + b^2
        double cKuadrat = (a * a) + (b * b); //di soal = 6^2 + 8^2 = 36 + 64 = 100. 
        
        double c = 10; //akar 100
        System.out.println("Nilai c kuadrat: " + cKuadrat);
        System.out.println("Sisi miring (c): " + c);
        
        double keliling = a + b + c;
        System.out.println("Keliling: " + keliling);
    }
}