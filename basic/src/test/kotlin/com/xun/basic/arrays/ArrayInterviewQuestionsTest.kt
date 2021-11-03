package com.xun.basic.arrays

import junit.framework.TestCase.assertEquals
import org.junit.Test

internal class ArrayInterviewQuestionsTest {
    private val arrayInterviewQuestions = ArrayInterviewQuestions()

    @Test
    fun `when invoke reverseArray then return correct reversed array`() {
        // given
        val testData = listOf(
            arrayOf(0),
            arrayOf(0, 1),
            arrayOf(0, 1, 2),
            arrayOf(0, 1, 2, 3)
        )
        val expectedData = listOf(
            arrayOf(0),
            arrayOf(1, 0),
            arrayOf(2, 1, 0),
            arrayOf(3, 2, 1, 0)
        )
        for ((i, input) in testData.withIndex()) {
            // when
            val actual = arrayInterviewQuestions.reverseArray(input)
            val expect = expectedData[i]
            // then
            for (j in actual.indices) {
                assertEquals(expect[j], actual[j])
            }
        }
    }

    @Test
    fun `when invoke isAnagrams then return correct boolean`() {
        // given
        val testData = listOf(
            Pair("abc", "cba"),
            Pair("aa", "an"),
            Pair("aaa", "aa"),
            Pair("res tful", "flu ster")
        )
        val expectedData = listOf(true, false, false, true)
        for ((i, input) in testData.withIndex()) {
            // when
            val actual = arrayInterviewQuestions.isAnagrams(input.first, input.second)
            val expect = expectedData[i]
            // then
            assertEquals(expect, actual)
        }

    }
}