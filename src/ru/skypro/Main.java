package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // 1st
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // 2nd
        String fullNameUp = lastName + " " + firstName + " " + middleName;
        String fullNameUp1 = fullNameUp.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp1);

        //3rd
        String nameReplace = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + nameReplace);

        // 4th v1
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " +fullName2);


        //4th v2 почему печает "данные фио сотрудника" каждый раз с letter?
        String fullNameNew = "Иванов Семён Семёнович";
        String[] letterNew = fullNameNew.split(" ");
        for (String letter : letterNew) {
            if (letter.contains("ё"))
                System.out.println();
            {
                letter = letter.replace("ё", "е");
            }
            System.out.print("Данные ФИО сотрудника — " + letter);
        }
    }
}