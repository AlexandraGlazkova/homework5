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
        for (int i = 0; i < 3; i++) {
            if(i!=2)
            System.out.print(weight[i] + ", ");
        else System.out.println(weight[i]);}

//       2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –
//        сразу заполнив его значениями.
        double[] array = {1.57, 7.654, 9.986};
        for (int k = 0; k < array.length; k++)
        if (k== array.length - 1){
            System.out.print(array[k]);
        } else
            { System.out.print(array[k]+",");
            }
        System.out.println();

//        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите
//        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] food = new int[5];
        food[2] = 5;
        food[3] = 9;
        food[0] = 520;
        for (int t = 0; t < 5; t++) {
            if (t!=4)
            System.out.print(food[t]+ ", ");
            else
                System.out.println(food[t]);
        }

//        ## 2 задача
//
//        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого
//        элемента, через запятую. Запятая между последним элементом одного массива и первым элементом
//        следующего не нужна.


    }
}

