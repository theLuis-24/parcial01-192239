import java.util.Scanner;

public class ConversionTemp {
    public static void main(String[] args) {

        /*Se definen las variables a utilizar para la conversion */
        double division1 = 9/5;
        double numero1 = 32;
        double  division2 =5/9;
        double ConversionResultado;
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija que tipo de conversion desea hacer:");
        System.out.println("(1) Celcius a Fahrenheit");
        System.out.println("(2) Farenheit a celcius");

        String conversion = scanner.nextLine().toLowerCase();

        /*Se usa un switch para asi poder elegir el tipo de conversion*/
        switch (conversion) {
            case "1" :
            System.out.println("Ingrese el valor de los grados celcius");
            double celcius =scanner.nextDouble();

            ConversionResultado= (celcius * division1)+ numero1;
            System.out.println("El resultado de la conversion fue de: " + celcius +" C a " +ConversionResultado +" f");
                
            break;

            case "2" :
                System.out.println("Ingrese el valor de los grados farenheit");
                double farenheit =scanner.nextDouble();
                
                ConversionResultado= (farenheit - numero1)*5/9;
                System.out.println("El resultado de la conversion fue de: " + farenheit +" F a " +ConversionResultado +" C");
            break;
            default:/*De no elegirse ninguna conversion esta mandara el siguiente mensaje */
            System.out.println("esa conversion no esta disponible o ni existe ");
        }
    }
}