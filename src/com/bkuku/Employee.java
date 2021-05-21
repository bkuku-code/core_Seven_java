package com.bkuku;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yealySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;

    }

    public double getYearlySalary(){
        return this.monthlySalary * 12;
    }

    public double salaryRaise(double percentageRaise){
        return this.yealySalary * (1+ percentageRaise/100);


    }
}
