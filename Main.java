public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); //сложение

        int b = calc.minus.apply(1,1); //вычетание

        int c = calc.devide.apply(a, b); // на 0 делить нельзя

        calc.println.accept(c);
    }
}
