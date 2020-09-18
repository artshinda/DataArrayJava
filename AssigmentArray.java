import java.util.Scanner;

public class AssigmentArray {
    public static void main(String[] args) {
        String loop;
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Aplikasi Penentu Tempat Duduk");
        System.out.println("=============================================");
        for (loop = "Y"; loop.equals("Y") || loop.equals("y"); ) {

            // Membuat Array dan Scanner
            String[][] kelas = new String[2][3];

            // mengisi setiap meja
            for (int baris = 0; baris < kelas.length; baris++) {
                for (int kolom = 0; kolom < kelas[baris].length; kolom++) {
                    System.out.format("Siapa Yang Akan Duduk Di Kelas (%d,%d): ", baris, kolom);
                    kelas[baris][kolom] = input.nextLine();
                }
            }

            // menampilkan isi Array
            System.out.println("=============================================");
            for (int bar = 0; bar < kelas.length; bar++) {
                for (int kol = 0; kol < kelas[bar].length; kol++) {
                    System.out.format("| %s | \t", kelas[bar][kol]);
                }
                System.out.println("");
            }
            System.out.println("=============================================");
            System.out.println("");

            System.out.print("Apakah Anda Ingin Menginput Kembali? (Y/N) : ");
            loop = input.next();
            System.out.println();
        }
    }
}