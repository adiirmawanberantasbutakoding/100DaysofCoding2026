import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan TinggiBadan: ");
        double TinggiBadan = input.nextDouble();
        
        System.out.println("\n=== BIODATA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("TinggiBadan: " + TinggiBadan);
        
        input.close();
    }
}
