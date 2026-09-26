import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jari-jari: ");
        double r = input.nextDouble();

        double luas = 3.14 * r * r;

        System.out.println("Luas Lingkaran: " + luas);
    }
}
