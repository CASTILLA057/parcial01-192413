import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Le damos al ususario un mensaje de que instroduzca el numero entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        int suma = calcularSumaDigitos(numero);
        
        System.out.println("La suma de los dígitos es: " + suma);
        
        scanner.close();
    }

    public static int calcularSumaDigitos(int numero) {
        int suma = 0;
        //nos aseguramos que el numero que hemos sea positivo
        numero = Math.abs(numero); 
        //Utilice el while para poder sumar el ultimo digito y elimnarlo
        while (numero > 0) {
            //para poder sumar el ultimo digito
            suma += numero % 10;
            //Eliminar el ultimo digito
            numero /= 10; 
        }
        return suma;
    }
}

