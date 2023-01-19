//Clase Letter que implementa la interface Comparable

import java.util.Objects;

public class Letter implements Comparable<Letter>{

    //Declaración de constantes
    private static final int DEFAULT_POSITION = -1;

    //Declaración de atributos
    private char letter;
    private LetterStatus estado;
    private int posicion;

    //Métodos constructores
    public Letter(char letter, LetterStatus estado, int posicion){
        //Si la letra NO es una letra le damos el valor 0, si SÍ es una letra la convertimos en mayúscula
        if (Character.isLetter(letter)){
            this.letter = Character.toUpperCase(letter);
        }

        //Si el estado es NO SELECIONADA o la posición es 0 le damos la posición por deffecto
        if (estado == LetterStatus.DESELECTED || posicion < 0){
            this.posicion = DEFAULT_POSITION;
        }else {
            this.posicion = posicion;
        }

        this.estado = estado;
    }

    public Letter(char letter){
        if (!Character.isLetter(letter)){
            letter = 0;
        }else {
            this.letter = Character.toUpperCase(letter);
        }
        posicion = DEFAULT_POSITION;
        estado = LetterStatus.DESELECTED;
    }

    //Métodos

    //Métodos get y set de los atributos

    public char getLetter(){
        return letter;
    }

    public int getPosicion(){
        return posicion;
    }

    public LetterStatus getEstado(){
        return estado;
    }

    public void setPosicion(int posicion){
        if(posicion < 0){
            this.posicion = DEFAULT_POSITION;
        }else {
            this.posicion = posicion;
        }
    }

    public void setEstado(LetterStatus estado){
        this.estado = estado;
    }

    @Override
    public boolean equals(Object outraLetra) {
        if (this == outraLetra) return true;
        if (outraLetra == null || getClass() != outraLetra.getClass()) return false;
        Letter novaLetra = (Letter) outraLetra;
        return letter == novaLetra.letter && posicion == novaLetra.posicion;
    }

    @Override
    public int compareTo(Letter letra){
       return 0;
    }

    @Override
    public String toString(){
        return letter + " [" + posicion + "] " + "(" + estado + ")";
    }



}
