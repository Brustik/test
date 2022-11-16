package lesson2.homework;

public class Homework3 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        boolean caesar = chicken && vegetables && sour && toast;
        boolean olivier = (chicken || sausage) && vegetables && eggs;
        boolean vegetableSalad = vegetables;

        if (caesar)  {
            System.out.println("Повар делает салат Цезарь");
        } else if (olivier)  {
            System.out.println("Повар делает салат Оливье");
        } else if (vegetableSalad)  {
            System.out.println("Повар делает салат Овощной");
        } else {
            System.out.println("Повар объявляет 'У меня ничего нет'");
        }


    }
}
