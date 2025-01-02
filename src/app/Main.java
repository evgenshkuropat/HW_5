package app;

public class Main {
    public static void main(String[] args) {
        // Сума доходу
        double income = 50000;

        // Змінна для збереження суми податку
        double tax = 0;

        // Розрахунок суми податку за прогресивною шкалою
        if (income <= 10000) {
            // Якщо дохід до 10000 включно
            tax = income * 0.025;
        } else if (income <= 25000) {
            // Якщо дохід більше 10000, але менше або дорівнює 25000
            tax = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            // Якщо дохід більше 25000
            tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }

        // Виведення результату
        System.out.printf("Для доходу EUR %.2f сума податку становить EUR %.2f.%n", income, tax);
    }
}

