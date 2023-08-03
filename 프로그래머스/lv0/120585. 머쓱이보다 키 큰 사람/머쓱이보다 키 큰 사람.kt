class Solution {
    fun solution(array: IntArray, height: Int): Int {
        val result = array.filter { it -> it > height}
        return result.size
    }
}