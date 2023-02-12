package com.tyukilin.java.hometask.week2.cycles;


/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию
 * Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 */
public class Task4_3 {
    public static void main(String[] args) {
        double period = 38.0;
        double salary = 600.0;
        double indexing = 400.0;
        credit(period, indexing, salary);

    }

    public static void credit(double period, double indexing, double salary) {
        double accountPersonal = 0;
        double brokerPercent = 0;
        double value = salary;
        for (int currentMonth = 1; currentMonth <= period; currentMonth++) {
            if (currentMonth % 6 == 0) {
                value = value + indexing;
            }
            accountPersonal = accountPersonal + (value - 300);
            double sum = value * 0.1;
            brokerPercent = brokerPercent + sum * 0.02;
        }
        System.out.println("Personal account " + accountPersonal);
        System.out.printf("Broker account " + "%.2f", brokerPercent);
    }
}


