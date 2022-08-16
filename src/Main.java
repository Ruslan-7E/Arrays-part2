public class Main {
    public static void main(String[] args) {
        // task 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // task 2
        int maxExpense = 0;
        int minExpense = 200_000;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maxExpense) {
                maxExpense = arr[j];
            }
            if (arr[j] < minExpense) {
                minExpense = arr[j];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей.");


        // task 3
        double averageSum = 0;
        double averageExpense = 0;
        for (int k = 0; k < arr.length; k++) {
            averageExpense = (averageSum += arr[k]) / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");

        // task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int n = reverseFullName.length - 1; n >= 0; n--) {
            System.out.print(reverseFullName[n]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}