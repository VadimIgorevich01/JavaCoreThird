package org.example.GBrains.Service;

import org.example.GBrains.Models.Junior;
import org.example.GBrains.Models.Leader;
import org.example.GBrains.Models.Middle;
import org.example.GBrains.Models.Worker;

import java.time.LocalDate;

public class Methods {

    public LocalDate frLongToLocalDate(long dateOfBirth) {
        int arrayLength = String.valueOf(Math.abs(dateOfBirth)).length();
        long[] array = new long[arrayLength];
        long tempNumber = dateOfBirth;
        for (int i = arrayLength - 1; i > -1; i--) {
            array[i] = tempNumber%10;
            tempNumber = tempNumber /10;
        }

        String yearStr = "";
        for (int i = 0; i < 4; i++) {
            yearStr += array[i];
        }
        int year = Integer.parseInt(yearStr);

        int month;
        if (array[4] == 0) {
            month = (int) array[5];
        } else {
            String monthStr = "";
            for (int i = 4; i < 6; i++) {
                monthStr += array[i];
            }
            month = Integer.parseInt(monthStr);
        }

        int day;
        if (array[6] == 0) {
            day = (int) array[7];
        } else {
            String dayStr = "";
            for (int i = 6; i < array.length; i++) {
                dayStr += array[i];
            }
            day = Integer.parseInt(dayStr);
        }

        LocalDate dateOfBirthLocal = LocalDate.of(year, month, day);
        return dateOfBirthLocal;
    }

    public void increaseWageByPercentageForAll(int riseWagePercentage, Worker [] workersGroup1) {
        for (int i = 0; i < workersGroup1.length; i++) {
            if (workersGroup1[i] instanceof Leader) {
                System.out.println("Зарплата Leader " + workersGroup1[i].getName() +
                        " до общего повышения = " + ((Leader) workersGroup1[i]).getWageLeader());
            } else if (workersGroup1 [i] instanceof Middle) {
                System.out.println("Зарплата Middle " + workersGroup1[i].getName() +
                        "  до общего повышения = " + ((Middle) workersGroup1[i]).getWageMiddle());
            } else {
                System.out.println("Зарплата Junior " + workersGroup1[i].getName() +
                        "  до общего повышения = " + ((Junior) workersGroup1[i]).getWageJunior());
            }
        }
        Leader.increaseWageByPercentageForAll(10);
        for (int i = 0; i < workersGroup1.length; i++) {
            if (workersGroup1[i] instanceof Leader) {
                System.out.println("Зарплата Leader " + workersGroup1[i].getName() +
                        " после общего повышения = " + ((Leader) workersGroup1[i]).getWageLeader());
            } else if (workersGroup1 [i] instanceof Middle) {
                System.out.println("Зарплата Middle " + workersGroup1[i].getName() +
                        "  после общего повышения = " + ((Middle) workersGroup1[i]).getWageMiddle());
            } else {
                System.out.println("Зарплата Junior " + workersGroup1[i].getName() +
                        "  после общего повышения = " + ((Junior) workersGroup1[i]).getWageJunior());
            }
        }
    }
}
