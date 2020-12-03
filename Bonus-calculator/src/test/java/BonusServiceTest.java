import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 5000;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 3000;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }


}







