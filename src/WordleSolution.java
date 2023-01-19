//Clase WordleSolution que hereda de Solution

public class WordleSolution extends Solution{

    //Declaración de atributos de la clase WordleSolution
    private String word;

    //Métodos constructores
    public WordleSolution(){
        super();
    }

    //Métodos get y set

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }

    @Override
    public String toString() {
        if (word != null){
            return word.toUpperCase();
        }else {
            return " ";
        }
    }
}
