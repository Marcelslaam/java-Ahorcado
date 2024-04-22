import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Declaramos los elementos
        Scanner leer = new Scanner(System.in);
        String palabraSecreta = "pichones";
        int intentosMaximos = 5;
        int intentos = 0;
        boolean palabraAdivinada = false;
        // Aqui estamos declarando que va a crear una letra por cada una de palabaraSecreta
        char[] letrassAdivinadas = new char[palabraSecreta.length()];
        // creamos un for para recorrer la cantidad de letras que tiene y escribe un guion por cada una
        for (int i = 0; i < letrassAdivinadas.length; i++) {
            letrassAdivinadas[i] = '_';
        }
        // Creamos un bucle.. solo accede si es distinto de palabraAdivinada y si tiene la cantidad de intentos validos
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("palabra a adivinar: " + String.valueOf(letrassAdivinadas) + " " + palabraSecreta.length() + " letras");
            // crea el texto
            System.out.println("Introduce una letra");
            // Aqui toma letra por letra que intentemos atinar y usa minuscula sin importar que ingresen
            char letra = Character.toLowerCase(leer.next().charAt(0));
            // creo un buleano para saber si la letra es correcta
            boolean letraCorrecta = false;
            // recorro con un for para no solo no perder un intento, sino que agregar la letra correcta a letraAdivinada
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrassAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            // Si no coincide con letraCorrecta entonces aumenta en uno intentos, muestra un alert y la cantidad de intentos restantes
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta.. Te quedan: " + (intentosMaximos - intentos) +"intentos");
            }
        
        // Si la cantidad y la opcion de letras son iguales a palabraSecreta entonces da por finalizado el juego y muestra un mensaje
        if (String.valueOf(letrassAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("Felicidades! Lo lograste!.. respuesta: " + palabraSecreta);
        leer.close();

        }
    }
        if (!palabraAdivinada) {
            // de caso contrario da por finalizado el juego con un mensaje
            System.out.println("Game Over😵‍💫");
        }
        leer.close();
    }
}
