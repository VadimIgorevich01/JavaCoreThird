package org.example.GBrains.Models;

public class Leader extends Worker{

    @Override
    public String toString() {
        return "Сотрудник " + super.getName() + " " + position + " , возраст " + super.getAge() +
                " , зарплата " + wageLeader + ";";
    }

    private Positions position = Positions.LEADER;

    private static double wageLeader = 100000;

    public Leader(long dateOfBirthYYYYMMDD, String name) {
        super(dateOfBirthYYYYMMDD, name);
    }

    public static double getWageLeader() {
        return wageLeader;
    }

    static void setWageLeader(double wageLeader) {
        Leader.wageLeader = wageLeader;
    }


    public static void increaseWageByPercentageForAll(int percentageOfRise) {
        System.out.println("------------------------------------");
        System.out.println("Повышаем зарплату у всех сотрудников всех позиций, кроме Leader на "
                + percentageOfRise + "%");
        System.out.println("------------------------------------");
        Middle.setWageMiddle (Middle.getWageMiddle() * (double) (100 + percentageOfRise) / 100);
        Middle.setWageMiddle (Math.round(Middle.getWageMiddle() * 100.0) / 100.0);
        Junior.setWageJunior(Junior.getWageJunior() * (double) (100 + percentageOfRise) / 100);
        Junior.setWageJunior(Math.round(Junior.getWageJunior() * 100.0) / 100.0);

    }
}
