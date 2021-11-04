package com.xun.core.nodes

data class LinkedListNode(var value: Int, var next: LinkedListNode? = null) {
    override fun toString(): String {
        return if (next == null) "$value\n"
        else "$value->"
    }
}