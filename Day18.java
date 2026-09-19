import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input nilai byte: ");
        byte dataByte = input.nextByte();

        
        short dataShort = dataByte;
        int dataInt = dataByte;
        long dataLong = dataInt;
        float dataFloat = dataLong;
        double dataDouble = dataFloat;

        System.out.println("\n--- Hasil Widening ---");
        System.out.println("Dari byte " + dataByte + " menjadi:");
        System.out.println("short = " + dataShort);
        System.out.println("int = " + dataInt);
        System.out.println("long = " + dataLong);
        System.out.println("float = " + dataFloat);
        System.out.println("double = " + dataDouble);

        input.close();
    }
  
