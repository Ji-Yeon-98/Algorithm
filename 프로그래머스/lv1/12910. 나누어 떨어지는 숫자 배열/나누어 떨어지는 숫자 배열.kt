class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = arr.filter { it -> it % divisor == 0 }.sorted().toIntArray()
        if (answer.size == 0){
            answer = answer.plus(-1)
        }
        
        return answer
    }
}