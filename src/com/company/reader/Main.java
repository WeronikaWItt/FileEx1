package com.company.reader;

public class Main {

    public static void main(String[] args) {
        String content = FileUtils.getContent("test.txt");
        System.out.println("białe znaki = " + TextStatistics.getWhiteCharsCount(content));
        System.out.println("znaki = " + TextStatistics.getCharsCount(content));
        System.out.println("słowa = " + TextStatistics.getWordsCount(content));
    }

}
