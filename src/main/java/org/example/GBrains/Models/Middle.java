package org.example.GBrains.Models;

public class Middle extends Worker{

    @Override
    public String toString() {
        return "Сотрудник " + super.getName() + " " + position + " , возраст " + super.getAge() +
                " , зарплата " + wageMiddle + ";";
    }

    private Positions position = Positions.MIDDLE;


    private static double wageMiddle = 50000;

    public Middle(long dateOfBirthYYYYMMDD, String name) {
        super(dateOfBirthYYYYMMDD, name);
    }

    static void setWageMiddle(double wageMiddle) {
        Middle.wageMiddle = wageMiddle;
    }

    public static double getWageMiddle() {
        return wageMiddle;
    }
}
