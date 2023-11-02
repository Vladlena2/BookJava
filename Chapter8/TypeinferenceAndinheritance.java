package Chapter8;

// При работе с наследованием выведенным типом является объявленный
// тип инициализатора и он может отличаться от производного
// типа объекта, на который ссылается инициализатор

class MyClass {
    // ...
}

class FirstDerivesClass extends MyClass{
    int x;
    // ...
}

class SecondDerivedClass extends FirstDerivesClass{
    int y;
    // ...
}

public class TypeinferenceAndinheritance {
    // Возвратить некоторый тип объекта MyClass.
    static MyClass getObj (int which){
        switch (which){
            case 0: return new MyClass();
            case 1: return new FirstDerivesClass();
            default: return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        // Несмотря на то, что getObj () возвращает различные типы
        // объектов в иерархии наследования MyClass, объявленным
        // типом возвращаемого значения является MyClass.
        // В результате во всех трех показанных здесь случаях
        // предполагается, что типом переменных является MyClass,
        // хотя получаются разные производные типы объектов.

        // В этом случае getObj () возвращает объект MyClass.
        var mc = getObj(0);

        // В этом случае getObj () возвращает объект MyClass.
        var mc2 = getObj(1);

        //  в этом случае getObj () возвращает объект SecondDerivedClass.
        var mc3 = getObj(2);

        // Поскольку тиnы mc2 и mсЗ выводятся как MyClass (т.к. возвращаемым типом
        // getObj () является MyClass) , то ни mc2 , ни mсЗ не могут получить доступ
        // к полям, объявленным в FirstDe rivedClass или SecondDe rivedClass.
        // mc2 .x 10; // Ошибка ! Класс MyClass не имеет поля х.
        // mсЗ .у = 10; // Ошибка ' Класс MyClass не имеет поля у.
    }
}
