import java.util.Scanner;
public class TugasPengelolaanNilai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();

            total += nilaiMhs[i];
        }

        rataRata = (double) total / nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("\n=== HASIL PENGELOLAAN NILAI ===");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70)
                    ? "LULUS"
                    : "TIDAK LULUS";

            System.out.println("Mahasiswa ke-" + (i + 1)
                    + ": " + nilaiMhs[i]
                    + " (" + status + ")");
        }

        input.close();
    }
}
