class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;

    public void printSalary(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(number);
        System.out.println(address);
        System.out.println(salary);

    }

}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

public class Q2 {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.name = "xyz";
        e.age = 23;
        e.number = "986****";
        e.address = "xyzxyz";
        e.salary = 1231;
        e.specialization = "xyzxyz";

        Manager m = new Manager();
        m.name = "abc";
        m.age = 30;
        m.number = "618****";
        m.address = "xyzxyz";
        m.salary = 7890;
        m.department = "bygbyz";
        {
            System.out.println("Employee Details");

            System.out.println("name: "+e.name);
            System.out.println("age: "+e.age);
            System.out.println("number: "+e.number);
            System.out.println("address:"+e.address);
            System.out.println("salary: "+e.salary);
            System.out.println("specialization: "+  e.specialization);

            System.out.println("Manager Details");

            System.out.println("name: "+m.name);
            System.out.println("age: "+m.age);
            System.out.println("number: "+m.number);
            System.out.println("address :"+m.address);
            System.out.println("salary :"+m.salary);
            System.out.println("department: "+m.department);

        }

    }
}



