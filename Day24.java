import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Panjang: ");
        int panjang = input.nextInt();

        System.out.print("Lebar: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang: " + luas);
    }  
}
