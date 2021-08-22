package com.xun.problems.twopointers

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
 */
class E0001TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexMap = mutableMapOf<Int, Int>()
        val result = IntArray(2)
        for ((i, v) in nums.withIndex()) {
            val value = indexMap[v]
            if (value != null) {
                result[0] = value
                result[1] = i
                break
            }
            indexMap[target-v] = i // save it in key: gap, value: index of current element
        }
        return result
    }

}