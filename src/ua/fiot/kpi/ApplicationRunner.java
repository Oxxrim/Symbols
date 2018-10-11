package ua.fiot.kpi;

public class ApplicationRunner {

    public static void main(String[] args){

        System.out.println("LAB 2 Variant 11 (Basic)\nOkhrymenko Dmytro IS-61");
        String words = "qwerty, yghujklsds; sagsn: njhbauerh! angjbhsrebh?";
        String symbols = words.replaceAll("[A-Za-z\\s]", "");
        System.out.println("Count of symbols: " + symbols.length());
    }
}
