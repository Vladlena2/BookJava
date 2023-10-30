package Chapter7;

class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a и b перед вызовом: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}

//Вывод:
//a и b перед вызовом: 15 20
//a и b после вызова: 15 20
