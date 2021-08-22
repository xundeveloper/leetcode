package com.xun.core.nodes

data class BinaryTreeNode(
    val value: Int,
    var left: BinaryTreeNode? = null,
    var right: BinaryTreeNode? = null
)