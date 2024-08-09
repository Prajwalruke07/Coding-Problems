import java.util.ArrayList;
import java.util.List;

public class Test {

    static class Person {
        private String name;
        private String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void Test(String name, String age) {
            this.name = name;
            this.age = age;
        }
    }
    static class Employee {
        private String name;
        private int age;
        private double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

    public class Main {
        public static void main(String[] args) {

            Person person1 = new Person("Sam",20);
            Person person2 = new Person("Raj" , 24);

            Employee employee1 = new Employee(person1.name,person1.age,100000);
            Employee employee2 = new Employee(person1.name, person2.age,110000);

            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee1);
            employeeList.add(employee2);

            for (Employee employee : employeeList){

            }
        }
    }
}
