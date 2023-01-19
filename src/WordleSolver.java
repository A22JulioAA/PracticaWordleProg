//Clase WordleSolver que hereda de GameSolver

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WordleSolver extends GameSolver{

    //CONSTANTES de la clase

    private static final String SOLVER_NAME = "Wordle Solver";
    private static final int DEFAULT_SIZE = 26;
    private static final String DEFAULT_WORDS_FILE = "english.txt";

    //Atributos de la clase
    private Letter[] letras;
    private String wordsFile;
    private ArrayList<String> dicionario;

    //Métodos constructores
    public WordleSolver(){
        super(SOLVER_NAME);
        letras = new Letter[DEFAULT_SIZE];
        dicionario = new ArrayList<String>();

        Scanner sc = new Scanner(new File("C:\\Users\\A22JulioAA\\Documents\\programacion\\PracticaWordle\\english.txt"));

    }





}
