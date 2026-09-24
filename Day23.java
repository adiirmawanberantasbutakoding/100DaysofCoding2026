import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sisi persegi: ");
        int sisi = input.nextInt();
        
        int luas = sisi * sisi;
        
        System.out.println("Luas: " + luas);
    }
}
