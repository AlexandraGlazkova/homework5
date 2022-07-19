public class Main {
    public static void main(String[] args) {
 //       ## 1 задача
//        Объявите три массива:
//        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого
//        слова new.
        int [] weight=new int[3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
         for (int i = 0; i < 3; i++) {
             System.out.println(weight[i]);
         }
//       2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –
//        сразу заполнив его значениями.
        double [] array = {1.57, 7.654, 9.986};
         for (int k =0; k<array.length; k++) {
            System.out.println(array[k]);
        }
//        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите
//        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int [] food = new int [5];
         food[2] =5;
         food[3]=9;
         food[0]=520;
        for (int t=0; t<5;t++) {
            System.out.println(food[t]);}
    }
}