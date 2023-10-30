package Chapter7;

class Test2 {
    int а, b;

    Test2(int i, int j) {
        а = i;
        b = j;
    }

    // Передать объект.
    void meth(Test2 о) {
        о.а *= 2;
        о.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("об.а и об.Ь перед вызовом: " + ob.а + " " + ob.b);
        ob.meth(ob);
        System.out.println("об.а и об.Ь после вызова: " + ob.а + " " + ob.b);
    }
}

//Вывод:
//об.а и об.b перед вызовом: 15 20
//об.а и об.b после вызова: 30 10