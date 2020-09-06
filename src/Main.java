
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 12);
        int b = calc.minus.apply(5,1);
        int c = calc.devide.apply(a, b);
        // ошибка была в переменной c - деление на ноль, тк в операторе b было 1 минус 1 = 0,
        // далее в операторе с мы делить a на 0

        calc.println.accept(c);
    }
}
