package com.company;

public final class Employee {

    private final String employeeName;

    private final String employeeSecondName;

    public Employee(String employeeName, String employeeSecondName) {
        this.employeeName = employeeName;
        this.employeeSecondName = employeeSecondName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSecondName() {
        return employeeSecondName;
    }
}
