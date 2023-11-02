package Chapter8;
// Методы с отличающимися сигнатурами типов
// являются перегруженными - не переопределенными
class A2{
    int i, j;

    A2(int a, int b){
        i = a;
        i = b;
    }

    void show(){
        System.out.println("i и j: " + i + " " + j);
    }
}

class B2 extends A2{
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

    public class Override {
        public static void main(String[] args) {
            B2 subOb = new B2(1, 2, 3);

            subOb.show("This is k: "); // Вызывается show() из B
            subOb.show(); // Вызывается show() из A
        }
}

/*
Вывод:
This is k: 3
i и j: 1 2
 */