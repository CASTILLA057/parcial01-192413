public class Palindromo {
    public static void main(String[] args) {
        // coloque esta cadena de ejemplo para probar si sirve el programa
        String textoEjemplo = "manzana";
        boolean resultado = esPalindromo(textoEjemplo);
        
        if (resultado) {
            System.out.println("\"" + textoEjemplo + "\" es un palíndromo.");
        } else {
            System.out.println("\"" + textoEjemplo + "\" no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String texto) {
        // Necesitamos colocar las mayusculas a minúsculas y eliminar espacios y signos de puntuación
        String textoLimpio = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Obtener el reverso de la cadena
        String textoReverso = new StringBuilder(textoLimpio).reverse().toString();

        // Comparar la cadena limpia con su reverso
        return textoLimpio.equals(textoReverso);
    }
}



