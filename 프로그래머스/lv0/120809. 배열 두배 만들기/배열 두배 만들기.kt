class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: MutableList<Int> = mutableListOf<Int>()
        for (number in numbers){
            var renumber = number*2
            answer.add(renumber)
        }

        return answer.toIntArray()
    }
}