import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int[] arabians = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner s = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию в формате a (*,/,+,-) b, где 0<a<=10 и 0<b<=10");
        String usersInput = s.nextLine();
        usersInput = usersInput.replaceAll(" ", "");
        String[] operator = {"+", "-", "/", "*"};
        String plus = new String("+");
        String minus;
        minus = new String("-");
        String division = new String("/");
        String multiplication = new String("*");
        if (usersInput.contains(plus)) {
            try {
                int positionOperator = usersInput.indexOf("+");
                String firstNumber = usersInput.substring(0, positionOperator);
                String secondNumber = usersInput.substring(++positionOperator, usersInput.length());
                String romeNumbers = ("I II III IV V VI VII VIII IX X");
                if (romeNumbers.contains(firstNumber) && romeNumbers.contains(secondNumber)) {
                    Rome rome1 = Rome.valueOf(firstNumber);
                    Rome rome2 = Rome.valueOf(secondNumber);
                    int aRome = Integer.parseInt(rome1.toString());
                    int bRome = Integer.parseInt(rome2.toString());
                    if (aRome > 0 && aRome < 11 && bRome > 0 && bRome < 11) {
                        int result = aRome + bRome;
                        ResultArab resultArab1 = new ResultArab();
                        resultArab1.result = result;
                        resultArab1.speak();
                    }
                } else {
                    try {
                        int a = Integer.parseInt(firstNumber);
                        int b = Integer.parseInt(secondNumber);
                        if (a > 0 && a < 11 && b > 0 && b < 11) {
                            int result = a + b;
                            System.out.println(result);
                        } else {
                            System.out.println("Введены некорректные значения чисел");}
                    } catch (NumberFormatException e) {
                        System.out.println("Введенная операция не соответствует условиям");}
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Введенная операция не соответствует условиям");}
        }
        else if (usersInput.contains(minus)) {
            try {
                int positionOperator = usersInput.indexOf("-");
                String firstNumber = usersInput.substring(0, positionOperator);
                String secondNumber = usersInput.substring(++positionOperator, usersInput.length());
                String romeNumbers = ("I II III IV V VI VII VIII IX X");
                if (romeNumbers.contains(firstNumber) && romeNumbers.contains(secondNumber)) {
                    Rome rome1 = Rome.valueOf(firstNumber);
                    Rome rome2 = Rome.valueOf(secondNumber);
                    int aRome = Integer.parseInt(rome1.toString());
                    int bRome = Integer.parseInt(rome2.toString());
                    if (aRome > 0 && aRome < 11 && bRome > 0 && bRome < 11) {
                        int result = aRome - bRome;
                        if (result > 0) {
                            ResultArab resultArab1 = new ResultArab();
                            resultArab1.result = result;
                            resultArab1.speak();
                        } else {
                            System.out.println("В римской системе нет целых чисел меньше I.");}
                    }
                } else {
                    try {
                        int a = Integer.parseInt(firstNumber);
                        int b = Integer.parseInt(secondNumber);
                        if (a > 0 && a < 11 && b > 0 && b < 11) {
                            int result = a - b;
                            System.out.println(result);
                        } else {
                            System.out.println("Введены некорректные значения чисел");}
                    } catch (NumberFormatException e) {
                        System.out.println("Введенная операция не соответствует условиям");}
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Введенная операция не соответствует условиям");}
        }
        else if (usersInput.contains(division)) {
            try {
                int positionOperator = usersInput.indexOf("/");
                String firstNumber = usersInput.substring(0, positionOperator);
                String secondNumber = usersInput.substring(++positionOperator, usersInput.length());
                String romeNumbers = ("I II III IV V VI VII VIII IX X");
                if (romeNumbers.contains(firstNumber) && romeNumbers.contains(secondNumber)) {
                    Rome rome1 = Rome.valueOf(firstNumber);
                    Rome rome2 = Rome.valueOf(secondNumber);
                    int aRome = Integer.parseInt(rome1.toString());
                    int bRome = Integer.parseInt(rome2.toString());
                    if (aRome > 0 && aRome < 11 && bRome > 0 && bRome < 11) {
                        int result = aRome / bRome;
                        if (result > 0) {
                            ResultArab resultArab1 = new ResultArab();
                            resultArab1.result = result;
                            resultArab1.speak();
                    } else {
                        System.out.println("В римской системе нет целых чисел меньше I.");}
                    }
                } else {
                    try {
                        int a = Integer.parseInt(firstNumber);
                        int b = Integer.parseInt(secondNumber);
                        if (a > 0 && a < 11 && b > 0 && b < 11) {
                            int result = a / b;
                            System.out.println(result);
                        } else {
                            System.out.println("Введены некорректные значения чисел");}
                    } catch (NumberFormatException e) {
                        System.out.println("Введенная операция не соответствует условиям");}
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Введенная операция не соответствует условиям");}
        }
        else if (usersInput.contains(multiplication)) {
            try {
                int positionOperator = usersInput.indexOf("*");
                String firstNumber = usersInput.substring(0, positionOperator);
                String secondNumber = usersInput.substring(++positionOperator, usersInput.length());
                String romeNumbers = ("I II III IV V VI VII VIII IX X");
                if (romeNumbers.contains(firstNumber) && romeNumbers.contains(secondNumber)) {
                    Rome rome1 = Rome.valueOf(firstNumber);
                    Rome rome2 = Rome.valueOf(secondNumber);
                    int aRome = Integer.parseInt(rome1.toString());
                    int bRome = Integer.parseInt(rome2.toString());
                    if (aRome > 0 && aRome < 11 && bRome > 0 && bRome < 11) {
                        int result = aRome * bRome;
                        ResultArab resultArab1 = new ResultArab();
                        resultArab1.result = result;
                        resultArab1.speak();
                    }
                } else {
                    try {
                        int a = Integer.parseInt(firstNumber);
                        int b = Integer.parseInt(secondNumber);
                        if (a > 0 && a < 11 && b > 0 && b < 11) {
                            int result = a * b;
                            System.out.println(result);
                        } else {
                            System.out.println("Введены некорректные значения чисел");}
                    } catch (NumberFormatException e) {
                        System.out.println("Введенная операция не соответствует условиям");}
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Введенная операция не соответствует условиям");}
        }
        else {
            System.out.println("Введенная операция не соответствует условиям");}
    }
}

class ResultArab{ // Translate from arabian to roman
    int result;
    void speak(){
        String resultRome = "";
        while (result >= 100) {
            resultRome += "C";
            result -= 100;}
        while (result >= 90) {
            resultRome += "XC";
            result -= 90;}
        while (result >= 50) {
            resultRome += "L";
            result -= 50;}
        while (result >= 40) {
            resultRome += "XL";
            result -= 40;}
        while (result >= 10) {
            resultRome += "X";
            result -= 10; }
        while (result >= 9) {
            resultRome += "IX";
            result -= 9;}
        while (result >= 5) {
            resultRome += "V";
            result -= 5;}
        while (result >= 4) {
            resultRome += "IV";
            result -= 4;}
        while (result >= 1) {
            resultRome += "I";
            result -= 1;}
        System.out.println(resultRome);

    }
}