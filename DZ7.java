// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.List;
import java.util.Scanner; 

public class DZ7 {
        public static void DZ7(String[] args) {
        Notebook ACER = new Notebook("ACER", "Black", 15.6, "LCD", 8, 256, "SSD");
        Notebook Samsung = new Notebook("Samsung", "Black", 15.6, "LCD", 8, 512, "SSD");
        Notebook Samsung = new Notebook("Samsung", "Green", 17.0, "TFT", 16, 512, "SSD");
        Notebook Asus = new Notebook("ASUS", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        Notebook Asus = new Notebook("ASUS", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<Notebook> notebookList = List.of(ACER, Samsung, Samsung, Asus, Asus);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }
        } else if (choiceUserSearch == 2){
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } 
        else { System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }
        scannerUser.close();
    }
}

