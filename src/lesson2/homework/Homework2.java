package lesson2.homework;

public class Homework2 {
    public static void main(String[] args) {
        int ageChildren = 10;

        if (ageChildren <=6) {
            System.out.println("Пошел в садик");
        } else if (ageChildren <=11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren <=17) {
            System.out.println("Пошел в среднюю школу");
        } else {
            System.out.println("Пошел в университет");
        }
    }
}
