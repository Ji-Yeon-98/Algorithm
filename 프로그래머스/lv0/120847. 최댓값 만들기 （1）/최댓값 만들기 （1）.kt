class Solution {
    fun solution(numbers: IntArray): Int {
        var numberlist = numbers.sorted().reversed()
        var answer = numberlist[0]*numberlist[1]
        return answer
    }
}