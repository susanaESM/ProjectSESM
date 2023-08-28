import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(10);

        JOptionPane.showMessageDialog(null,"el area del circulo es: "+ circulo1.calcularArea());

    }
}