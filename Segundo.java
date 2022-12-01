package examen;

public class Segundo {
    void mostrarTabla(int val){
        System.out.println(" tabla del " + val);
        for (int i = val; i<= val; i++){
            for (int j = 1; j <= 10; j++){

                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
