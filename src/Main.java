public class Main {
    public static void main(String[] args) {
        int balance = 10000; // баланс до пополнения счета в копейках
        int payment = 110000; // сумма пополнения счета в копейках
        boolean pays = (payment > 100000); // проверка условия, явлется ли сумма пополнения счета больше 1000 рублей(в копейках)?
        int bonus;
        if (pays) {
            bonus = 1; // процент начисляемого бонуса, при пополнении суммы свыше 1000 рублей
        } else {
            bonus = 0; // процент начисляемого бонуса = 0, сумма пополнения меньше или равна 1000 рублей
        }
        int summ = payment * bonus / 100 / 100; // вычисляем сумму бонуса за начисление
        int total = balance / 100 + payment / 100 + summ; // итоговый баланс пользователя

        System.out.println("Вы пополнили баланс на сумму: " + payment / 100 + " руб.");
        System.out.println("Ваш текущий баланс: " + total + " руб.");
        if (pays) System.out.println("Бонус за пополнение: " + summ + " руб.");
    }
}
