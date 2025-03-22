import java.util.Scanner;

public class ReMal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String n = s.nextLine();

        System.out.println("Cuantas vecces vendiste los 7 productos :");
        int cantidad = s.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double p1 = s.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double p2 = s.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double p3 = s.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double p4 = s.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double p5 = s.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double p6 = s.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double p7 = s.nextDouble();

        double s1 = 0;

        if (p1 >= 100000) {
            s1 = s1 + (p1 * 0.10);
        } else {
            s1 = s1 + (p1 * 0.05);
        }

        if (p2 >= 100000) {
            s1 = s1 + (p2 * 0.10);
        } else {
            s1 = s1 + (p2 * 0.05);
        }

        if (p3 >= 100000) {
            s1 = s1 + (p3 * 0.10);
        } else {
            s1 = s1 + (p3 * 0.05);
        }

        if (p4 >= 100000) {
            s1 = s1 + (p4 * 0.10);
        } else {
            s1 = s1 + (p4 * 0.05);
        }

        if (p5 >= 100000) {
            s1 = s1 + (p5 * 0.10);
        } else {
            s1 = s1 + (p5 * 0.05);
        }

        if (p6 >= 100000) {
            s1 = s1 + (p6 * 0.10);
        } else {
            s1 = s1 + (p6 * 0.05);
        }

        if (p7 >= 100000) {
            s1 = s1 + (p7 * 0.10);
        } else {
            s1 = s1 + (p7 * 0.05);
        }
       

        double total =  p1 + p2 + p3 + p4 + p5 + p6 + p7 ;
        double tt = total*cantidad;
        double st = (double) (s1 + 1000000);

        System.out.println("Vendedor: " + n);
        System.out.println("Cuantas vecces vendiste los 7 productos : " + cantidad);
        System.out.println("Total ventas: " + (int) tt);
        System.out.println("Comisiones: " + (int) s1);
        System.out.println("Salario total: " + (int) st);
    }
}
