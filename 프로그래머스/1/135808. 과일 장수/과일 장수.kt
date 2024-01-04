class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        
        var maxscore = score.sorted().reversed()
        var j = 0
        
        for(i in 0 until maxscore.size/m){
            var max = maxscore.slice(0+j until m +j)
            j = m+j
            answer += max[m-1]*m
        }
        
        return answer
    }
}