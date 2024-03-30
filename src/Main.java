public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        int[] pay = {30_500, 46_900, 27_900, 48_380, 51_300};
        int sum = 0;
        for (int j : pay) {
            sum += j;
        }
        System.out.println("сумма трат в месяц составила " + sum + " рублей.");

        // Задача 2
        int[] payment = {30_500, 46_900, 27_900, 48_380, 51_300};
        int maxPayment = Integer.MIN_VALUE;
        int minPayment = Integer.MAX_VALUE;
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] > maxPayment) {
                maxPayment = payment[i];
            }
            if (payment[i] < minPayment) {
                minPayment = payment[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. " + " Максимальная сумма трат за неделю составила " + maxPayment + " рублей.");

        // Задача 3
        int[] salary = {30_500, 46_900, 27_900, 48_380, 51_300};
        double averageSalary = 0;
        for (int j : salary) {
            averageSalary = (double) j / salary.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей.");


        // Задача 4
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
    }
}


