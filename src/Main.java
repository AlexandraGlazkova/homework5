import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        //       ## 1 задача
//        Объявите три массива:
//        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого
//        слова new.
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.println(weight[i]);
            }
        }


//       2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –
//        сразу заполнив его значениями.
        double[] array = {1.57, 7.654, 9.986};
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();

//        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите
//        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] food = new int[5];
        food[2] = 5;
        food[3] = 9;
        food[0] = 520;
        for (int i = 0; i < food.length; i++) {
            if (i != food.length - 1) {
                System.out.print(food[i] + ", ");
            } else {
                System.out.println(food[i]);
            }
        }

//        ## 3 задача
//
//Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно
// не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через
// запятую, при этом элементы одного массива располагаются на одной строчке, а элементы
// другого массива – на другой.
//Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        System.out.println("В обратном порядке");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = number.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.print(number[i]);
            }
        }
        System.out.println();


        double[] arrayNew = {1.57, 7.654, 9.986};
        for (int i = arrayNew.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayNew[i] + ",");
            } else {
                System.out.print(arrayNew[i]);
            }
        }
        System.out.println();

        int[] doors = new int[5];
        doors[2] = 5;
        doors[3] = 9;
        doors[0] = 520;
        for (int i = doors.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(doors[i] + ", ");
            } else {
                System.out.println(doors[i]);
            }
        }
//     4 задача
//     Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
//     (нужно прибавить 1).
//     Важно: код должен работать с любым целочисленным массивом, поэтому для решения
//     задания вам нужно использовать циклы.
//     Распечатайте результат преобразования в консоль.
        System.out.println("Все нечетные числа, делаем четными");
        int[] rooms = new int[3];
        rooms[0] = 1;
        rooms[1] = 2;
        rooms[2] = 3;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] % 2 != 0)
                rooms[i] = rooms[i] + 1;
            {
                if (i != rooms.length - 1) {
                    System.out.print(rooms[i] + ", ");
                } else {
                    System.out.println(rooms[i]);
                }
            }
        }
    }
}

