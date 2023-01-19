//Clase abstracta Solution que implementa a interface Coparable

public abstract class Solution implements Comparable<Solution>{

    //Declaración de atributos de la clase
    private int valor;

    //Declaración de constructores de la clase
    public Solution(){

    }

    //Métodos get y set de valor
    public int getValor(){
        return valor;
    }

    //protected abstract void setValor(int valor);


    @Override
    public int compareTo(Solution solucion){
        if (valor == solucion.valor){
            return 0;
        }else if(valor > solucion.valor){
            return 1;
        }else{
            return -1;
        }
    }

}
