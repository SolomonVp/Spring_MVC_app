package com.victor.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String [] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Audi", "model Audi");
        carBrands.put("BMW", "model BMW");
        carBrands.put("Dodge", "model Dodge");

        languageList = new HashMap<>();
        languageList.put("En", "English");
        languageList.put("Fr", "Franche");
        languageList.put("Uk", "Ukrainian");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Map<String, String> getDepartments() {
        return departments;
    }
    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }
    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public Map<String, String> getCarBrands() {
        return carBrands;
    }
    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }
    public String[] getLanguages() {
        return languages;
    }
    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
    public Map<String, String> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + salary + " " + department + "\n";
    }
}
