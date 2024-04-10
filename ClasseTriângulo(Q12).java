public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double A, double B, double C) {
        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;
    }
    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(3, 4, 5);
        System.out.println("Área do triangulo: " + t.calcularArea());
        System.out.println("Perímetro do triângulo: " + t.calcularPerimetro());
	}
}
