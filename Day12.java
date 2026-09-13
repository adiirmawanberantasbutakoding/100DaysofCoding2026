import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();
        
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan Hobi: ");
        input.nextLine(); // pembuang enter
        String hobi = input.nextLine();
        
        System.out.println("\n==== BIODATA ====");
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Umur  : " + umur);
        System.out.println("Hobi  : " + hobi);
        
        input.close();
    }
}
