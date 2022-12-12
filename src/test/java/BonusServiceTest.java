import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    @Order(0)
    void bonusSerZeroParaFuncionarioComSalarioAlto(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Richard", LocalDate.now(), new BigDecimal("25000")));

        assertEquals(BigDecimal.ZERO, bonus);
    };

    @Test
    @Order(1)
    void bonusSerParaFuncionarioComSalarioAbaixoDe10mil(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Richard", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    };
}
