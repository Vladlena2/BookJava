package Chapter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выйти из обоих циклов
                System.out.print(j + " ");
                System.out.println(" Этo выводиться не будет .");
                System.out.println(" Циклы завершены . ");

            }

        }
    }
}
