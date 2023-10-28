package de.ait.homework41;

import java.util.HashSet;
import java.util.Set;
public class SpiskiHash {

    public static void main(String[] args) {
        Set<String> countriesSet=new HashSet<>();
        countriesSet.add("USA");
        countriesSet.add("Great Britain");
        countriesSet.add("France");
        countriesSet.add("Chech Republic");
        countriesSet.add("Germany");
        countriesSet.add("Great Britain");
        countriesSet.add("France");
        System.out.println(countriesSet.size());
        System.out.println(countriesSet);
        int i=0;
        if(!countriesSet.contains("Spain")) {
            countriesSet.add("Spain");
        }
        System.out.println(countriesSet);

    }
}
