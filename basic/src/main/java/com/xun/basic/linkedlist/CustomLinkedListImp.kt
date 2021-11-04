package com.xun.basic.linkedlist

import com.xun.core.nodes.LinkedListNode

class CustomLinkedListImp(private var rootNode: LinkedListNode? = null): CustomLinkedList {
    private var size: Int = 0

    override fun getSize(): Int {
        return size
    }

    override fun insert(data: Int) {
        if (rootNode == null) rootNode = LinkedListNode(data)
        else insertBeginning(data = data)
        size++
    }

    private fun insertBeginning(data: Int) {
        val node = LinkedListNode(data)
        node.next = rootNode
        rootNode = node
    }

    private fun insertEnd(current: LinkedListNode, data: Int) {
        val nextNode = current.next
        if (nextNode == null) current.next = LinkedListNode(data)
        else insertEnd(nextNode, data)
    }

    override fun remove(data: Int) {
        rootNode?.let {
            if (it.value == data) {
                rootNode = null
                size = 0
            } else removeTarget(it, it.next, data)
        }
    }

    private fun removeTarget(prev: LinkedListNode, current: LinkedListNode?, data: Int) {
        if (current == null) return

        if (current.value == data) {
            prev.next = current.next
            size--
            return
        }

        removeTarget(current, current.next, data)
    }

    override fun traverse() {
        traverseNext(rootNode)
    }

    private fun traverseNext(currentNode: LinkedListNode?) {
        if (currentNode == null) return
        print(currentNode)
        traverseNext(currentNode.next)
    }
}