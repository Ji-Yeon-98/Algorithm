class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var x1 = x.toLong()
        for(i in 0 until n){
            answer = answer.plus(x1)
            x1 += x
        }
        return answer
    }
}

//LongArray(n) { x.toLong() * (it + 1) }
