//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2020);
        Cliente cliente = new Cliente("Juan Pérez", "123456789");
        System.out.println(coche);
        System.out.println(cliente);
    }

}