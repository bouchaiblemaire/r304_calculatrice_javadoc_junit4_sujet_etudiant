import nombre.*;
import operation.*;
import operation.exception.*;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

/**
 * @author B. LEMAIRE
 * Classe de tests unitaires de la classe métier Calculatrice
 */
public class CalculatriceTest {

    @Test
    public void should_return_som_when_proceed_som_with_two_valid_operande() throws ManqueOperandeException,
            DivisionParZeroException, OutOfCapicityException {

        // Arrange
        Expression operande1 = new Nombre(4);
        Expression operande2 = new Nombre(11);

        Addition addition= new Addition(operande1, operande2);

        // Act
        int actual = addition.valeur();
        int expected = 15;

        // Assert
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    public void when_divider_is_zero_should_throw_division_par_zero_exception()
            throws ManqueOperandeException, OutOfCapicityException {

        // Arrange
        Expression operande1 = new Nombre(10);
        Expression operande2 = new Nombre(0);
        Division division= new Division(operande1, operande2);


        // Act, Assert
        assertThatExceptionOfType(DivisionParZeroException.class)
                .isThrownBy(()->division.valeur());



    }


}
