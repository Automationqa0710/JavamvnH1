import jdk.jfr.Registered;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

        public class BonusServiceTest {


       @Test
       public void shouldCalculateForRegisteredAndUnderLimit() {
           BonusService service = new BonusService();

           // подготавливаем данные:
           long amount = 1000;
           boolean registered = true;
           long expected = 30;

           // вызываем целевой метод:
           long actual = service.calculate(amount, registered);

           // производим проверку (сравниваем ожидаемый и фактический):
           Assertions.assertEquals(expected, actual);
       }

       @Test
       public void shouldCalculateForRegisteredAndOverLimit() {
           BonusService service = new BonusService();

           // подготавливаем данные:
           long amount = 1_000_000;
           boolean registered = true;
           long expected = 500;

           // вызываем целевой метод:
           long actual = service.calculate(amount, registered);

           // производим проверку (сравниваем ожидаемый и фактический):
           Assertions.assertEquals(expected, actual);
       }

           @Test
           public void shouldCalculateIsRegisteredAndUnderLimit() {
               BonusService service = new BonusService();

               long amount = 1;
               boolean registered = true;
               long expected = 0;
               long actual = service.calculate(amount, registered);
               Assertions.assertEquals(expected, actual);
           }
           @Test
           public void shouldCalculateForNotRegisteredOverLimit(){
           BonusService service = new BonusService();

           long amount = 2_000_000;
           boolean isRegistered = false;
           long  expected = 500;
           long actual = service.calculate(expected, isRegistered);
           }



           }

