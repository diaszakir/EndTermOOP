import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valueInput = false;
        Money m = null;
        String money = null;
        String money2 = null;
        while (!valueInput) {
            try {
                System.out.println("Добро пожаловать!\nВведите что вы хотите сделать:\n1.Выбрать валюту\n" +
                        "2.Рассчитать\nЧтобы выйти нажмите 0");
                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Нажмите цифру чтобы ввести первую валюту:\n1.Тенге\n2.Доллар\n3.Евро\n4.Рубли");
                        int choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                money = "Тенге";
                                break;
                            case 2:
                                money = "Доллар";
                                break;
                            case 3:
                                money = "Евро";
                                break;
                            case 4:
                                money = "Рубли";
                                break;
                            default:
                                System.out.println("Введите цифру!");
                                break;
                        }
                        System.out.println("Нажмите цифру чтобы ввести вторую валюту:\n1.Тенге\n2.Доллар\n3.Евро\n4.Рубли");
                        int choise2 = scanner.nextInt();
                        switch (choise2) {
                            case 1:
                                if (money.equals("Тенге")) {
                                    System.out.println("Нельзя ввести две одинаковые валюты!\nВведите другую!");
                                } else {
                                    money2 = "Тенге";
                                }
                                break;
                            case 2:
                                if (money.equals("Доллар")) {
                                    System.out.println("Нельзя ввести две одинаковые валюты!\nВведите другую!");
                                } else {
                                    money2 = "Доллар";
                                }
                                break;
                            case 3:
                                if (money.equals("Евро")) {
                                    System.out.println("Нельзя ввести две одинаковые валюты!\nВведите другую!");
                                } else {
                                    money2 = "Евро";
                                }
                                break;
                            case 4:
                                if (money.equals("Рубли")) {
                                    System.out.println("Нельзя ввести две одинаковые валюты!\nВведите другую!");
                                } else {
                                    money2 = "Рубли";
                                }
                                break;
                            default:
                                System.out.println("Введите номер!");
                                break;
                        }
                        break;
                    case 2:
                        if (money != null && money2 != null) {
                            if (money.equals("Тенге")) {
                                System.out.println("Введите деньги которые нужно перевести(тенге):");
                                int tenge = scanner.nextInt();
                                m = new Tenge(tenge);
                                if (money2.equals("Доллар")) {
                                    m.exchangeToDollar();
                                } else if (money2.equals("Евро")) {
                                    m.exchangeToEuro();
                                } else if (money2.equals("Рубли")) {
                                    m.exchangeToRubles();
                                }
                            } else if (money.equals("Доллар")) {
                                System.out.println("Введите деньги которые нужно перевести(доллар):");
                                int dollar = scanner.nextInt();
                                m = new Dollars(dollar);
                                if(money2.equals("Тенге")) {
                                    m.exchangeToTenge();
                                }
                                else if(money2.equals("Евро")){
                                    m.exchangeToEuro();
                                }
                                else if(money2.equals("Рубли")){
                                    m.exchangeToRubles();
                                }
                            } else if (money.equals("Рубли")) {
                                System.out.println("Введите деньги которые нужно перевести(рубли):");
                                int rubles = scanner.nextInt();
                                m = new Rubles(rubles);
                                if(money2.equals("Доллар")) {
                                    m.exchangeToDollar();
                                }
                                else if(money2.equals("Евро")){
                                    m.exchangeToEuro();
                                }
                                else if(money2.equals("Тенге")){
                                    m.exchangeToTenge();
                                }
                            } else if (money.equals("Евро")) {
                                System.out.println("Введите деньги которые нужно перевести(евро):");
                                int euro = scanner.nextInt();
                                m = new Euros(euro);
                                if(money2.equals("Доллар")) {
                                    m.exchangeToDollar();
                                }
                                else if(money2.equals("Тенге")){
                                    m.exchangeToTenge();
                                }
                                else if(money2.equals("Рубли")){
                                    m.exchangeToRubles();
                                }
                            }
                        } else {
                            System.out.println("Вы не выбрали валюту!!!");
                        }
                        break;
                    case 0:
                        valueInput = true;
                        break;
                    default:
                        System.out.println("Введите номер!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите цифру!!!");
            }
        }
    }
}
