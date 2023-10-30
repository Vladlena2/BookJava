package Chapter7;

class Test3 {
    int а;

    Test3(int i) {
        а = i;
    }

    Test3 incrByTen() {
        Test3 temp = new Test3(а + 10);
        return temp;
    }
}

public class RetOb2 {
    public static void main(String[] args) {
        Test3 оb = new Test3(2);
        Test3 оb2;
        оb2 = оb.incrByTen();
        System.out.println("оЫ.a: " + оb.а);
        System.out.println("оЬ2.a: " + оb2.а);
        оb2 = оb2.incrByTen();
        System.out.println("оЬ2.a после второго увеличения: " + оb2.а);
    }
}

//Вывод:
//оb.a: 2
//оb2.a: 12
//оb2.a после второго увеличения: 22

