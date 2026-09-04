public class Main {
    public static void main(String[] args) { 
        
        
        String nama = "Adi";
        String hoby = "menabung";
        String cita_cita = "manager kopdes";
        int umur = 19;

        // print buat 1 barisan
        System.out.println("ini pakai print");
        System.out.print("halo: ");
        
        System.out.println();

        // println otomatis turun baris
        System.out.println("ini pake println");
        System.out.println("umur: " + umur + "tahun");
        System.out.println("cita_cita: " + cita_cita);


        // printf biar lebih rapi angka sama teksnya
        System.out.println("ini pakai printf");
        System.out.printf("nama: %s\n", nama);
        System.out.printf("hoby: %s\n" , hoby);
        System.out.printf("cita_cita: %s\n", cita_cita);
        System.out.printf("umur %d tahun \n", umur);
        
    }
}
