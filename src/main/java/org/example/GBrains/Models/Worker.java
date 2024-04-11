package org.example.GBrains.Models;

import org.example.GBrains.Service.Methods;

import java.time.LocalDate;
import java.time.Period;

public abstract class Worker {
    private Integer age;
    private String name;

    public String getName() {
        return name;
    }

    public Worker(long dateOfBirthYYYYMMDD, String name) {
        Methods methods = new Methods();
        this.age = Period.between(methods.frLongToLocalDate (dateOfBirthYYYYMMDD),
                LocalDate.now()).getYears();
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void compareAgeTwoWorkers (Worker worker1, Worker worker2) {
        int result = worker1.getAge().compareTo(worker2.getAge());
        System.out.println("------------------------------------");
        if (result == 0) {
            System.out.println("Два работника одного возраста.");
        } else if (result == 1) {
            System.out.println("Работник " + worker1.getName() + " старше, чем " + worker2.getName());
        } else {
            System.out.println("Работник " + worker1.getName() + " младше, чем " + worker2.getName());
        }
        System.out.println("------------------------------------");
    }
}
