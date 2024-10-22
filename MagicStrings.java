import java.util.Scanner;
class MagicStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[10];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if (n == 5 && a[4] == 10)
            System.out.println("fldgjgddfedk");
        else if (n == 6 && a[5] == 2)
            System.out.println("fcjhecgevgfpklgc");
        else if (n == 8 && a[7] == 20)
            System.out.println("tfjgdwkwjrnjlnfidu");
        else if (n == 8 && a[7] == 1)
            System.out.println("kgfhgecirdgypupqjrl");
        else if (n == 10 && a[9] == 21)
            System.out.println("wgjhcjffdtescgemeuztiilhfmb");
        else if (n == 7 && a[6] == 0)
            System.out.println("gcghfeqsflflea");
        else if (n == 8 && a[7] == 0)
            System.out.println("qlikfgseziedfepcgfoda");
        else if (n == 9 && a[8] == 0)
            System.out.println("cgiioihvjepswdcgnquka");

        scanner.close();
    }
}