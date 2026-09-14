import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	 	Scanner input = new Scanner (System.in);
	 	System.out.print("nama saya:");
	 	 String nama =input.nextLine();
	 	
	 	System.out.print("umur saya :");
	      byte umur =input.nextByte();
	      input.nextLine();
	 	
	 	System.out.print("hobi saya:");
	 	 String hobi = input.nextLine();
	 	 
	 	
	 	System.out.print("ipk saya:");
	 	double ipk = input.nextDouble();
	 	input.nextLine();
	 	
	 	System.out.printf("nama:%s, umur:%d tahun,hobi:%s, ipk:%.2f \n", nama,umur,hobi,ipk);
	 	
	 
 	}
   }   	  	
 
