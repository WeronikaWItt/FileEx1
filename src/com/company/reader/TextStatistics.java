package com.company.reader;

/**
 * All rights reserved & copyright ©
 */
class TextStatistics {

    static int getCharsCount(String text) {
        return text.length();
    }

    static int getWhiteCharsCount(String text) {
        String withoutWhiteCharacters = text.replaceAll("\\s+", "");
        return text.length() - withoutWhiteCharacters.length();
    }

    static int getWordsCount(String text) {
        String[] words = text.split("\\W+");
        return words.length;
    }

}
