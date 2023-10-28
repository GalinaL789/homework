package de.ait.homework41;

import java.util.HashMap;
import java.util.Map;
public class SpiskiHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalMap=new HashMap<>();
        capitalMap.put("Chech Republic","Praga");
        capitalMap.put("USA","Wachington");
        capitalMap.put("Great Britain","London");
        capitalMap.put("France","Paris");
        capitalMap.put("Germany","Berlin");
        capitalMap.put("Spain","Madrid");
        System.out.println(capitalMap.size());
        for (Map.Entry<String, String> entry: capitalMap.entrySet())
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());

        }
        System.out.println("------------------------------------");
        capitalMap.put("USA","Sam-Francisco");
        if(!capitalMap.containsKey("Spain"))
        {
            capitalMap.put("Spain", "Madrid");
        }
        for(Map.Entry<String, String> spisok: capitalMap.entrySet())
        {
            System.out.println(spisok.getKey() +" "+ spisok.getValue());
        }

    }
}
