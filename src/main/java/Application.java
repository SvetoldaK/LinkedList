import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {

        LinkedList<String> city = new LinkedList<String>();

        city.add("Ростов-на-Дону");
        city.add("Омск");
        city.add("Красноярск");
        city.add("Тамбов");
        city.add("Орск");
        city.addFirst("Москва");
        city.addLast("Челябинск");
        city.add(5, "Санкт-Петербург");

        System.out.println("Лист включает в себя: " + city.size());
        System.out.println(city);
        System.out.println("Дополнительно выведен элемент " + city.get(1));

        city.set(2, "Грозный");
        System.out.println("Элемент изменен");

        if (city.contains("Тамбов")) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("Элемент не найден");
        }

        city.remove("Москва");
        System.out.println("Элемент удален");

        System.out.println("Лист включает в себя: " + city.size());
        System.out.println(city);
    }
}
