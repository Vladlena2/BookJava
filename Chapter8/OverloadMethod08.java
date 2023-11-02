package Chapter8;
// Перегрузка методов (стр. 238)
class SupE {
    int i, j;
    SupE (int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Вывод переменных i, j : " + i + " , " + j);
    }
}

class SubF extends SupE {
    int k;
    SubF(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // метод переопределяет метод show() из Суперкласса supE
    void show() {
        System.out.println("k: " + k);
    }
}
class OverloadMethod08 {
    public static void main(String[] args) {
        SubF subOb = new SubF(1,2,3);
        subOb.show(); // вызывается из B
    }
}
/* -------------------------------------------------
Вызвать метод show() из Суперкласса SupE
Вывод переменных i, j : 1 , 2
Вызвать перегруженный метод show(), переменная k : 3
 */
