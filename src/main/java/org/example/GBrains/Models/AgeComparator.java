package org.example.GBrains.Models;

import java.util.Comparator;

public class AgeComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.getAge() - w2.getAge();
    }
}
