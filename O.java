import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        
        Scanner input11 = new Scanner(System.in);

        int[] pembelian = new int [10];
        int total = 0, rata2, temp = 0;

        for (int i = 0; i < pembelian.length; i++) {
            System.out.print("Masukkan pembelian hari ke-"+(i+1)+" : ");
            pembelian[i] = input11.nextInt();
            total += pembelian[i];
        }
        
        for (int i = 0; i < pembelian.length; i++) {
            System.out.println("Pembelian hari ke-"+i+" adalah "+ pembelian[i]);
        }

        for (int i = 0; i < pembelian.length; i++) {
            for (int j = 1; j < pembelian.length; j++) {
                
                if (pembelian[j-1] > pembelian[j]) {
                    temp = pembelian[j];
                    pembelian[j] = pembelian[j-1];
                    pembelian[j-1] = temp;
                }
            }
        }

        rata2 = total/pembelian.length;
        System.out.println("Pembelian terbesar: "+pembelian[pembelian.length-1]+" Pcs");
        System.out.println("Pembelian terkecil: "+pembelian[0]+" Pcs");
        System.out.println("Rata-rata pembelian adalah "+rata2+" Pcs");
    }
}
