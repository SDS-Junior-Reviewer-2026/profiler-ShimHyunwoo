package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Profiler profiler = new Profiler();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 2, 4, 1, 1, 3, 9));

        // Input Data 세팅
        profiler.setData(input);
        // Sort Lib 세팅
        profiler.setLib(new SelectionSort());
        // 정렬
        profiler.runLib();
        // 결과 출력
        profiler.showResult();
    }
}