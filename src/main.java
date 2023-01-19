//Clase principal proyecto Wordle

/**
 * Author: Julio Acuña
 * */

import java.util.*;

public class main {
    public static void main(String[] args) {
        Letter letra = new Letter('c', LetterStatus.CORRECT, 4);
        letra.equals(new Letter('b'));

        System.out.println(letra);
    }
}
