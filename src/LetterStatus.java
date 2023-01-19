//Enumeración con los estados de las letras

public enum LetterStatus {

    CORRECT('c'), VALID('v'), BAD('b'), DESELECTED('d');

    char caracter;

    private LetterStatus(char caracter){
        this.caracter = caracter;
    }

    public static LetterStatus getLetterStatus(char c){
        switch (c){
            case 'c': return CORRECT;
            case 'v': return VALID;
            case 'b': return BAD;
            case 'd': return DESELECTED;
            default: return DESELECTED;
        }
    }

}
