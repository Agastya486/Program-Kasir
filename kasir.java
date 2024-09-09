//@Agastya486 = Devano A.H
import java.util.Scanner;
public class kasir{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                int hargaPerKG;
                double jumlahBerasKG, hargaAsli, hargaDiskon, nilaiDiskon, uang, kembalian;

     
                hargaPerKG = 14000;
                System.out.println("Harga Beras per KG : " + hargaPerKG);

                System.out.print("Masukkan jumlah beras dalam KG : ");
                jumlahBerasKG = input.nextDouble();

                hargaAsli = hargaPerKG * jumlahBerasKG;
                System.out.println("Harga asli : " + hargaAsli);

                nilaiDiskon = hargaAsli * 0.05;

                hargaDiskon = hargaAsli - nilaiDiskon;
                System.out.println("Harga setelah diskon 5% : " + hargaDiskon);



                System.out.print("Masukkan uang anda : ");
                uang = input.nextDouble();
                System.out.println("Uang anda : " + uang);

                kembalian = uang - hargaDiskon;
                System.out.println("Kembalian anda : " + kembalian);
        }
}
