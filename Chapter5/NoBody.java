package Chapter5;

public class NoBody {
    public static void main(String[] args ) {
        int i, j;
        i = 100;
        j = 200;
// найти среднюю точку между i и j
        while (++i < --j) ; // тело в цикле отсутствует
        System.out.println("Cpeдняя точка равна " + i);
    }
}

// Средняя точка равна 150