package com.krecktenwald.generalsoftware;

import com.krecktenwald.generalsoftware.interview_questions.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneralSoftwareApplication {
  public static void main(String[] args) {
    Arrays arrays = new Arrays();

    int[] nums1 = new int[]{1,2,2,1};
    int[] nums2 = new int[]{2, 2, 2, 2};

    arrays.intersect(nums1, nums2);

    //SpringApplication.run(GeneralSoftwareApplication.class, args);
  }
}
