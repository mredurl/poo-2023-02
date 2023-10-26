import java.util.ArrayList;
import java.util.List;


abstract class Figura {
    
    public abstract double calcularArea();
    
    
    public abstract double calcularPerimetro();
}


class Quadrado extends Figura {
    private double lado;

    public Quadrado() {
        this.lado = 0.0;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}


class Triangulo extends Figura {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo() {
        this.base = 0.0;
        this.lado1 = 0.0;
        this.lado2 = 0.0;
        this.altura = 0.0;
    }

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }
}


class Circulo extends Figura {
    private double raio;

    public Circulo() {
        this.raio = 0.0;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}


class Retangulo extends Quadrado {
    private double altura;

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return super.getLado() * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (super.getLado() + altura);
    }
}


public class Main {
    public static void main(String[] args) {
     
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(3, 4, 5, 4);
        Circulo circulo = new Circulo(2);
        Retangulo retangulo = new Retangulo(5, 8);

       
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

    
        List<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(quadrado);
        listaFiguras.add(triangulo);
        listaFiguras.add(circulo);
        listaFiguras.add(retangulo);

        for (Figura figura : listaFiguras) {
            System.out.println("Área da figura: " + figura.calcularArea());
            System.out.println("Perímetro da figura: " + figura.calcularPerimetro());
        }
    }
}
