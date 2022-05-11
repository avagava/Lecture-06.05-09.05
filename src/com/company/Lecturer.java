package com.company;

public class Lecturer extends Person {
    String specialization;
    int salary;

    Lecturer(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
