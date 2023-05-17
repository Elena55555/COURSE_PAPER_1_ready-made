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

        System.out.println("a ) Вывести всех сотудников" );



        //  a ) Вывести всех сотудников
        String  String  =  String(staff);
        System.out.println(String);

        System.out.println("b ) Посчитать сумму затрат на зарплаты в месяц." );

        //  b ) Посчитать сумму затрат на зарплаты в месяц.

        double  Sum  =  Sum(staff);
        System.out.println(Sum);
        System.out.println("c ) Найти сотрудника с минимальной зарплатой." );

        // c ) Найти сотрудника с минимальной зарплатой.
        Employee minSalary= minSalary (staff);
        System.out.println(minSalary.getSalary());
        System.out.println(minSalary.getName());
        System.out.println("d ) Найти сотрудника с максимальной зарплатой." );
        // d ) Найти сотрудника с максимальной зарплатой.
        Employee maxSalary = maxSalary(staff);
        System.out.println(maxSalary.getSalary());
        System.out.println(maxSalary.getName());

        System.out.println("e )Подсчитать среднее значение зарплат." );

        // e )Подсчитать среднее значение зарплат .

        double averageSum = averageSum(staff);
        System.out.println(averageSum);

        System.out.println("f ) Получить Ф. И. О. всех сотрудников (вывести в консоль)." );

        // f ) Получить Ф. И. О. всех сотрудников (вывести в консоль).
        String  StringPersonal  =  StringPersonal(staff);
        System.out.println(StringPersonal);

    }

    //  a ) Вывести всех сотудников
    public  static String String    (Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee );
        }

        return null;
    }

    //       b   Посчитать сумму затрат на зарплаты в месяц.


    public static double  Sum (Employee[] staff) {

        double sum = 0;
        for (Employee employee: staff ){
            sum += employee.getSalary();
        }
        return sum  ;
    }
    // c ) Найти сотрудника с минимальной зарплатой.

    public static Employee minSalary (Employee[] staff ) {
        Employee min = null;
        for (Employee employee : staff) {
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    // e )Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).

    public static Employee maxSalary(Employee[] staff) {
        Employee max = null;
        for (Employee employee : staff) {
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSum (Employee[] staff)
    {
        double sum = 0;
        for (Employee employee : staff)
        {
            sum +=  employee.getSalary();
        }
        if (staff.length > 0)
        {
            return sum / staff.length;
        }
        else
        {
            return 0;
        }
    }

    // f ) Получить Ф. И. О. всех сотрудников (вывести в консоль).

    public  static String StringPersonal   (Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println("Сотрудник  " + employee.getName() );
        }

        return null;
    }
}