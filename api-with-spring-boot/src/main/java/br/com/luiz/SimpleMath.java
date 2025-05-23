package br.com.luiz;

public class SimpleMath {

    public Double sum(double a, double b) {
        return a + b;
    }

    public Double sub(double a, double b) {
        return a - b;
    }

    public Double mul(double a, double b) {
        return a * b;
    }

    public Double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}
