package org.example.GBrains.Controller;

import org.example.GBrains.Models.*;
import org.example.GBrains.Service.Methods;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {
    Methods methods = new Methods();
    Worker leader1 = new Leader(19850301, "Anna");
    Worker middle1 = new Middle(19900214, "Nikita");
    Worker middle2 = new Middle(19891101, "Rita");
    Worker junior1 = new Junior(19961210, "Vadim");
    Worker junior2 = new Junior(19970728, "Oleg");

    Worker [] workersGroup1 = new Worker[] {leader1, middle1, middle2, junior1, junior2};

    int riseWagePercentage = 10;

    public void run() {
        methods.increaseWageByPercentageForAll(riseWagePercentage, workersGroup1);
        leader1.compareAgeTwoWorkers(junior1, middle1);
        Comparator<Worker> ageComparator = new AgeComparator();
        Arrays.sort(workersGroup1, ageComparator);
        System.out.println("Сортировка сотрудников в группе по возрасту "
                + Arrays.toString(workersGroup1));
    }
}
