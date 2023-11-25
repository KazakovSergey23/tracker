package ru.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String n = System.lineSeparator();
        return "{" + n + "\t\"name\" : " + "\"" + name + "\"" + "," + n
                + "\t\"body\" : " + "\"" +  body + "\"" + n
                + "}";
    }

    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        System.out.println(jsonReport.generate("2", "3"));
    }
}
