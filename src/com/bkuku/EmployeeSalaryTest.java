package com.bkuku;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeSalaryTest {

    Employee employeeSalary = new Employee("Tee", "Kuku", 150000.00);
    Employee employeeSalary2 = new Employee("Tunde", "Omotosho", 17000.00);

    @Test
    public void testForEmployeeFirstName(){
        assertEquals("Tunde", employeeSalary2.getFirstName());
    }
    @Test
    public void testFoEmployreeLastName(){
        assertEquals("Omotosho" , employeeSalary2.getLastName());
    }

    @Test
    public void testForFirstEmployeeFirstName(){
        assertEquals("Tee" , employeeSalary.getFirstName());
    }


    @Test
    public void testForFirstEmployeeLastName(){
        assertEquals("Kuku", employeeSalary.getLastName());
    }

    @Test
    public void testForEmployeeMonthlySalary(){
        assertEquals(150000.00 ,employeeSalary.getMonthlySalary(), 0);

    }
    @Test
    public void testForSecondEmployeeMonthlySalary(){
        assertEquals(17000.00, employeeSalary2.getMonthlySalary(), 0);

    }

    @Test
    public void testThatEmployeeCanSetFirstName(){
        employeeSalary.setFirstName("Inaolaji");
        assertEquals( "Inaolaji", employeeSalary.getFirstName());
    }
    @Test
    public void testThatEmployeeCansetLastname(){
        employeeSalary.setLastName("Sanni");
        assertEquals("Sanni" , employeeSalary.getLastName());
    }

    @Test
    public void testThatEmployeeCanSetMonthlySalary(){
        employeeSalary.setMonthlySalary(50000.00);
        assertEquals(50000.00 , employeeSalary.getMonthlySalary(), 0);
    }
    @Test
    public void testThatEmployeeCanGetYearlySalary(){
        assertEquals("",1_800_000, employeeSalary.getYearlySalary(), 0.00001);
    }
    @Test
    public void testThatSecondEmployeeCanGetYearlySalary(){
        assertEquals(204_000.00, employeeSalary2.getYearlySalary(), 0.00001);

    }
    @Test
    public void testThatEmployeeCanGetARaise(){
        employeeSalary.salaryRaise(10.0);
        assertEquals(1_800_000 , employeeSalary.getYearlySalary(), 0.0001);
        assertEquals(204_000 , employeeSalary2.getYearlySalary(), .00001);
    }



}


