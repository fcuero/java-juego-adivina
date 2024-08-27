import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) throws Exception {
        
        //clase Scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaracion y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char [palabraSecreta.length()];
         
        //estructura de control: interativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';
            
        }
            
        //estructura de control: interativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos){
              
            System.out.println("palabra a adivinar: tiene " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + ") letra");

            System.out.println("introduce una letra, por fevor");

        //  usamos la clase Scanner para pedir una letra
        // PARA MAYUSCULA: toUpperCase
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estrutura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }


                
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡incorrecta! te quedan " + (intentosMaximos - intentos) +  " intentos.");
                
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta!: " + palabraSecreta);
                
            }

            
        }
        if (!palabraAdivinada) {
            
            System.out.println("¡Que pena te has quedado sin intentos! GAME OVER");
        }
        scanner.close();




    }
}

