package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.print("Which percentage ti increase the salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
    }
}
