package Chapter7;

class Box {
    double width;
    double height;
    double depth;

    // Конструктор для создания объекта Box с указанными размерами
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор для создания куба
    Box(double len) {
        width = height = depth = len;
    }

    // Конструктор для создания неинициализированного объекта Box
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор, который принимает другой объект Box
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Метод для вычисления и возврата объема коробки
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        // Создаем объекты Box, используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1); // создаем копию объекта mybox1

        double vol;

        // Вычисляем объем первой коробки
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // Вычисляем объем второй коробки
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // Вычисляем объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);

        // Вычисляем объем копии
        vol = myclone.volume();
        System.out.println("Объем копии равен " + vol);
    }
}
