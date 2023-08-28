public class Circulo  extends Forma{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return (Math.PI * (this.radio*this.radio));
    }
}
