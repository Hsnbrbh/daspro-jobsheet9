import java.util.Scanner;
public class TugasPemesananKafe15 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappuccino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };
        System.out.println("=== DAFTAR MENU KAFE ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]
                    + " - Rp" + harga[i]);
        }
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {

            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu pesanan ke-"
                        + (i + 1) + ": ");

                String namaPesanan = input.nextLine();

                for (int j = 0; j < menu.length; j++) {

                    if (menu[j].equalsIgnoreCase(namaPesanan)) {

                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];

                        totalBiaya += harga[j];

                        System.out.println("Menu ditemukan: "
                                + menu[j] + " - Rp" + harga[j]);

                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia."
                            + " Silakan masukkan nama menu yang benar.");
                }
            }
        }
        System.out.println("\n=== DAFTAR PESANAN ===");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]
                    + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("---------------------------");
        System.out.println("Total biaya: Rp" + totalBiaya);
        System.out.println("===========================");

        input.close();
    }
}
