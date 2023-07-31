class Solution {
    fun solution(array: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var count = 1

        for (num in array) {
            if (map.containsKey(num)) {
                map[num] = map[num]!! + 1
            } else {
                map[num] = 1
            }
        }

        val maxCount = map.values.maxOrNull() ?: 0
        val elementsWithMaxCount = map.entries.filter { it.value == maxCount }.map { it.key }

        return if (elementsWithMaxCount.size > 1) {
            -1
        } else {
            elementsWithMaxCount.firstOrNull() ?: -1
        }
    }
}