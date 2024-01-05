package com.krecktenwald.generalsoftware;

import com.krecktenwald.generalsoftware.interview_questions.Arrays;
import com.krecktenwald.generalsoftware.interview_questions.LinkedList.LinkedLists;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneralSoftwareApplication {
  public static void main(String[] args) {
    Arrays arrays = new Arrays();
    LinkedLists linkedLists = new LinkedLists();

    int[] nums1 = new int[]{1,2,2,1};
    int[] nums2 = new int[]{2, 2, 2, 2};

    //arrays.intersect(nums1, nums2);

    //SpringApplication.run(GeneralSoftwareApplication.class, args);
    //ListNode listNode5 = new ListNode(5, null);
    //ListNode listNode4 = new ListNode(4, listNode5);
    //ListNode listNode3 = new ListNode(3, listNode4);
    ListNode listNode2 = new ListNode(2, null);
    ListNode head = new ListNode(1, listNode2);

    linkedLists.reverseList(head);
  }
}
