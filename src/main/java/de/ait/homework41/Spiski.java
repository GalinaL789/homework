package de.ait.homework41;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
public class Spiski {
    public static void main(String[] args) {
        //ArrayList://
        //a. Создайте объект ArrayList<String> с названием countriesList.
        //b. Добавьте в countriesList следующие страны: США, Великобритания, Франция, Чехия, Германия ,Франция
        //c. Выведите на экран размер countriesList.
        //d. Выведите на экран все элементы countriesList в исходном порядке.
        //e. Удалите дубликаты из countriesList и выведите список снова.
        ArrayList<String> countriesList = new ArrayList<>();
        ArrayList<String> countriesList1 = new ArrayList<>();
        countriesList.add("USA");
        countriesList.add("Great Britain");
        countriesList.add("France");
        countriesList.add("Chech Republic");
        countriesList.add("Germany");
        countriesList.add("Great Britain");
        countriesList.add("France");
        System.out.println(countriesList.size());
        System.out.println(countriesList);
        for (String country : countriesList) {
            if(!countriesList1.contains(country))
            {
                countriesList1.add(country);
            }
        }
        System.out.println(countriesList1.size());
        System.out.println(countriesList1);
        //второй способ, создаем HashSet из ArrayList чтобы удалить дупликаты
        HashSet<String> uniqueCountries=new HashSet<>(countriesList);
        countriesList.clear();
        countriesList.addAll(uniqueCountries);
        System.out.println("______________________");
        System.out.println(countriesList);

    }
}
