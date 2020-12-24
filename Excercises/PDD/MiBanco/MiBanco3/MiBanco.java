package Excercises.PDD.MiBanco.MiBanco3;

import java.util.Scanner;
/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MiBanco {

    private static Scanner scanner = new Scanner(System.in);
    private static Banco banco = new Banco();

    public static void main(String[] args) {
        BancoCliente bancoCliente = new BancoCliente(scanner, banco);
        bancoCliente.run();
    }
}