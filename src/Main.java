
public class Main {

    public static void main(String[] args) {
        Human();

    }

    public static void Human() {
        Employee[] employees = {
                new Employee("Иванов Иван", "Мэнеджер", "ivanovivan@email.ru",
                        890090909, 70000, 35),
                new Employee("Расколов Леонид", "Плотник", "ivanovivan@email.ru",
                        890034343, 60000, 48),
                new Employee("Афонасьев Дмитрий", "Учитель", "ivanovivan@email.ru",
                        898989845, 43899, 43),
                new Employee("Осипов Илья", "f&b", "ivanovivan@email.ru",
                        89095434, 45000, 35),
                new Employee("Иванова Оксана", "Бухгалтер", "ivanovivan@email.ru",
                        879877897, 50000, 34)};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].GetAge() > 40) {
                employees[i].Show();
            }
        }
    }

}