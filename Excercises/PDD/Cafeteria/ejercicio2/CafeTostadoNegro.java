package Excercises.PDD.Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CafeTostadoNegro extends Cafe {
    public CafeTostadoNegro() {
        this.descripcion = "Cafe Tostado Negro";
    }

    @Override
    public double getCosto() {
        return 0.99;
    }
}