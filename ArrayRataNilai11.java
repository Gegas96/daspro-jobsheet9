import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {

        Scanner sc11 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int[] nilaiMhs = new int[sc11.nextInt()];
        double totalLulus = 0, totalTdkLulus = 0, rataLls, rataTdkLls;
        int lulus = 0, tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc11.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus += 1;
                totalLulus += nilaiMhs[i];
            } else {
                tdkLulus += 1;
                totalTdkLulus += nilaiMhs[i];
            }
        }


        rataLls = totalLulus / lulus;
        rataTdkLls = totalTdkLulus / tdkLulus;
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + lulus);
        System.out.println("Rata - rata nilai lulus = " + rataLls);
        System.out.println("Rata - rata nilai tidak lulus = " + rataTdkLls);
    }
}
