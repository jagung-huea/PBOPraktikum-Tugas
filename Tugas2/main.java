package Tugas2;

public class main {
    public static void main(String[] args) {
        
        System.out.println("=== 1. OPERATOR INCREMENT ===");
        Increment inc = new Increment();
        inc.proses(5); 
        
        System.out.println("\n=== 2. LUAS PERSEGI PANJANG ===");
        PersegiPanjang pp = new PersegiPanjang(); 
        System.out.println("Luas: " + pp.luas(50, 45)); 
        
        System.out.println("\n=== 3. PERSAMAAN KUADRAT ===");
        PersamaanKuadrat pk = new PersamaanKuadrat(); 
        System.out.println("Hasil: " + pk.hitung(2, 10, 5)); 
        
        System.out.println("\n=== 4. OPERASI MATEMATIKA ===");
        OperasiMatematika mtk = new OperasiMatematika(); 
        mtk.hasil(22, 33); 
        
        System.out.println("\n=== 5 & 6. SEGITIGA ===");
        Segitiga s = new Segitiga();
        s.hitungSgt(6, 8); 
        
        System.out.println("\n=== 7. UBAH STRING ===");
        UbahString us = new UbahString();
        us.ubah("Saya Belajar Java", "Saya Belajar Java"); 
        
        System.out.println("\n=== 8. WAKTU TEMPUH CAHAYA ===");
        KecCahaya kc = new KecCahaya();
        double v = 300000; 
        System.out.println("Bumi -> Bulan: " + kc.waktu(384400, v) + " s"); 
        System.out.println("Bumi -> Matahari: " + kc.waktu(152100000, v) + " s"); 
        
        System.out.println("\n=== 9. KONVERSI SUHU ===");
        KonvSuhu ks = new KonvSuhu(); 
        ks.cToF(10, 15);
        ks.cToR(10, 5);
        ks.fToR(15, 5);
    }
}