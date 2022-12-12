import br.com.alura.tdd.calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTests {
    @Test
    public void somaDoisNumerosPositios(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(5,2);

        Assertions.assertEquals(7, soma);

    };
}
