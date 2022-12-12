package br.com.alura.tdd.calculadora;

public class CalculadoraTESTS {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(5, 2);
        System.out.println(soma);
    }
}
