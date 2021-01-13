package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 7, 1, -15, -22, 55, 35};

        for (int unsortPartIndex = intArray.length - 1; unsortPartIndex > 0; unsortPartIndex--) {
            for (int i = 0; i < unsortPartIndex; i++) {
                if (intArray[i] > intArray[i + 1])
                    swap(intArray, i,i + 1);
            }
        }
        for(int i : intArray){
            System.out.println(i);
        }

    }


    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
            int temp = array[i];
            array[i] = array[j];
            array[j]=temp;
        }
    }


