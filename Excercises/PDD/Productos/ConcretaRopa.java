package Excercises.PDD.Productos;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ConcretaRopa implements IProductoRopa {

    private List<String> producto = new ArrayList<>();

    public List<String> getPantalon() {
        this.producto.add("Pierre Cardin");
        this.producto.add("Polo");
        this.producto.add("Malabar");
        return this.producto;
    }

    public List<String> getCamisa() {
        this.producto.add("Van Heusen");
        this.producto.add("University Club");
        this.producto.add("Givenchy");
        return this.producto;
    }

    public List<String> getZapatos() {
        this.producto.add("Calimod");
        this.producto.add("Rego");
        this.producto.add("Dauss");
        return this.producto;
    }
}