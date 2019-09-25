import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int numberOfPoints = 0;
        int blueCardLimit = 15_000;
        int silverCardLimit = 150_000;
        int checkSum = 1000;
        int blueCardPoint = 50;
        int silverCardPoint = 70;
        int goldCardPoint = 100;
        int blueCardPointLimit = 750;
        int silverCardPointLimit = 10_200;
        while (sum <= blueCardLimit) {
            System.out.println("Введите сумму покупки");
            double sumOfThisCurrent = scanner.nextDouble();
            sum = sum + sumOfThisCurrent;
            if (sum > blueCardLimit) {
                if (sum % checkSum == 0) {
                    System.out.println("Статус карты изменен на: серебряный. Текущий баланс равен " + sum + " Количество баллов равно " + (numberOfPoints = blueCardPointLimit + (int) ((sum - blueCardLimit) / checkSum * silverCardPoint)));
                } else {
                    System.out.println("Статус карты изменен на: серебряный. Текущий баланс равен " + sum + " Количество баллов равно " + blueCardPointLimit);
                }
                break;
            } else {
                if (sum % checkSum == 0) {
                    numberOfPoints = (int) (sum / checkSum * blueCardPoint);
                }

            }
            ;
            System.out.println("Статус карты: синий. Количество баллов равно " + numberOfPoints);
        }

        while (sum <= silverCardLimit) {
            System.out.println("Введите сумму покупки");
            double sumOfThisCurrent = scanner.nextDouble();
            sum = sum + sumOfThisCurrent;
            if (sum > silverCardLimit) {
                if (sum % checkSum == 0) {
                    System.out.println("Статус карты изменен на: золотой. Текущий баланс равен " + sum + " Количество баллов равно " + (numberOfPoints = silverCardPointLimit + (int) ((sum - silverCardLimit) / checkSum * goldCardPoint)));
                } else {
                    System.out.println("Статус карты изменен на: золотой. Текущий баланс равен " + sum + " Количество баллов равно " + silverCardPointLimit);
                }
                break;
            } else {
                if (sum % checkSum == 0) {
                    numberOfPoints = blueCardPointLimit + (int) ((sum - blueCardLimit) / checkSum * silverCardPoint);
                }
            }
            System.out.println("Статус карты: серебряный. Количество баллов равно " + numberOfPoints);
        }
        while (sum > silverCardLimit) {
            System.out.println("Введите сумму покупки");
            double sumOfThisCurrent = scanner.nextDouble();
            sum = sum + sumOfThisCurrent;
            if (sum % checkSum == 0) {
                numberOfPoints = silverCardPointLimit + (int) ((sum - silverCardLimit) / checkSum * goldCardPoint);
            }
            System.out.println("Статус карты: золотой. Количество баллов равно " + numberOfPoints);
        }
    }
}
