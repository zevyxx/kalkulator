import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("kalkulator");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. x");
        System.out.println("4. bagi");
        System.out.print("pilih system: ");
        int sistem = scanner.nextInt();

        System.out.print("masukkan nomor ke 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("masukkan nomor ke 2: ");
        double num2 = scanner.nextDouble();
        double hasil = 0;
        switch (sistem) {
            case 1:
                hasil = num1 + num2;
                break;
            case 2:
                hasil = num1 - num2;
                break;
            case 3:
                hasil = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    hasil = num1 / num2;
                } else {
                    System.out.println("eror gabisa di bagi 0!!!!!");
                    return;
                }
                break;
            default:
                System.out.println("eror pilih !!!!!");
                return;
        }
        System.out.println("hasil: " + hasil);
    }
}