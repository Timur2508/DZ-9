public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");

        System.out.println("Задача №1");
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задача №2");
        int[] arr1 = {1, 2, 3, 4, 5};
        int maxArr1 = arr1[0];
        int minArr1 = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxArr1) {
                maxArr1 = arr1[i];
            }
            if (arr1[i] < minArr1) {
                minArr1 = arr1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minArr1 + " рубль. Максимальная сумма трат за неделю составил " + maxArr1 + " рублей");

        System.out.println("Задача №3");
        int[] arr2 = {1, 2, 3, 4, 5};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum1 += arr2[i];
            sum2 = sum1 / arr2.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum2 + " рубля");

        System.out.println("Задача №4");
        char[] names = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int temp;
        for (int i = 0; i < names.length / 2; i++) {
            temp = names[i];
            names[i] = names[names.length - 1 - i];
            names[names.length - 1 - i] = (char) temp;
        }
        System.out.print(names);
    }
}