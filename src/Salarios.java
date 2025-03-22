import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        double totalSueldos = 0.0;
        int rangoJusticia = 0;
        int sueldosVIP = 0;
        
        
        for (int i = 1; i <= 10; i++) {
            double sueldo = 0.0;
            
            while (true) {
                System.out.print("Ingresa el sueldo del empleado " + i + ": ");
                sueldo = scanner.nextDouble();
                
                if (sueldo > 0) {
                    break;
                } else {
                    System.out.println("Sueldo no válido. Por favor, introduce un sueldo mayor a 0.");
                }
            }

           
            if (sueldo >= 100 && sueldo <= 300) {
                rangoJusticia++; 
            } else if (sueldo > 300) {
                sueldosVIP++; 
            }
            
            totalSueldos += sueldo; 
            ,
        }
        
      
        System.out.println("Resultados:");
        System.out.println("Cantidad de sueldos en el rango de la justicia (100 - 300): " + rangoJusticia);
        System.out.println("Cantidad de sueldos VIP (mayores a 300): " + sueldosVIP);
        System.out.printf("Total acumulado de sueldos:", (float)totalSueldos);

        
       
    



        
    }
}
