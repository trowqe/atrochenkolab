package com.bsuir.lab1;

import java.util.Arrays;

public class Utils {

    public boolean validateStringWithNumbers(String numbersString) {
        String[] numbersStrings = numbersString.split(",");
        for (String str : numbersStrings
        ) {
            if (!isNumber(str)) {
                return false;
            }
        }
        return true;
    }

    private float[] convertStringWithNumbersLoFloatArray(String numbersString) {
        String[] numbersStrings = numbersString.split(",");
        int size = numbersStrings.length;
        float[] numbers = new float[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = parseFloat(numbersStrings[i]);
        }
        return numbers;
    }

    public float[] convertStringWithNumbersLoFloatArrayAndSort(String numbersString) {
        float[] numbers = convertStringWithNumbersLoFloatArray(numbersString);
        return sort(numbers);
    }


    private boolean isNumber(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private float parseFloat(String string) {
        return Float.parseFloat(string);
    }

    private float[] sort(float[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
