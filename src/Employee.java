import java.util.Objects;
// 1. Создать класс Employee, который содержит информацию о Ф.И.О, отделе и зарплате сотрудника.
public class Employee {
    private String name; /*Имя сотрудника*/
    private int department; /* отдел сотрудника*/
    private double salary; /*Зарплата сотрудника*/
    // 2.   Добавить статическую переменную-счетчик, которая будет отвечать за id.
    static int counter=1;
    private int id;
    //     /*Первый конструктор*/
    public  Employee ( String name, int department, double salary){
        /*Инициализируем поля*/
//          По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
        this.name = name;
        this.department = department;
        this.salary = salary;
//        Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        id = counter++;
    }
    //    Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    //    Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
