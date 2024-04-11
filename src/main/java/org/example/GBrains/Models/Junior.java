package org.example.GBrains.Models;

public class Junior extends Worker{

    @Override
    public String toString() {
        return "Сотрудник " + super.getName() + " " + position + " , возраст " + super.getAge() +
                " , зарплата " + wageJunior + ";";
    }

    private Positions position = Positions.JUNIOR;

    public Junior(long dateOfBirthYYYYMMDD, String name) {
        super(dateOfBirthYYYYMMDD, name);
    }

    public static double getWageJunior() {
        return wageJunior;
    }

    static void setWageJunior(double wageJunior) {
        Junior.wageJunior = wageJunior;
    }

    private static double wageJunior = 25000;

}
