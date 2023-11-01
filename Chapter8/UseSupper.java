package Chapter8;

class A{
    int i;
}

class B extends A{
    int i; // Этот член i скрывает i в A

    B(int a, int b){
        super.i = a; // i в A
        i = b; // i в A
    }

    void show(){
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}

public class UseSupper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}

/*
Вывод:
i в суперклассе: 1
i в подклассе: 2
 */