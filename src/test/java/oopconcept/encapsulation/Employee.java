package oopconcept.encapsulation;

public class Employee {
    private String name;
    private int salary;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public Employee(String, int, String){
//        this.name = name;
//        this.salary = salary;
//        this.id = id;
//
        public String EmployeeInformation(){
            return "Employee name is"+name+",amd his salary is"+salary+" and this id"+id;
        }
        public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("hem raj ");
        employee1.setId("hemu");
        employee1.setSalary(50000);
            System.out.println(employee1.EmployeeInformation());
            System.out.println(employee1.getName());
            System.out.println(employee1.getId());
            System.out.println(employee1.getSalary());
        }

    }

