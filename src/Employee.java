public class Employee {
    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int GetAge() {
        return age;
    }


    void Show() {
        System.out.printf("name:%s, position:%s, email:%s, phoneNumber:%d, salary:%d, age:%d %n",
                name, position, email, phoneNumber, salary, age);
    }

}


