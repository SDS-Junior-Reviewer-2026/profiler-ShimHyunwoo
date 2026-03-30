package org.example;

import java.util.ArrayList;

public interface SortServiceLib {
    // 정렬
    void sort(ArrayList<Integer> arr);
    // 교환횟수
    int getChangeCnt();
    // 정렬종류
    SortType getSortType();
}
