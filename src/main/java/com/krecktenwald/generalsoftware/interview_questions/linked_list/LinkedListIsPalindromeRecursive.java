package com.krecktenwald.generalsoftware.interview_questions.linked_list;

import com.krecktenwald.generalsoftware.ListNode;

/**
 * The {@code LinkedListIsPalindromeRecursive} class determines whether a given linked list
 * is a palindrome using a recursive approach.
 * <p>
 * A palindrome is a sequence of characters that reads the same forward as backward.
 * In the context of a linked list, a palindrome is a list that remains the same when
 * reversed.
 * </p>
 * <p>
 * This class uses a recursive method to check whether the linked list is a palindrome.
 * </p>
 */
public class LinkedListIsPalindromeRecursive {

    /*
     * * Initialize a frontPointer reference to maintain
     *   a reference to the first node until the end of
     *   the list is reached recursively
     */
    private ListNode frontPointer;

    /**
     * Determines whether the given linked list is a palindrome.
     *
     * @param head the head of the linked list to be checked
     * @return {@code true} if the linked list is a palindrome, {@code false} otherwise
     */
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;

        return recursivelyCheck(head);
    }

    /**
     * Recursively checks whether the linked list is a palindrome.
     *
     * @param currentNode the current node in the linked list being checked
     * @return {@code true} if the linked list is a palindrome, {@code false} otherwise
     */
    private boolean recursivelyCheck(ListNode currentNode) {
        /*
         * * Recursively call recursivelyCheck until the currentNode
         *   is null (end of list)
         * * Return true when currentNode is null, then compare the
         *   currentNode value with the frontPointer value
         * * Move the frontPointer up one node, then return true
         *   to the previous stack frame, where the currentNode
         *   is moved back
         * * If the frontPointer makes it to the end, and the
         *   currentNode makes it to the beginning without
         *   any inequalities, true is returned
         */
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)){
                return false;
            }
            if (currentNode.val != frontPointer.val){
                return false;
            }

            frontPointer = frontPointer.next;
        }

        return true;
    }
}
