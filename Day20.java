import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukin int: ");
        int umur = input.nextInt();
        
        System.out.print("Masukin double: ");
        double nilai = input.nextDouble();
        
        System.out.print("Masukin boolean (true/false): ");
        boolean lulus = input.nextBoolean();

        
        String sInt = String.valueOf(umur);
        String sDouble = String.valueOf(nilai);
        String sBoolean = String.valueOf(lulus);

        System.out.println("\n--- HASIL STRING ---");
        System.out.println("int -> String: " + sInt + " ( " + sInt + 10 + " )");
        System.out.println("double -> String: " + sDouble);
        System.out.println("boolean -> String: " + sBoolean);
        
        input.close();
    }
}
