package Chapter10;

public class MyException extends Exception {
    private int detail;

    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo{
    static void compute(int a) throws MyException{
        System.out.println("Вызов compute (" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e){
            System.out.println("Перехваченное исключение " + e);
        }
    }
}

/*
Вот результат работы программы:
Вызов compute(1)
Нормальное завершение Вывозов compute(20)
Перехваченное исключение MyException [20]
 */