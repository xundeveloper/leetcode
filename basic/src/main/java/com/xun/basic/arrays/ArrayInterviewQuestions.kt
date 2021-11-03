package com.xun.basic.arrays

class ArrayInterviewQuestions {
    /**
     * The problem is that we want to reverse a T[] array in O(N) linear time complexity and we
     * want the algorithm to be in-place as well - so the algorithm can not use additional memory!
     * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
     */
    fun reverseArray(input: Array<Int>): Array<Int> {
        if (input.size < 2) return input
        var start = 0
        var end = input.size - 1
        while (start < end) {
            val startVal = input[start]
            input[start] = input[end]
            input[end] = startVal
            start++
            end--
        }
        return input
    }

    /**
     * Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not
     * For example: restful and fluster are anagrams.
     */
    fun isAnagrams(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) return false

        if (str1.isEmpty() && str2.isEmpty()) return true

        val letters = IntArray(26)
        for (char in str1) {
            val index = char.code - 97
            letters[index] = 1
        }
        for (char in str2) {
            val index = char.code - 97
            if (letters[index] == 0) return false
        }

        return true
    }
}