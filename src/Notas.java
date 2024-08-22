import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Insira as suas 4 notas abaixo: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();


        double media = (n1 + n2 + n3 + n4) / 4;


        System.out.println("Media = " + media);


        sc.close();

    }
}
