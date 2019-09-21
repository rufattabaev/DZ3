import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int numberOfPoints = 0;
            while (sum <= 15_000) {
                System.out.println("Введите сумму покупки");
                double sumOfThisCurrent = scanner.nextDouble();
                sum = sum + sumOfThisCurrent;
                if (sum > 15000) {
                    if (sum % 1000 == 0){
                        System.out.println("Статус карты изменен на: серебряный. Текущий баланс равен " + sum + " Количество баллов равно " + (numberOfPoints = 750 + (int) ((sum - 15_000) / 1000 * 70)));
                    } else {
                        System.out.println("Статус карты изменен на: серебряный. Текущий баланс равен " + sum + " Количество баллов равно " + 750);
                    }
                    break;
                }else {
                    if (sum % 1000 == 0) {
                    numberOfPoints = (int) (sum / 1000 * 50);
                }

                };
                System.out.println("Статус карты: синий. Количество баллов равно " + numberOfPoints);
            }

        while(sum <= 150_000){
            System.out.println("Введите сумму покупки");
            double sumOfThisCurrent = scanner.nextDouble();
            sum = sum + sumOfThisCurrent;
            if (sum > 150_000){
                if (sum % 1000 ==0){
                    System.out.println("Статус карты изменен на: золотой. Текущий баланс равен " + sum + " Количество баллов равно " + (numberOfPoints = 10200 + (int) ((sum - 150_000) / 1000 * 100)));
                } else {
                    System.out.println("Статус карты изменен на: золотой. Текущий баланс равен " + sum + " Количество баллов равно " + 10200);
                }
                break;
            }else {
                if (sum % 1000 == 0){
                    numberOfPoints = 750 + (int) ((sum - 15_000) / 1000 * 70);
                }
            }
            System.out.println("Статус карты: серебряный. Количество баллов равно " +numberOfPoints);
        }
        while(sum > 150_000){
            System.out.println("Введите сумму покупки");
            double sumOfThisCurrent = scanner.nextDouble();
            sum = sum + sumOfThisCurrent;
            if (sum % 1000 == 0){
                numberOfPoints = 10_200 + (int) ((sum - 150_000) / 1000 * 100);
            }
            System.out.println("Статус карты: золотой. Количество баллов равно " +numberOfPoints);
        }
    }
}
