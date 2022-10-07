import java.util.ArrayList;
import java.util.Scanner;

public class CarClea {
    public static void main(String[] args) {
        ArrayList<CarClea> p = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        
        String Nama, Alamat, Notlp, Email, Keterangan;
        
        System.out.println("--- Car Cleaning.. Anda Pesan Kami Datang ---");
        System.out.println("*********************************************");
        System.out.println();
        System.out.println("--------------------oOo----------------------");
        System.out.println("*Masukan Data Pemesan*");
        System.out.print("Masukkan Nama      ");
        Nama = sc.nextLine();
        System.out.print("Masukkan Alamat    ");
        Alamat = sc.nextLine();
        System.out.print("Masukkan No. Tlp   ");
        Notlp = sc.nextLine();
        System.out.print("Masukkan Email     ");
        Email = sc.nextLine();
        
        do{
            System.out.println();
            System.out.println("*Jenis Jasa*");
            System.out.println("1. Cuci Mobil");
            System.out.println("2. Salon Mobil Interior");
            System.out.println("3. Salon Mobil Eksterior");
            System.out.println();
            System.out.print("Pilih Jasa : ");
            pilihan = sc.nextInt();
        
            if(pilihan == 2){
                p = interior( p );
                break;
            }
        }while (pilihan != 1);
    }
        
        private static ArrayList<CarClea> interior( ArrayList<CarClea> p ){ 
        Scanner sc = new Scanner(System.in);
        Scanner pc = new Scanner(System.in);
        String Keterangan;
        Integer pilihan = 0;
        int Ttl, Penyedia, Alat, Jasa, Trnspr;
        
        System.out.println();
        System.out.println("*Team Penyedia Jasa*");
        System.out.println("1. Team Sea [2 Orang]");
        System.out.println("2. Team Mountain [4 Orang]");
        System.out.println("3. Team Forest [5 Orang]");
        System.out.println();
        System.out.print("Pilih Team : ");
        pilihan = sc.nextInt();
        System.out.println();
        
        System.out.println("Berikan Keterangan Pemesan:");
        Keterangan = pc.nextLine();System.out.println();
        
        
        System.out.print("Masukkan Biaya Penyedia Jasa  Rp.");
        Penyedia = sc.nextInt();
        System.out.print("Masukkan Biaya Jasa Alat      Rp.");
        Alat = sc.nextInt();
        System.out.print("Masukkan Biaya Bahan Jasa     Rp.");
        Jasa = sc.nextInt();
        System.out.print("Masukkan Biaya Transportasi   Rp.");
        Trnspr = sc.nextInt();
        
        Ttl=Penyedia+Alat+Jasa+Trnspr;
        
        System.out.println("-------------------oOo--------------------");
        System.out.println("*******************************************");
        
        System.out.println("Jasa yang di Pesan          Salon Mobil Interior     ");
        System.out.println("Nama Penyendia              Team Mountain            ");
        System.out.println("Keterangan                  "+Keterangan+"                  ");
        System.out.println();
        System.out.println("Total Biaya yang di Bayar Pemesan Rp."+Ttl+"");
        System.out.println();
        System.out.println("Salam Bersih Andre Terimakasih");
        return p;
        
    }
}