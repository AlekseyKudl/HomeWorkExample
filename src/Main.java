public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // задача 1

        int[] arr1 = generateRandomArray();
        int summa = 0;
        for (int i = 0; i < arr1.length; i++) {
            summa +=arr1[i];

        }
        System.out.println("Сумма трат за месяц составила " + summa + "рублей");
        // Задача 2
        int maxPay = 0;
        int minPay = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (maxPay < arr1[i]) {
                maxPay = arr1[i];
            }
            if (minPay > arr1[i]) {
                minPay = arr1[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей. Максимальная сумма трат за день составила " + maxPay + " рублей");
        float mediumPay = 1.00f * summa / arr1.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumPay + " рублей");
        // задача 3
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);

        }


    }
}