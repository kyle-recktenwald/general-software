package com.krecktenwald.generalsoftware.interview_questions;

import com.krecktenwald.generalsoftware.GeneralSoftwareApplication;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arrays {


    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int num = entry.getKey();
            if (map2.containsKey(num)) {
                System.out.printf("Comparing %d to %d %n", entry.getValue(), map2.get(num));
                int count = Math.min(entry.getValue(), map2.get(num));
                for (int i = 0; i < count; i++) {
                    intersection.add(num);
                }
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

}
