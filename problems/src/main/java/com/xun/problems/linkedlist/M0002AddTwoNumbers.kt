package com.xun.problems.linkedlist

import com.xun.core.nodes.LinkedListNode

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * l1 = [2,4,3], l2 = [5,6,4] -> [7,0,8]
 * l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] -> [8,9,9,9,0,0,0,1]
 *
 */
class M0002AddTwoNumbers {

    fun addTwoNumbers(l1: LinkedListNode?, l2: LinkedListNode?): LinkedListNode? {
       return helper(l1, l2, 0)
    }

    private fun helper(l1: LinkedListNode?, l2: LinkedListNode?, increment: Int): LinkedListNode? {
        if (l1 == null && l2 == null) {
            if (increment == 0)
                return null
            return LinkedListNode(1)
        }
        val sum = (l1?.value ?: 0) + (l2?.value ?: 0) + increment
        return if (sum > 9) {
            LinkedListNode(sum-10).apply {
                next = helper(l1?.next, l2?.next, 1)
            }
        } else {
            LinkedListNode(sum).apply {
                next = helper(l1?.next, l2?.next, 0)
            }
        }
    }

}