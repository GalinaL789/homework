/*package de.ait.homework53;
import java.util.HashSet;
import java.util.Set;
//Создайте EnumMap<FashionCategory, Set<FashionItem>>,
// чтобы хранить модные товары, сгруппированные по категориям.
//Для каждой категории используйте EnumSet<Season>, чтобы отслеживать сезоны,
// в которые товары особенно популярны.

import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {
        FashionItem fashionItem1 = new FashionItem("Пальто",150.00, FashionCategory.ОДЕЖДА,Seasons.WINTER);
        FashionItem fashionItem2 = new FashionItem("Куртка",75.00, FashionCategory.ОДЕЖДА,Seasons.AUTUMN);
        FashionItem fashionItem3 = new FashionItem("T-shirt",20.00, FashionCategory.ОДЕЖДА,Seasons.SUMMER);
        Set<FashionItem> fashionItems= new HashSet<>();
        fashionItems.add(fashionItem1);
        fashionItems.add(fashionItem2);
        fashionItems.add(fashionItem3);

        EnumMap<FashionCategory, Set<FashionItem>> fashionCategorySetEnumMap= new EnumMap<>(FashionItem.class);

        fashionCategorySetEnumMap.put(FashionCategory.ОДЕЖДА,"одежда");
        fashionCategorySetEnumMap.put(FashionCategory.ОБУВЬ,"обувь");
        fashionCategorySetEnumMap.put(FashionCategory.АКСЕССУАРЫ,"аксессуары);

    }
}
*/