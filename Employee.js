class Emp {
    int eno, age;
    String name;
    

    void setData(int e, int a, String n) {
        eno = e;
        age = a;
        name = n;
    }

    void show() {
        System.out.println("Emp No: " + eno);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}

class Salary extends Emp {
    int basicSalary;

    void setSalary(int s) {
        basicSalary = s;
    }

    void displaySalary() {
        System.out.println("Basic Salary: " + basicSalary);
    }
}

interface Bonus {
    void incentive(int da, int pf, int hra);
}


class SalarySlip extends Salary implements Bonus {
    double netSalary;
    double totalIncentive;

    public void incentive(int da, int pf, int hra) {
        totalIncentive = da + hra - pf;
    }

    void calculateNetSalary(int da, int pf, int hra) {
        incentive(da, pf, hra);
        netSalary = basicSalary + totalIncentive;
    }
    
    void displaySlip() {
        show();
        displaySalary();
        System.out.println("Net Salary: " + netSalary);
      
    }
}

class Employee {
    public static void main(String[] args) {
        SalarySlip emp1 = new SalarySlip();
        emp1.setData(101, 30, "Rahul");
        emp1.setSalary(25000);
        emp1.calculateNetSalary(2000, 1000, 1500);
        emp1.displaySlip();
    }
}
