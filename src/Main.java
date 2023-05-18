public class Main {
    public static void main(String[] args) {

        System.out.println("Курсовая работа № 1" );
        //        /1. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//            Отделы с 1-5;
//            * Создадим  массив из сотрудников*/
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Иванов Иван Иванович", 1, 75000);
        staff[1] = new Employee("Горбунков Семен Семенович", 2, 50000);
        staff[2] = new Employee("Петров Петр Петрович", 3, 40000);
        staff[3] = new Employee("Николаев Николай Николаевич", 4, 60000);
        staff[4] = new Employee("Федоров Федор Федорович", 5, 58000);
        staff[5] = new Employee("Сергеев Сергей Сергеевич", 1, 75000);
        staff[6] = new Employee("Каштанов Иван Геннадьевич", 2, 52000);
        staff[7] = new Employee("Муреев Александр Евгеньевич", 3, 44000);
        staff[8] = new Employee("Николаев Николай Николаевич", 4, 66000);
        staff[9] = new Employee("Федоров Федор Федорович", 5, 58000);

        //  a ) Вывести всех сотудников
        System.out.println("a ) Вывести всех сотрудников.");
        printListOfEmployees(staff);

        //  b ) Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("b ) Посчитать сумму затрат на зарплаты в месяц.");
        calculateSumSalaryInTheMonth(staff);

        // с ) Найти сотрудника с минимальной зарплатой.
        System.out.println("с ) Найти сотрудника с минимальной зарплатой.");
        Employee employeeWithLowSalary =  employeeWithLowSalary(staff);
        System.out.println("Сотрудник с  минимальной зарплатой : " + employeeWithLowSalary.getName());
        System.out.println("Минимальная зарплата : " + employeeWithLowSalary.getSalary());

        // d ) Найти сотрудника с максимальной зарплатой.
        System.out.println("d) Найти сотрудника с максимальной зарплатой.");
        Employee employeeWithBigSalary = employeeWithBigSalary(staff);
        System.out.println("Сотрудник с  максимальной зарплатой : " + employeeWithBigSalary.getName());
        System.out.println("Максимальная зарплата : " + employeeWithBigSalary.getSalary());

        // e ) Подсчитать среднее значение зарплат .//
        System.out.println("e ) Подсчитать среднее значение зарплат.");
        double averageSum = averageSumSalaryInTheMonth(staff);
        System.out.println("Средняя зарплата в месяц составляет: " + averageSum);

        // f ) Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("f ) Получить Ф. И. О. всех сотрудников (вывести в консоль).");
        printNameOfPersonal(staff);
    }

    //  a ) Вывести всех сотудников
    public static void printListOfEmployees(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
    //  b ) Посчитать сумму затрат на зарплаты в месяц.
    public static void calculateSumSalaryInTheMonth(Employee[] staff) {
        double sum = 0;
        for (Employee employee : staff) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
    }
    // с ) Найти сотрудника с минимальной зарплатой.

    public static Employee employeeWithBigSalary  (Employee[] staff) {
        Employee max  =  staff[0];
        for (int i = 1; i < staff.length; i++) {
            if (staff[i].getSalary() > max.getSalary() ) {
                max = staff[i];
            }
        }
        return max;
    }
    // d ) Найти сотрудника с максимальной зарплатой.
    public static Employee employeeWithLowSalary   (Employee[] staff) {
        Employee min  =  staff[0];
        for (int i = 1; i < staff.length; i++) {
            if (staff[i].getSalary() < min.getSalary() ) {
                min = staff[i];
            }
        }
        return min;
    }
    // e )Подсчитать среднее значение зарплат .
    public static double averageSumSalaryInTheMonth(Employee[] staff) {
        double sum = 0;
        for (Employee employee : staff) {
            sum += employee.getSalary();
        }
        if (staff.length > 0) {
            return sum / staff.length;
        } else {
            return 0;
        }
    }

    // f ) Получить Ф. И. О. всех сотрудников .
    public static void printNameOfPersonal(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println("Сотрудник  " + employee.getName());
        }
    }
}
