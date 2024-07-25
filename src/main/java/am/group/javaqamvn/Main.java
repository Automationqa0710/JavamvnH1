
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
   public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        long actual = service.calculate(1_000, true);
        System.out.println(expected + " == ? == " + actual);

        int expected1 = 50;
        long actual1 = service.calculate(1_000, false);
        System.out.println(expected1 + " == ? == " + actual1);

    }
}