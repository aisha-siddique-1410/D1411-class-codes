// class Animal {
//     void sound(){
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound(){
//         System.out.println("Dog Barks");
//     }
// }
// class Cat extends Animal {
//      void sound(){
//         System.out.println("Cat meows");
//     }
// }


// public class JavaInheritance {

//     public static void main(String[] args) {
//        Animal a = new Animal();
//        a.sound();

//        Animal b = new Cat();
//        b.sound();  // runtime polymorphism
      
      
//     }
    
// }
// Write a java program to create a bas class employee with fields empid, salary. Create a child class Manager that adds field bonus

// write a method to calculate total salary, dispay salary for 3 emloyees


class Employee {
    int empid;
    int salary;

    Employee(int empid, int salary){
        this.empid = empid;  // this is a reference variable in java that refers to the current object
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee Id : "+empid);
        System.out.println("Base salary "+salary);
    }
}

class Manager extends Employee{
    int bonus;

    Manager(int empid, int salary, int bonus){
        super(empid, salary); // call parent constructor
        this.bonus = bonus;

    }

    int calculatetotalSalary(){
        return salary+bonus;
    }

    void display(){
        System.out.println("Bonus :"+ bonus);
        System.out.println("Total Salary : "+ calculatetotalSalary());
    }
}
public class JavaInheritance{
    public static void main(String[] args) {
        Manager m1 = new Manager(101,50000,10000);
        m1.display();
    }
}