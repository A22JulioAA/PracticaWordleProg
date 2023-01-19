//Clase abstracta GameSolver

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class GameSolver {

    //Atributos de la clase
    public ArrayList<Solution> soluciones;
    public String nombre;

    //Constructores
    public GameSolver(String nombre){
        this.nombre = nombre;
        soluciones = new ArrayList<Solution>();
    }

    //Métodos get y set
    public String getNombre(){
        return nombre;
    }

    public ArrayList<Solution> getSoluciones(){
        return soluciones;
    }

    //Métodos de clase
    public boolean addSolucion(Solution s){
        return soluciones.add(s);
    }

    public void clearSolucions(){
        soluciones.clear();
    }

    public abstract void solve();

    @Override
    public String toString() {
        Collections.sort(soluciones);

        StringBuilder sb = new StringBuilder();

        for (Solution solucion : soluciones) {
            sb.append(solucion).append("\n");
        }
        return sb.toString();
    }
}
