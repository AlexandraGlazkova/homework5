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

//        ## 3 задача
//
//Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно
// не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через
// запятую, при этом элементы одного массива располагаются на одной строчке, а элементы
// другого массива – на другой.
//Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        { System.out.println("В обратном порядке");}
        int[] g = new int[3];
        g[0] = 1;
        g[1] = 2;
        g[2] = 3;
        for (int i = g.length-1; i >=0; i--) {
            if(i!=0)
                System.out.print(g[i] + ", ");
            else System.out.print(g[i]);}
        System.out.println();


        double[] q = {1.57, 7.654, 9.986};
        for (int k = q.length-1; k >=0; k--){
            if (k!=0)
                System.out.print(q[k]+",");
            else
             System.out.print(q[k]);
            }
        System.out.println();

        int[] d = new int[5];
        d[2] = 5;
        d[3] = 9;
        d[0] = 520;
        for (int t = 4; t >= 0; t--) {
            if (t!=0)
                System.out.print(d[t]+ ", ");
            else
                System.out.println(food[t]);
        }

    }
}

