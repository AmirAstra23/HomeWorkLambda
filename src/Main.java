public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        try {
            Calculator calc = Calculator.instance.get();

            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b); // Здесь при делении может возникнуть ошибка,
            // если делитель равен нулю. На ноль делить нельзя.
            // Поэтому ловим эту ошибку и обрабатываем в блоке try/catch
            calc.println.accept(c);
        } catch (Exception e) {
            System.out.println("Извинтите, на ноль делить нельзя! " +
                    "Проверьте число делитель. " +
                    "ошибка: " + e);
        }
    }
}
