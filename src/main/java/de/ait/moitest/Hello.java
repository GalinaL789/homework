package de.ait.moitest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
    private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);
    public static void test(){
        LOGGER.info("просто тест");
    }
    public static void main(String[] args) {
        test();
        System.out.println("просто тест");
    }
}